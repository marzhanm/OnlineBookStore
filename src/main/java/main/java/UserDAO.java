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
    public User authenticateUser(String email, String password){
        User user = null;
        try {
            String query = "SELECT * FROM users WHERE user_email = ? AND user_pass = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setEmail(resultSet.getString(3));
                user.setPassword(resultSet.getString(4));
            }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return user;
    }

}

