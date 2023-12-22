package main.java.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface CartCommand{
    void execute(HttpServletRequest request, HttpServletResponse response) throws IOException;
}

//sql query to sum total:SELECT SUM(price) as summary FROM books WHERE book_id IN ();
//sql query to show selected books: SELECT book_name as Book, c.cat_name as Genre,  a.aut_name as Author FROM books b JOIN authors a on b.aut_id = a.aut_id JOIN categories c on b.cat_id=c.cat_id WHERE b.book_name IN ();

