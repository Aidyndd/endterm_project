package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresDB {
    public static Connection connection;
    public void getConnection() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Nuris2003");
            Statement stmt = connection.createStatement();
            System.out.println("Done!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
