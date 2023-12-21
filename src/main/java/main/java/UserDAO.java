package main.java;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private final Connection connection;
    private PreparedStatement preparedStatement;
    private String password;
    public UserDAO(Connection connection) {
        this.connection = connection;
    }
    public boolean addUser(User user){
        try {
            String query = "INSERT INTO users(user_name, user_email, user_pass) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, user.getUsername());
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
    public boolean authenticateUser(String email, String password){
        try {
            String query = "SELECT * FROM users WHERE user_email = ? AND user_pass = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next();
            }
            }
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

}
