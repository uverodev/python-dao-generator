from operator import length_hint
import pymysql
import os
import errno
import time
inicio = time.time()


try:
    os.mkdir('DAO')
except OSError as e:
    if e.errno != errno.EEXIST:
        raise

try:
    os.mkdir('Modelo')
except OSError as e:
    if e.errno != errno.EEXIST:
        raise

        

db_name = 'farmacia'


class DataBase:
    def __init__(self) -> None:
        self.connection = pymysql.connect(
            host='localhost',
            user='root',
            password='',
            db=db_name
        )

        self.cursor = self.connection.cursor()
        print("Conexion establecida")

    def getTables(self, condicion):
        sql = "SELECT table_name FROM information_schema.tables WHERE  table_schema = '{}' {}".format(
            db_name, condicion)
        try:
            self.cursor.execute(sql)
            return self.cursor.fetchall()

        except Exception as e:
            print(e)

    def getColumn(self, table):
        sql = " SELECT * FROM information_schema.columns WHERE table_schema='{}' and table_name = '{}' ".format(
            db_name, table)
        try:
            self.cursor.execute(sql)
            return self.cursor.fetchall()

        except Exception as e:
            print(e)


database = DataBase()

db_tables = database.getTables("")

for t in db_tables:

    db_colum = database.getColumn(t[0])
    java_object = t[0].capitalize()

    with open("Modelo/{}.java".format(java_object), "w+") as file:
     
        java_var = []
        for c in db_colum:
            java_var_detail = {}
            if c[7] == 'int':
                java_var_detail['type'] = 'Integer'
                java_var_detail['value'] = c[3]
            elif c[7] == 'varchar' or c[7] == 'text' or c[7] == 'longtext':
                java_var_detail['type'] = 'String'
                java_var_detail['value'] = c[3]
            elif c[7] == 'tinyint':
                java_var_detail['type'] = 'Boolean'
                java_var_detail['value'] = c[3]
            elif c[7] == 'double' or c[7] == 'decimal':
                java_var_detail['type'] = 'Double'
                java_var_detail['value'] = c[3]

            java_var.append(java_var_detail)
        
        file.write('package modelo;\n')
        file.write('\n')
        file.write("public class {}".format(java_object))
        file.write("{\n")

        for a in java_var:
            file.write("\t"+a['type'] + " "+a['value']+";\n")
        file.write('\n')

        java_contructor = "\tpublic {}(".format(java_object)

        c = len(java_var)
        for a in java_var:
            c = c - 1
            java_contructor = java_contructor + \
                "{} {}".format(a['type'], a['value'])
            if c != 0:
                java_contructor = java_contructor+", "

        java_contructor = java_contructor+"){\n"

        for a in java_var:
            java_contructor = java_contructor + \
                "\t\tthis.{} = {};\n".format(a['value'], a['value'])

        java_contructor = java_contructor + "\t}"

        java_contructor2 = "\tpublic {}(Integer id)".format(java_object)
        java_contructor2 = java_contructor2 + "{\n\t\tthis.id = id;"
        java_contructor2 = java_contructor2 +  "\n\t}"

        file.write(java_contructor)
        file.write('\n')
        file.write(java_contructor2)
        file.write('\n')
        
        java_toString = '\t@Override\n\tpublic String toString() {\n\t\treturn "'+java_object+'{"'

        for a in java_var:
            java_toString = java_toString + \
            '+"{}=" + {}'.format(a['value'], a['value'])

        java_toString = java_toString + '+"}";\n\n'
        
        file.write(java_toString)
        file.write("\t}\n")
        java_setter=""
        
        for a in java_var:
            java_setter = '\tpublic {} get{}()'.format(a['type'], a['value'].capitalize())
            java_setter = java_setter + '{\n'
            java_setter = java_setter + '\t\treturn {};\n'.format(a['value'])
            java_setter = java_setter + '\t}\n'
            file.write(java_setter)

            java_getter = '\tpublic void set{}({} {})'.format(a['value'].capitalize(), a['type'],a['value'])
            java_getter = java_getter + '{\n'
            java_getter = java_getter + '\t\tthis.{} = {};\n'.format(a['value'], a['value'])
            java_getter = java_getter + '\t}\n'
            file.write(java_getter)
            
            
        file.write('\n}')
        file.close()

