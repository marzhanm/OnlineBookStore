package main.java.servlet;

import main.java.DatabaseConnector;
import main.java.dao.CartDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/remove")
public class RemoveCartCommand extends HttpServlet implements CartCommand {
    protected CartDAO cartDAO;

    public RemoveCartCommand() {
    }

    public RemoveCartCommand(CartDAO cartDAO) {
        this.cartDAO = cartDAO;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        execute(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        execute(request, response);
    }
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            int book_id=Integer.parseInt(request.getParameter("book_id"));
            CartDAO cartDAO=new CartDAO(DatabaseConnector.getConnection());
            boolean f=cartDAO.removeBook(book_id);
            HttpSession session=request.getSession();

            if (f){
                session.setAttribute("Success", "Book Removed from Cart");
                response.sendRedirect("Cart.jsp");
            }else {
                session.setAttribute("Failure", "Book was not Removed from Cart. Technical Problems...");
                response.sendRedirect("Cart.jsp");
            }
        } catch (SQLException e) {
            throw new IOException("Error");        }

    }
}
