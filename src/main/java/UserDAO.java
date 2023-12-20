package main.java;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }
    public boolean addUser(User user){
        try {
            String query = "INSERT INTO users(email, password) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, user.getEmail());
                preparedStatement.setString(1, user.getPassword());

                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean authenticateUser(String email, String Password){
        try {
            String query = "SELECT * FROM users WHERE email = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email().toString());
            preparedStatement.setString(1, password().toString());

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next();
            }
            }
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    private Object email() {
        return null;
    }

    private Object password() {
        return null;
    }
}
