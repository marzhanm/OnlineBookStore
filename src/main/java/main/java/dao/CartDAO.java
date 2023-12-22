package main.java.dao;

import main.java.model.Cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CartDAO {
    private Connection connection;

    public CartDAO(Connection connection){
        this.connection=connection;
    }

    public boolean addCart(Cart c){
        boolean f=false;
        try {
            String addSql="INSERT INTO cart( cid, book_id, user_id, book_name, author, price, total_price) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps=connection.prepareStatement(addSql);
            try {
                ps.setInt(1, c.getCid());
                ps.setInt(2, c.getBook_id());
                ps.setInt(3, c.getUser_id());
                ps.setString(4, c.getBook_name());
                ps.setString(5, c.getAuthor());
                ps.setDouble(6, c.getPrice());
                ps.setDouble(7, c.getTotal_price());

                int i= ps.executeUpdate();
                if(i==1){
                    f=true;
                }
        }catch (SQLException e){
                throw new RuntimeException(e);
        }

    } catch (Exception e) {
            e.printStackTrace();
        }return f;
    }

    public boolean removeBook(int book_id){
        boolean f=false;
        try {
            String dropSql="DELETE FROM cart WHERE book_id=?";
            PreparedStatement ps=connection.prepareStatement(dropSql);
            ps.setInt(1, book_id);

            int i= ps.executeUpdate();
            if(i==1){f=true;}
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return f;
    }
}