for t in db_tables:

    db_colum = database.getColumn(t[0])
    java_object = t[0].capitalize()
    java_object2 = t[0]

    with open("DAO/{}DAO.java".format(java_object), "w+") as file:

        dao_head = "package DAO;\n" +\
        "import static java.lang.Thread.yield;\n" +\
        "import java.sql.PreparedStatement;\n" +\
        "import java.sql.ResultSet;\n" +\
        "import java.sql.SQLException;\n" +\
        "import java.util.ArrayList;\n" +\
        "import javax.swing.JOptionPane;\n" +\
        "import modelo."+java_object+";\n" +\
        "import vista.*;\n"

        file.write(dao_head)
     
        java_var = []
        for c in db_colum:
            java_var_detail = {}
            if c[7] == 'int':
                java_var_detail['type'] = 'Integer'
                java_var_detail['value'] = c[3]
            elif c[7] == 'varchar' or c[7] == 'text' or c[7] == 'longtext':
                java_var_detail['type'] = 'String'
                java_var_detail['value'] = c[3]
            elif c[7] == 'tinyint':
                java_var_detail['type'] = 'Boolean'
                java_var_detail['value'] = c[3]
            elif c[7] == 'double' or c[7] == 'decimal':
                java_var_detail['type'] = 'Double'
                java_var_detail['value'] = c[3]

            java_var.append(java_var_detail)

        
        dao_var = "\npublic class "+java_object+"DAO extends Thread {\n"
        dao_var = dao_var + "\tprivate "+java_object+" "+java_object2[0:4]+";\n"
        dao_var = dao_var + "\tpublic ArrayList<"+java_object+"> resultado"+java_object+";\n\n"

        file.write(dao_var)

        dao_override = '\t@Override\n\tpublic void run() {\n\t\ttry{'+\
            '\n\t\t\tactualizar'+java_object+'("");\n\t\t} catch (Exception e) {'+\
            '\n\t\t\tSystem.out.println("Error al generar '+java_object+'");\n\t\t}\n\t\tyield();\n\t}\n'

        file.write(dao_override)

        dao_actualizar = '\n\tpublic void actualizar'+java_object+'(String condicion) {'+\
            '\n\t\tresultado'+java_object+' = listar(condicion);\n\t}\n\n'

        file.write(dao_actualizar)

        dao_listar = '\tpublic ArrayList listar(String condicion) {'+\
            '\n\t\ttry {\n\t\t\tinicio.gConexion.comprobar();'+\
            '\n\t\t\tString q = "select * from  '+t[0]+' " + condicion + " order by id desc";'+\
            '\n\t\t\tPreparedStatement ps = inicio.gConexion.con.prepareStatement(q);'+\
            '\n\t\t\tResultSet rs = ps.executeQuery();\n'+\
            '\n\t\t\tArrayList arr = new ArrayList();\n'+\
            '\n\t\t\twhile (rs.next()) {'+\
            '\n\t\t\t\t'+java_object2[0:4]+' = new '+java_object+'('

        c = len(java_var)
        for a in java_var:
            if a['type']=='Integer':
                dao_listar = dao_listar + '\n\t\t\t\t\t\trs.getInt("'+a['value']+'")'
            elif a['type']=='String':
                dao_listar = dao_listar + '\n\t\t\t\t\t\trs.getString("'+a['value']+'")'
            elif a['type']=='Double':
                dao_listar = dao_listar + '\n\t\t\t\t\t\trs.getDouble("'+a['value']+'")'
            elif a['type']=='Boolean':
                dao_listar = dao_listar + '\n\t\t\t\t\t\trs.getBoolean("'+a['value']+'")'
            c = c - 1
            if c > 0:
                dao_listar = dao_listar +','

        dao_listar = dao_listar + '\n\t\t\t);\n\t\t\tarr.add('+java_object2[0:4]+');\n\t\t}\n\n\t\t\treturn arr;'
        dao_listar = dao_listar + '\n\t\t} catch (SQLException ex) {'
        dao_listar = dao_listar + '\n\t\t\tSystem.out.println(ex.getMessage());\n\t\t}\n\t\treturn null;\n\t}'

        file.write(dao_listar)
        file.write('\n\n')

        dao_insertar = '\tpublic boolean insertar('+java_object+' '+java_object2[0:4]+') {'+\
            '\n\t\tString q = " insert into '+java_object2+'('

        sw = 0
        c = len(java_var)
        for a in java_var:
            if c == len(java_var):
                c = c - 1
            else:
                c = c - 1
                dao_insertar = dao_insertar +" "+a['value']
                if c != 0:
                    dao_insertar = dao_insertar+", "

        dao_insertar = dao_insertar +') values ('
        c = len(java_var)
        
        for a in java_var:
            if c == len(java_var):
                c = c - 1
            else:
                c = c - 1
                dao_insertar = dao_insertar + '?'
                if c != 0:
                    dao_insertar = dao_insertar+", "

        dao_insertar = dao_insertar + ')";\n'+\
            '\n\t\ttry {\n\t\t\tinicio.gConexion.comprobar();'+\
                '\n\t\t\tPreparedStatement ps = inicio.gConexion.con.prepareStatement(q);'

        
        c = 0
        for a in java_var:
            if c > 0:
                if a['type']=='Integer':
                    dao_insertar = dao_insertar + '\n\t\t\tps.setInt('+str(c)+', '+java_object2[0:4]+'.get'+a['value'].capitalize()+'());'
                elif a['type']=='String':
                    dao_insertar = dao_insertar + '\n\t\t\tps.setString('+str(c)+', '+java_object2[0:4]+'.get'+a['value'].capitalize()+'());'
                elif a['type']=='Double':
                    dao_insertar = dao_insertar + '\n\t\t\tps.setDouble('+str(c)+', '+java_object2[0:4]+'.get'+a['value'].capitalize()+'());'
                elif a['type']=='Boolean':
                    dao_insertar = dao_insertar + '\n\t\t\tps.setBoolean('+str(c)+', '+java_object2[0:4]+'.get'+a['value'].capitalize()+'());'
            
            c = c + 1

        dao_insertar = dao_insertar + '\n\t\t\tps.executeUpdate();\n\t\t\treturn true;'+\
                '\n\t\t} catch (SQLException ex) {'+\
                '\n\t\t\tJOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar '+java_object+'", JOptionPane.ERROR_MESSAGE);\n\t\t}'+\
                '\n\t\treturn false;\n\t}'

        file.write(dao_insertar)
        file.write('\n\n')

        dao_modificar = '\tpublic boolean modificar('+java_object+' '+java_object2[0:4]+') {'+\
            '\n\t\tString q = " update '+java_object2+' set '

        for a in java_var:
            if c == len(java_var):
                c = c - 1
            else:
                c = c - 1
                dao_modificar = dao_modificar +" "+a['value']+"=?"
                if c != 0:
                    dao_modificar = dao_modificar+", "

        dao_modificar = dao_modificar + ' where id=?";\n'

        dao_modificar = dao_modificar + '\n\t\ttry {\n\t\t\tinicio.gConexion.comprobar();'+\
                '\n\t\t\tPreparedStatement ps = inicio.gConexion.con.prepareStatement(q);'
        c = 0
        for a in java_var:
            if c > 0:
                if a['type']=='Integer':
                    dao_modificar = dao_modificar + '\n\t\t\tps.setInt('+str(c)+', '+java_object2[0:4]+'.get'+a['value'].capitalize()+'());'
                elif a['type']=='String':
                    dao_modificar = dao_modificar + '\n\t\t\tps.setString('+str(c)+', '+java_object2[0:4]+'.get'+a['value'].capitalize()+'());'
                elif a['type']=='Double':
                    dao_modificar = dao_modificar + '\n\t\t\tps.setDouble('+str(c)+', '+java_object2[0:4]+'.get'+a['value'].capitalize()+'());'
                elif a['type']=='Boolean':
                    dao_modificar = dao_modificar + '\n\t\t\tps.setBoolean('+str(c)+', '+java_object2[0:4]+'.get'+a['value'].capitalize()+'());'
            c = c + 1
            
        dao_modificar = dao_modificar + '\n\t\t\tps.setInt('+str(c)+', '+java_object2[0:4]+'.getId());'

        dao_modificar = dao_modificar + '\n\t\t\tps.executeUpdate();\n\t\t\treturn true;'+\
                '\n\t\t} catch (SQLException ex) {'+\
                '\n\t\t\tJOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar '+java_object+'", JOptionPane.ERROR_MESSAGE);\n\t\t}'+\
                '\n\t\treturn false;\n\t}'
        
        file.write(dao_modificar)
        file.write('\n\n')

        dao_eliminar = '\tpublic boolean eliminar('+java_object+' '+java_object2[0:4]+') {'+\
            '\n\t\tString q = " delete from '+java_object2+' where id=?";'

        dao_eliminar = dao_eliminar + '\n\t\ttry {\n\t\t\tinicio.gConexion.comprobar();'+\
                '\n\t\t\tPreparedStatement ps = inicio.gConexion.con.prepareStatement(q);'+\
                '\n\t\t\tps.setInt(1, '+java_object2[0:4]+'.getId());'+\
                 '\n\t\t\tps.executeUpdate();\n\t\t\treturn true;'+\
                '\n\t\t} catch (SQLException ex) {'+\
                '\n\t\t\tJOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar '+java_object+'", JOptionPane.ERROR_MESSAGE);\n\t\t}'+\
                '\n\t\treturn false;\n\t}'

        file.write(dao_eliminar)
        file.write('\n}')

        file.close()

fin = time.time()
print(fin-inicio) 