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
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("add")
public class AddCartCommand implements CartCommand {
    protected CartDAO cartDAO;
    protected Cart cart;

    public AddCartCommand(CartDAO cartDAO) {
        this.cartDAO=cartDAO;
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            int book_id=Integer.parseInt(request.getParameter("book_id"));
            int user_id=Integer.parseInt(request.getParameter("user_id"));

            BookDAO bookDAO=new BookDAO(DatabaseConnector.getConnection());
            BookD books=bookDAO.getBookById(book_id);

            Cart cart=new Cart();
            cart.setBook_id(book_id);
            cart.setUser_id(user_id);
            cart.setBook_name(books.getBookName());
            cart.setAuthor(String.valueOf(books.getAut_id()));
            cart.setPrice(books.getPrice());
            cart.setTotal_price(books.getPrice());

            CartDAO cartDAO=new CartDAO(DatabaseConnector.getConnection());
            boolean f=cartDAO.addCart(cart);
            if(f){response.sendRedirect("Categories.html");
            }else {System.out.println("Books are not added to cart :(");}
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
