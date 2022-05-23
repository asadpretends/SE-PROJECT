package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class RemoveStudent {

    @FXML
    private Button Back;

    @FXML
    private TextField ClassrroomCode;

    @FXML
    private TextField Email;

    @FXML
    private Button Submit;

    @FXML
    void Back(ActionEvent event) {
        Main.s.setWidth(565);
        Main.s.setHeight(312);
        Main.s.setScene(Controller.teachermenu);
    }

    @FXML
    void Submit(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Student Removed");
        alert.setHeaderText("Student has been removed successfully.");


        if(alert.showAndWait().get() == ButtonType.OK) {
            Controller.BL.classrooms.RemoveStudent(Email.getText(),ClassrroomCode.getText());
            Main.s.setWidth(565);
            Main.s.setHeight(312);
            Main.s.setScene(Controller.teachermenu);
        }
    }

}
