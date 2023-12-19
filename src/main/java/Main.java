package main.java;
import javafx.application.Application;
import java.io.*;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URISyntaxException;

import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

class ShoppingCartManager{} //Singleton Pattern

//Factory Method
interface Book{
    String getTitle();
    double getPrice();
}
interface BookFactory{
    Book createBook();
}
class Biography implements Book{

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
class Fantasy implements Book{

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
class Horror implements Book{

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
class Crime implements Book{

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
class Romance implements Book{

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
class HorrorBookFactory implements BookFactory{

    @Override
    public Book createBook() {
        return null;
    }
}
class CrimeBookFactory implements BookFactory{

    @Override
    public Book createBook() {
        return null;
    }
}
class RomanceBookFactory implements BookFactory{

    @Override
    public Book createBook() {
        return null;
    }
}
class BiographyBookFactory implements BookFactory{

    @Override
    public Book createBook() {
        return null;
    }
}
class FantasyBookFactory implements BookFactory{

    @Override
    public Book createBook() {
        return null;
    }
}

//Strategy Pattern


public class Main {
    private WebView webView;
    private WebEngine webEngine;
    private static final String HOME_HTML = "file:///C:/Users/user/IdeaProjects/Online%20Book%20Store/src/resources/Home.html";
    public static void main(String[] args) {
        String htmlFilePath = "C:/Users/user/IdeaProjects/Online Book Store/src/resources/Home.html";

        openHTMLInBrowser(htmlFilePath);
    }

    private static void openHTMLInBrowser(String filePath) {
        try {
            File htmlFile = new File(filePath);

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();

                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(htmlFile.toURI());
                } else {
                    System.out.println("Browsing is not supported on this platform.");
                }
            } else {
                System.out.println("Desktop is not supported on this platform.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}