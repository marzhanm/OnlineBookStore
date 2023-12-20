package main.java;
import java.sql.SQLException;
import java.sql.Connection;

public class DatabaseFacade {

    private Connection connection;

    private UserDAO userDAO;

    public DatabaseFacade(){
    try{
        this.connection = DatabaseConnector.getConnection();
        this.userDAO = new UserDAO(connection);
    }  catch (SQLException e) {
        e.printStackTrace();
    }
    }
    public boolean registerUser(User user){
        return userDAO.addUser(user);
    }
    public boolean authenticateUser(String email, String password){
        return userDAO. authenticateUser(email, password);
    }
}