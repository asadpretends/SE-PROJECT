package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class UploadMaterial {

    @FXML
    private Button Back;

    @FXML
    private TextField ClassroomCode;

    @FXML
    private TextField FileName;

    @FXML
    private TextField FilePath;

    @FXML
    private TextField FileType;

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
        alert.setTitle("Teacher Uploaded Material");
        alert.setHeaderText("Teacher has Uploaded the Material successfully.");


        if(alert.showAndWait().get() == ButtonType.OK) {
            Controller.BL.classrooms.uploadmaterial(ClassroomCode.getText(), FilePath.getText(), FileName.getText(), FileType.getText(),Controller.BL.teachers.GetloggedInTeacher().getName());
            Main.s.setWidth(565);
            Main.s.setHeight(312);
            Main.s.setScene(Controller.teachermenu);
        }
    }

}
