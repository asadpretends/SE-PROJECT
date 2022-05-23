package gui;

import BusinessLogic.CMS;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

import java.io.IOException;
import java.util.Optional;

public class Controller
{
    public static CMS BL = new CMS();


    @FXML
    private Button Student;

    @FXML
    private Button Teacher;

    @FXML
    private Button Exit;

    public static Scene studentmenu;
    public static Scene teachermenu;


    @FXML
    public void StudentMenu(Event e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("StudentMenu.fxml"));
        studentmenu = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Student Menu");
        Main.s.setScene(studentmenu);
        Main.s.show();
    }

    @FXML
    public void TeacherMenu(Event e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("TeacherMenu.fxml"));
        teachermenu = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Teacher Menu");
        Main.s.setScene(teachermenu);
        Main.s.show();
    }
    @FXML
    void Exittheprogram(ActionEvent event) {
        Alert newalert = new Alert(Alert.AlertType.CONFIRMATION);
        newalert.setTitle("Confirmation");
        newalert.setContentText("Are you sure");
        Optional<ButtonType> input = newalert.showAndWait();
        if(input.get() == ButtonType.OK)
        {
            Main.s.close();
        }
    }


}