package main.java.model;

public class BookD {
    private int book_id;
    private String bookName;
    private int cat_id;
    private int aut_id;
    private int pub_id;
    private double price;
    private String image;

    public BookD() {

    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public int getAut_id() {
        return aut_id;
    }

    public void setAut_id(int aut_id) {
        this.aut_id = aut_id;
    }

    public int getPub_id() {
        return pub_id;
    }

    public void setPub_id(int pub_id) {
        this.pub_id = pub_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BookD(String bookName, int cat_id, int aut_id, int pub_id, double price) {
        this.bookName = bookName;
        this.cat_id = cat_id;
        this.aut_id = aut_id;
        this.pub_id = pub_id;
        this.price = price;
    }
}
