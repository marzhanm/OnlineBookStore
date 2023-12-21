package main.java;

interface Book{
    String getTitle();
}
class Biography implements Book{
    private String book_name;
    Biography(String book_name){
        this.book_name=book_name;
    }
    @Override
    public String getTitle() {
        return book_name;
    }
}
class Fantasy implements Book{
    private String book_name;
    Fantasy(String book_name){
        this.book_name=book_name;
    }
    @Override
    public String getTitle() {
        return book_name;
    }
}
class Horror implements Book{
    private String book_name;
    Horror(String book_name){
        this.book_name=book_name;
    }
    @Override
    public String getTitle() {
        return book_name;
    }
}
class Crime implements Book{
    private String book_name;
    Crime(String book_name){
        this.book_name=book_name;
    }
    @Override
    public String getTitle() {
        return book_name;
    }
}
class Romance implements Book{
    private String book_name;
    Romance(String book_name){
        this.book_name=book_name;
    }
    @Override
    public String getTitle() {
        return book_name;
    }
}
interface BookFactory{
    Book createBook(String book_name);
}
class HorrorBookFactory implements BookFactory{
    @Override
    public Book createBook(String book_name) {
        return new Horror(book_name);
    }
}
class CrimeBookFactory implements BookFactory{
    @Override
    public Book createBook(String book_name) {
        return new Crime(book_name);
    }
}
class RomanceBookFactory implements BookFactory{
    @Override
    public Book createBook(String book_name) {
        return new Romance(book_name);
    }
}
class BiographyBookFactory implements BookFactory{
    @Override
    public Book createBook(String book_name) {
        return new Biography(book_name);
    }
}
class FantasyBookFactory implements BookFactory{
    @Override
    public Book createBook(String book_name) {
        return new Fantasy(book_name);
    }
}
