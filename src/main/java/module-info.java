module com.example.final_project_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.final_project_demo to javafx.fxml;
    exports com.example.final_project_demo;
}