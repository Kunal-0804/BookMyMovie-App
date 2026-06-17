package conffig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * Database Configuration Class
 * This class is responsible for establishing a connection
 * with the MySQL database used in the BookMyMovie application.
 */
public class DataBaseConfig {
    // Database URL
    // Format: jdbc:mysql://hostname:port/database_name
    static String url="jdbc:mysql://localhost:3306/bookmymovies";
    static String username="root";
    static String password="Kunal@18";
 /*
     * Creates and returns a database connection.
     * throws SQLException if database connection fails
     */
    public static Connection getConnection() throws SQLException {
        // Establish connection with MySQL database
        return DriverManager.getConnection(url,username,password);
    }
}
