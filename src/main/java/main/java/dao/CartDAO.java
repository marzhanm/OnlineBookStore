package main.java.dao;

import main.java.model.Cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public Cart getBookByUser(int user_id){
        Cart c=null;
        double totalPrice=0;
        try {
            String uQ="SELECT * FROM cart WHERE user_id=?";
            PreparedStatement ps=connection.prepareStatement(uQ);
            ps.setInt(1, 1);

            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                c=new Cart();
                c.setCid(rs.getInt(1));
                c.setBook_id(rs.getInt(2));
                c.setUser_id(rs.getInt(user_id));
                c.setBook_name(rs.getString(4));
                c.setAuthor(rs.getString(5));
                c.setPrice(rs.getDouble(6));
                totalPrice=totalPrice+rs.getDouble(7);
                c.setTotal_price(totalPrice);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return c;
    }
}
