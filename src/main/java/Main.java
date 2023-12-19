package main.java;
import javafx.application.Application;
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


public class Main extends Application{
    private WebView webView;
    private WebEngine webEngine;
    private static final String HOME_HTML = "file:///C:/Users/user/IdeaProjects/Online%20Book%20Store/src/resources/Home.html";
    private static final String CATEGORY_HTML = "file:///C:/Users/user/IdeaProjects/Online%20Book%20Store/src/resources/Categories.html";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Main Page");

        webView = new WebView();
        webEngine = webView.getEngine();
        webEngine.load(HOME_HTML);

        Scene scene = new Scene(webView, 1200, 800);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}