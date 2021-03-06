package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class StudentJoinClass {

    @FXML
    private Button Back;

    @FXML
    private Button Submit;

    @FXML
    private TextField ClassroomCode;

    @FXML
    void Back(ActionEvent event) {
        Main.s.setWidth(310);
        Main.s.setHeight(390);
        Main.s.setScene(Controller.studentmenu);
    }

    @FXML
    void Submit(ActionEvent event) {
        Controller.BL.classrooms.Enrollstudent(ClassroomCode.getText(), Controller.BL.students.GetloggedInStudent());
        Main.s.setWidth(565);
        Main.s.setHeight(312);
        Main.s.setScene(Controller.studentmenu);
    }

}


