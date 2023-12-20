package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class Database {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/123";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "1";
    private static Connection connection;

    private Database(){

    }
    public static Connection getConnection() throws SQLException{
        if(Objects.isNull(connection)){
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        }
        return connection;
    }
}
