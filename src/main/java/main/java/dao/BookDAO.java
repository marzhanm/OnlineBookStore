package main.java.dao;

import main.java.model.BookD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    private final Connection connection;
    public BookDAO(Connection connection){
        super();
        this.connection=connection;
    }

    public BookD getBookById(int id) {
        BookD b=null;
        try {
            String getById="SELECT * FROM books WHERE book_id=?";
            PreparedStatement ps=connection.prepareStatement(getById);
            ps.setInt(1, id);

            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                b=new BookD();
                b.setBook_id(rs.getInt(1));
                b.setBookName(rs.getString(2));
                b.setCat_id(rs.getInt(3));
                b.setAut_id(rs.getInt(4));
                b.setPub_id(rs.getInt(5));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return b;
    }

    public List<BookD> getByCategoriesAuthors(String cat_name, String aut_name) {
        ArrayList<BookD> bookDS= new ArrayList<>();
        BookD d;
        try {
            String catautQ = "SELECT * FROM books b JOIN categories c ON b.cat_id=c.cat_id JOIN authors a ON b.aut_id=a.aut_id WHERE c.cat_name=? AND a.aut_name=?";
            PreparedStatement ps=connection.prepareStatement(catautQ);
            ps.setString(1, cat_name);
            ps.setString(2, aut_name);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                d = new BookD();
                d.setBook_id(rs.getInt(1));
                d.setBookName(rs.getString(2));
                d.setCat_id(rs.getInt(3));
                d.setAut_id(rs.getInt(4));
                d.setPub_id(rs.getInt(5));
                d.setPrice(rs.getDouble(6));
                bookDS.add(d);            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return bookDS;
    }

}
