package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    private static ConnectionProvider cp = new ConnectionProvider();
    private static Connection con = null;

    private ConnectionProvider() {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void createConnection() {

        try {
            con = DriverManager.getConnection("jdbc:sqlite:src/main/resources/database.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {

        if(con==null){
            cp.createConnection();
        }
        return con;
    }
}
