package main.java;
import java.sql.SQLException;
import java.sql.Connection;

public class DatabaseFacade {

    private Connection connection;

    private UserDAO userDAO;

    public DatabaseFacade(Connection connection){
    try{
        this.connection = DatabaseConnector.getConnection();
        this.userDAO = new UserDAO(this.connection);
    }  catch (SQLException e) {
        e.printStackTrace();
    }
    }
    public boolean registerUser(User user){
        return userDAO.addUser(user);
    }
    public User authenticateUser(String email, String password){
        return userDAO. authenticateUser(email, password);
    }
}