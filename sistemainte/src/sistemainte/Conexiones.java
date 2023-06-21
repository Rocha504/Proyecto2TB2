/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainte;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexiones {
    
    public Connection conectarPostgreSQL(String url, String usuario, String contraseña) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver"); // Cargar el controlador de PostgreSQL
            connection = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa a PostgreSQL");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador de PostgreSQL: " + e.getMessage());
        }
        return connection;
    }
    
    public Connection conectarOracle(String url, String usuario, String contraseña) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // Cargar el controlador de Oracle
            connection = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa a Oracle");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador de Oracle: " + e.getMessage());
        }
        return connection;
    }
    
}
