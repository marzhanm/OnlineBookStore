module com.example.myapp {
    requires javafx.controls;
    requires javafx.web;
    requires java.desktop;
    requires java.sql;
    requires jdk.httpserver;

    opens main.java to javafx.graphics;

    exports main.java;
}
