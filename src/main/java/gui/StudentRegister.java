package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class StudentRegister {

    @FXML
    private Button Back;

    @FXML
    private TextField Email;

    @FXML
    private TextField Name;

    @FXML
    private PasswordField Password;

    @FXML
    private TextField Program;

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


        if(alert.showAndWait().get() == ButtonType.OK) {
            Controller.BL.students.RegisterStudent(Name.getText(), Password.getText(), Email.getText(), Program.getText());
            Main.s.setWidth(565);
            Main.s.setHeight(312);
            Main.s.setScene(Controller.studentmenu);
        }
    }

}
