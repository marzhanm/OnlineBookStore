package main.java;
import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Authentication")
public class AuthenticationServlet extends HttpServlet {
    private final DatabaseFacade facade;

    public AuthenticationServlet() {
        try {
            Connection connection = DatabaseConnector.getConnection();
            this.facade = new DatabaseFacade(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String email=request.getParameter("email");
            String password=request.getParameter("password");

            if (facade.authenticateUser(email, password) !=null) {
                response.sendRedirect("Home.jsp"); //redirect to home page if authentication was successful
            } else {
                response.sendRedirect("Log%20in.jsp"); //gives other chance for user to authenticate
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
