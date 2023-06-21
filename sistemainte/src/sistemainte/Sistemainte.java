/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemainte;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author usuario
 */
public class Sistemainte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String urlPostgreSQL = "jdbc:postgresql://localhost:5432/concesionario_autos";
        String usuarioPostgreSQL = "postgres";
        String contraseñaPostgreSQL = "juan2003";

        Conexiones conexiones = new Conexiones();
        try {
            Connection conexionPostgreSQL = conexiones.conectarPostgreSQL(urlPostgreSQL, usuarioPostgreSQL, contraseñaPostgreSQL);

            conexionPostgreSQL.close(); // Cerrar la conexión

            System.out.println("Si conecto postgress");
            conexionPostgreSQL.close(); // Cerrar la conexión
        } catch (SQLException e) {
            System.out.println("Error al conectar a PostgreSQL: " + e.getMessage());
        }

        // prueba conexion oracle 
        String urlOracle = "jdbc:oracle:thin:@localhost:1521:XE";
        String usuarioOracle = "SYSTEM";
        String contraseñaOracle = "DreamTeam";

        try {
            Connection conexionOracle = conexiones.conectarOracle(urlOracle, usuarioOracle, contraseñaOracle);
            System.out.println("Si conecto Oracle");
            String query = "INSERT INTO Autos "
        + "(ID_auto, Marca, Modelo, Anio, Precio, Color, TipoCombustible) "
        + "VALUES (" + "'1', "
        + "'Lamborghini', "
        + "'Gallardo', "
        + "'2010', "
        + "'360000', "
        + "'Rojo', "
        + "'Super')";

            System.out.println("HOLA1");
            // Realizar operaciones con la conexión a Oracle
            Statement st;
            try{
            st = conexionOracle.createStatement();
            System.out.println("HOLA2");
            st.executeUpdate(query);
            System.out.println("HOLA3");
            conexionOracle.close();  
            }
            catch (Exception e) {
            e.printStackTrace();
        } // Fin Try Catch
        } catch (SQLException e) {
            System.out.println("Error al conectar a Oracle: " + e.getMessage());
        }

        //codigo para copiar las tablas de una a otra 
       /* try {
            Connection conexionOracle = conexiones.conectarOracle(urlOracle, usuarioOracle, contraseñaOracle);
            Connection conexionPostgreSQL = conexiones.conectarPostgreSQL(urlPostgreSQL, usuarioPostgreSQL, contraseñaPostgreSQL);

            // Obtener las tablas existentes en PostgreSQL
            DatabaseMetaData metaDataPostgreSQL = conexionPostgreSQL.getMetaData();
            ResultSet tablaResultSetPostgreSQL = metaDataPostgreSQL.getTables(null, null, null, new String[]{"TABLE"});

            // Recorrer las tablas de PostgreSQL
            while (tablaResultSetPostgreSQL.next()) {
                String nombreTabla = tablaResultSetPostgreSQL.getString("TABLE_NAME");

                // Obtener los atributos de la tabla en PostgreSQL
                ResultSet atributosResultSetPostgreSQL = metaDataPostgreSQL.getColumns(null, null, nombreTabla, null);

                // Generar el código SQL para crear la tabla en Oracle
                StringBuilder createTableSQL = new StringBuilder();
                createTableSQL.append("CREATE TABLE ").append(nombreTabla).append(" (");

                // Recorrer los atributos de la tabla en PostgreSQL
                while (atributosResultSetPostgreSQL.next()) {
                    String nombreAtributo = atributosResultSetPostgreSQL.getString("COLUMN_NAME");
                    String tipoDato = atributosResultSetPostgreSQL.getString("TYPE_NAME");
                    int longitud = atributosResultSetPostgreSQL.getInt("COLUMN_SIZE");

                    // Agregar el atributo al código SQL
                    createTableSQL.append(nombreAtributo).append(" ").append(tipoDato);
                    if (longitud > 0) {
                        createTableSQL.append("(").append(longitud).append(")");
                    }
                    createTableSQL.append(", ");
                }

                // Eliminar la última coma y espacio en el código SQL
                createTableSQL.setLength(createTableSQL.length() - 2);

                createTableSQL.append(")");

                // Ejecutar el código SQL para crear la tabla en Oracle
                Statement statement = conexionOracle.createStatement();
                statement.executeUpdate(createTableSQL.toString());
            }

            conexionOracle.close(); // Cerrar la conexión a Oracle
            conexionPostgreSQL.close(); // Cerrar la conexión a PostgreSQL

            System.out.println("Se crearon las tablas en Oracle correctamente");
        } catch (SQLException e) {
            System.out.println("Error al conectar o crear las tablas: " + e.getMessage());
        }

        //parte de la bitacora y los triggers 
       
        try {
            Connection conexionPostgreSQL = conexiones.conectarPostgreSQL(urlPostgreSQL, usuarioPostgreSQL, contraseñaPostgreSQL);

            // Crear disparadores en las tablas seleccionadas de la base de datos origen
            String createTriggerSQL = "CREATE TRIGGER nombre_trigger AFTER INSERT OR UPDATE OR DELETE ON nombre_tabla FOR EACH ROW BEGIN INSERT INTO bitacora (nombre_tabla, operacion, fecha_hora, datos_nuevos) VALUES ('nombre_tabla', 'operacion', current_timestamp, '{}'); END;";
            Statement statement = conexionPostgreSQL.createStatement();
            statement.executeUpdate(createTriggerSQL);

            // Crear la tabla de bitácora en la base de datos destino
            String createBitacoraTableSQL = "CREATE TABLE bitacora (id SERIAL PRIMARY KEY, nombre_tabla VARCHAR(255), operacion VARCHAR(10), fecha_hora TIMESTAMP WITHOUT TIME ZONE, datos_nuevos JSONB);";
            statement.executeUpdate(createBitacoraTableSQL);

            conexionPostgreSQL.close(); // Cerrar la conexión
        } catch (SQLException e) {
            System.out.println("Error al conectar o crear disparadores/bitácora: " + e.getMessage());
        }*/

    }
}
