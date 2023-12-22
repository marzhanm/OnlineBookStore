package main.java.servlet;

import main.java.DatabaseConnector;
import main.java.dao.BookDAO;
import main.java.dao.CartDAO;
import main.java.model.BookD;
import main.java.model.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/add")
public class AddCartCommand extends HttpServlet implements CartCommand {
    protected CartDAO cartDAO;
    protected Cart cart;

    public AddCartCommand(){}
    public AddCartCommand(CartDAO cartDAO) {
        this.cartDAO=cartDAO;
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
//            int user_id=Integer.parseInt(request.getParameter("user_id"));

            BookDAO bookDAO=new BookDAO(DatabaseConnector.getConnection());
            BookD books=bookDAO.getBookById(book_id);
            HttpSession session=request.getSession();
            Cart cart=new Cart();
            cart.setCid(1);
            cart.setBook_id(book_id);
            cart.setUser_id(1);
            cart.setBook_name(books.getBookName());
            cart.setAuthor(String.valueOf(books.getAut_id()));
            cart.setPrice(books.getPrice());
            cart.setTotal_price(books.getPrice());

            CartDAO cartDAO=new CartDAO(DatabaseConnector.getConnection());
            boolean f=cartDAO.addCart(cart);
            if(f){
                session.setAttribute("addCart", "Book Added to Cart");
                response.sendRedirect("Categories.html");
            }else {           session.setAttribute("failed", "Technical Problems....");
                response.sendRedirect("Categories.html");}
        } catch (SQLException e) {
            throw new IOException("Error");
        }
    }
}
