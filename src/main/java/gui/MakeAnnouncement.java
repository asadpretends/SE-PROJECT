package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MakeAnnouncement {
    @FXML
    private TextArea Announcement;

    @FXML
    private Button Back;

    @FXML
    private TextField ClassroomCode;

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
        alert.setTitle("Announcement Posted");
        alert.setHeaderText("Announcement has been announced successfully.");


        if(alert.showAndWait().get() == ButtonType.OK) {
            System.out.println(ClassroomCode.getText());
            System.out.println(Announcement.getText());
            System.out.println(Controller.BL.teachers.GetloggedInTeacher().getName());
            Controller.BL.classrooms.PostAnnouncement(ClassroomCode.getText(), Announcement.getText(), Controller.BL.teachers.GetloggedInTeacher().getName());
            Main.s.setWidth(565);
            Main.s.setHeight(312);
            Main.s.setScene(Controller.teachermenu);
        }
    }

}
