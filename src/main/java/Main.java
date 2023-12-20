package main.java;
import java.io.*;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        openJSPInBrowser("web/WEB-INF/Home.jsp");
    }

    private static void openJSPInBrowser(String jspFilePath) {
        try {
            File jspFile = new File(jspFilePath);
            String encodedFilePath = "file:" + URLEncoder.encode(jspFile.getAbsolutePath(), StandardCharsets.UTF_8.toString());

            // Replace %20 with spaces
            encodedFilePath = encodedFilePath.replace("%20", " ");

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();

                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI(encodedFilePath));
                } else {
                    System.out.println("Browsing is not supported on this platform.");
                }
            } else {
                System.out.println("Desktop is not supported on this platform.");
            }

        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}