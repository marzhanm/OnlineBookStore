package main.java.servlet;

import main.java.DatabaseConnector;
import main.java.DatabaseFacade;
import main.java.dao.UserDAO;
import main.java.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/Registration")
public class RegistrationServlet extends HttpServlet {
    private final DatabaseFacade facade;
    public RegistrationServlet() {
        try {
            Connection connection = DatabaseConnector.getConnection();
            this.facade = new DatabaseFacade(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        try {
            String username=request.getParameter("username");
            String email=request.getParameter("email");
            String password=request.getParameter("password");

            User user = new User();

            user.setUsername(username);
            user.setEmail(email);
            user.setPassword(password);
            HttpSession session=request.getSession();

            if(facade.registerUser(user)){
                session.setAttribute("Success", "Registration succeeded");
                response.sendRedirect("Home.jsp");
            } else {
                session.setAttribute("Failure", "Technical problems. Wait while we solve them...");
                response.sendRedirect("Sign%20Up.jsp");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
