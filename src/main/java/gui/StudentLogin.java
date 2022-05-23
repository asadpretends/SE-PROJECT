package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class StudentLogin {

    @FXML
    private Button Back;

    @FXML
    private TextField Email;

    @FXML
    private PasswordField Password;

    @FXML
    private Button Submit;

    @FXML
    void Back(ActionEvent event) {
        Main.s.setWidth(565);
        Main.s.setHeight(312);
        Main.s.setScene(Controller.studentmenu);
    }

    @FXML
    void Submit(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Student Registered");
        alert.setHeaderText("Student has been registered successfully.");

        if (alert.showAndWait().get() == ButtonType.OK) {
            Controller.BL.students.LoginIn(Email.getText(), Password.getText());
            Main.s.setWidth(565);
            Main.s.setHeight(312);
            Main.s.setScene(Controller.studentmenu);
        }
    }
}
