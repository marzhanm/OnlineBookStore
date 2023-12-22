package main.java.dao;

import main.java.model.BookD;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    private Connection connection;
    public BookDAO(Connection connection){
        super();
        this.connection=connection;
    }

    public BookD getBookById(int id) {
        Book b=null;
        try {
            String getById="SELECT * FROM books WHERE book_id=?";
            PreparedStatement ps=connection.prepareStatement(getById);
            ps.setInt(1, id);

            ResultSet rs=ps.executeQuery();
            while (rs.next()){

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public List<BookD> getByCategories(String cat_name) {
        List<BookD> list=new ArrayList<BookD>();
        BookD d=null;
        try {
            String catQ = "SELECT * FROM books b JOIN categories c ON b.cat_id=c.cat_id WHERE c.cat_name=?";
            PreparedStatement ps=connection.prepareStatement(catQ);
            ps.setString(1, cat_name);

            ResultSet rs= ps.executeQuery();
            int i=1;
            while (rs.next() && i<=4){
                gett(list, rs);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public List<BookD> getByCategoriesAuthors(String cat_name, String aut_name) {
        List<BookD> list=new ArrayList<BookD>();
        BookD d=null;
        try {
            String catautQ = "SELECT * FROM books b JOIN categories c ON b.cat_id=c.cat_id JOIN authors a ON b.aut_id=a.aut_id WHERE c.cat_name=? AND a.aut_name=?";
            PreparedStatement ps=connection.prepareStatement(catautQ);
            ps.setString(1, cat_name);
            ps.setString(2, aut_name);
            ResultSet rs= ps.executeQuery();
            int i=1;
            while (rs.next() && i<=4){
                gett(list, rs);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private void gett(List<BookD> list, ResultSet rs) throws SQLException {
        BookD d;
        d=new BookD();
        d.setBook_id(rs.getInt(1));
        d.setBookName(rs.getString(2));
        d.setCat_id(rs.getInt(3));
        d.setAut_id(rs.getInt(4));
        d.setPub_id(rs.getInt(5));
        d.setPrice(rs.getDouble(6));
        list.add(d);
    }

}
