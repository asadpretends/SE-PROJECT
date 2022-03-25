module com.example.classroom {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires java.persistence;
    requires java.naming;
    requires java.sql;
    exports gui to javafx.graphics,javafx.fxml;
    opens BusinessLogic to org.hibernate.orm.core;
    opens gui to javafx.fxml;
}