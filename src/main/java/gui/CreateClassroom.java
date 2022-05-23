package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CreateClassroom {

    private String classromes;
    @FXML
    private TextField InstructorEmail;
    @FXML
    private Button Back;

    @FXML
    private TextField CourseCode;

    @FXML
    private TextField CourseName;

    @FXML
    private Button Submit;

    @FXML
    void Back(ActionEvent event) {

    }
    static String getAlphaNumericString(int n)
    {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++)
        {
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
    @FXML
    void Submit(ActionEvent event) {
        String clasromcode = getAlphaNumericString(8);
        Controller.BL.classrooms.createclassroom(clasromcode,InstructorEmail.getText(),classromes,CourseName.getText());
        Main.s.setWidth(565);
        Main.s.setHeight(312);
        Main.s.setScene(Controller.teachermenu);
    }

}
