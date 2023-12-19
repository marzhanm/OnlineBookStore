package main.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


interface CartCommand{void execute();}
class Cart {
    private List<Book> books = new ArrayList<>();

    public void addToCart(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void showCart() {
        System.out.println("Books in the cart:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}
class AddToCartCommand implements CartCommand{
    private Cart cart;
    private Book book;
    AddToCartCommand(Cart cart, Book book){
        this.cart=cart;
        this.book=book;
    }
    @Override
    public void execute() {
        cart.addToCart(book);
    }
}
class ShowCartCommand implements CartCommand{
    private Cart cart;

    public ShowCartCommand(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void execute() {
        showCartFromDatabase();
    }
    // Retrieve books from the database and add them to the cart
    public void showCartFromDatabase() {
        try (Connection connection = DatabaseConnector.getConnection()) {
            String titlesInClause = DatabaseConnector.createInClause(cart.getBooks());

            // SQL query with IN clause
            String sqlQuery = "SELECT book_name as Book, c.cat_name as Genre,  a.aut_name as Author FROM books b JOIN authors a on b.aut_id = a.aut_id JOIN categories c on b.cat_id=c.cat_id WHERE b.book_name IN (" + titlesInClause + ")";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String title = resultSet.getString("title");
                        System.out.println("Book from database: " + title);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Helper method to create a comma-separated list for the IN clause

}
class SumCartCommand implements CartCommand{
    private Cart cart;

    public SumCartCommand(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void execute() {
        calculateAndDisplayTotalSum();
    }

    // Calculate and display the total sum of prices in the cart
    private void calculateAndDisplayTotalSum() {
        try (Connection connection = DatabaseConnector.getConnection()) {
            String titlesInClause = DatabaseConnector.createInClause(cart.getBooks());

            // SQL query to calculate the total sum of prices
            String sqlQuery = "SELECT SUM(price) as Summary FROM books WHERE book_name IN (" + titlesInClause + ")";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        double totalSum = resultSet.getDouble("total_sum");
                        System.out.println("Total sum of prices in the cart: $" + totalSum);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

//sql query to sum total:SELECT SUM(price) as summary FROM books WHERE book_id IN ();
//sql query to show selected books: SELECT book_name as Book, c.cat_name as Genre,  a.aut_name as Author FROM books b JOIN authors a on b.aut_id = a.aut_id JOIN categories c on b.cat_id=c.cat_id WHERE b.book_name IN ();

