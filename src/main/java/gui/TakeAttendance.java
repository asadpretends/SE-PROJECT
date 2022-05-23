package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class TakeAttendance {

    @FXML
    private Button Back;

    @FXML
    private TextField ClassroomCode;

    @FXML
    private TextField PA;

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
        alert.setTitle("Attendance Recorded");
        alert.setHeaderText("Attendance has been recorded successfully.");


        if(alert.showAndWait().get() == ButtonType.OK) {
            Controller.BL.classrooms.TakeAttendance(ClassroomCode.getText());
            Main.s.setWidth(565);
            Main.s.setHeight(312);
            Main.s.setScene(Controller.teachermenu);
        }
    }

}
