package main.java.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface CartCommand{
    void execute(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
