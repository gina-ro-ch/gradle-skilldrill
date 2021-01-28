module Java.Application.app.main {
    requires javafx.controls;
    requires com.google.common;
    requires com.google.gson;
    exports gradle.skilldrill;
    opens gradle.skilldrill to com.google.gson
}