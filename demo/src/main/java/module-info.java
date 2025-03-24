module com.loose.oose.fis.lab.student.manager {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.loose.oose.fis.lab.student.manager to javafx.fxml;

    exports com.loose.oose.fis.lab.student.manager;
}
