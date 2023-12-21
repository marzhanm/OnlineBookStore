package main.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Registration")
public class RegistrationServlet extends HttpServlet {
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

            UserDAO dao=new UserDAO(DatabaseConnector.getConnection());
            boolean f=dao.addUser(user);
            if(f){
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
