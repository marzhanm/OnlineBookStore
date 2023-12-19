module com.example.myapp {
    requires javafx.controls;
    requires javafx.web;
    requires java.desktop;

    opens main.java to javafx.graphics;

    exports main.java;
}
