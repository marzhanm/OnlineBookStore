package main.java;
import java.io.*;
import java.util.*;
import java.awt.Desktop;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
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