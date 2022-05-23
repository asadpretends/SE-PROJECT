package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class TeacherLogin {

    @FXML
    private Button Back;

    @FXML
    private Button Submit;

    @FXML
    private TextField Email;

    @FXML
    private PasswordField Password;


    @FXML
    void Back(ActionEvent event) {
        Main.s.setWidth(565);
        Main.s.setHeight(312);
        Main.s.setScene(Controller.teachermenu);
    }

    @FXML
    void Submit(ActionEvent event) {
        Controller.BL.teachers.LoginIn(Email.getText(),Password.getText());
        Main.s.setWidth(565);
        Main.s.setHeight(312);
        Main.s.setScene(Controller.teachermenu);
    }

}
