package main.java;
import main.java.model.BookD;

import java.sql.*;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static final String URL = "jdbc:postgresql://localhost:5431/BookStore";
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    public static String createInClause(List<BookD> books) {
        StringBuilder inClause = new StringBuilder();
        for (int i = 0; i < books.size(); i++) {
            inClause.append("?");
            if (i < books.size() - 1) {
                inClause.append(", ");
            }
        }
        return inClause.toString();
    }
}