package dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static Connection connection;
    private ConnectionFactory (Connection connection){}

    public static Connection getConnection() {
        if (connection == null) {
            connection = initConnection();
        }
        return connection;
    }

    private static Connection initConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/ebacprojeto3", "mb@mb.com", "123456");

            }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}