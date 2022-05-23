package gui;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TeacherRegister {

    @FXML
    private Button Back;

    @FXML
    private TextField CNIC;

    @FXML
    private TextField Email;

    @FXML
    private TextField Name;

    @FXML
    private PasswordField Password;

    @FXML
    private Button Submit;

    @FXML
    public void Submit(Event e)
    {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Teacher Registered");
            alert.setHeaderText("Teacher has been registered successfully.");


            if(alert.showAndWait().get() == ButtonType.OK) {
                Controller.BL.teachers.RegisterTeacher(Name.getText(), Password.getText(), Email.getText(), CNIC.getText());
                Main.s.setWidth(565);
                Main.s.setHeight(312);
                Main.s.setScene(Controller.teachermenu);
        }
    }

    @FXML
    public void Back(Event e)
    {
        System.out.print("hy");
        Main.s.setWidth(565);
        Main.s.setHeight(312);
        Main.s.setScene(Controller.teachermenu);
    }
}
