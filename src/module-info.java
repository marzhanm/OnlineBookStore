module com.example.myapp {
    requires javafx.controls;
    requires javafx.web;

    opens main.java to javafx.graphics;

    exports main.java;
}
