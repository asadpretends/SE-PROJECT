package gui;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class StudentMenu
{
    @FXML
    private Button Login;

    @FXML
    private Button Register;

    @FXML
    private Button JoinClass;

    @FXML
    private Button Announcements;

    @FXML
    private Button ExitClassroom;

    @FXML
    private Button Material;

    @FXML
    private Button Attendance;

    @FXML
    private Button Profile;

    @FXML
    private Button Logout;

    @FXML
    private Button Exit;

    @FXML
    public void Login() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("StudentLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 363, 360);
        Main.s.setTitle("LogIn Menu");
        Main.s.setScene(scene);
        Main.s.show();
    }
    @FXML
    public void Register(Event e) throws IOException {

            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("StudentRegister.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 363, 360);
            Main.s.setTitle("Register Menu");
            Main.s.setScene(scene);
            Main.s.show();
        }
    @FXML
    public void JoinClass(Event e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("StudentJoinClass.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 426, 114);
        Main.s.setTitle("Join Class Menu");
        Main.s.setScene(scene);
        Main.s.show();
    }
    @FXML
    public void Announcements(Event e){

    }
    @FXML
    public void ExitClassroom(Event e){

    }
    @FXML
    public void Material(Event e){

    }
    @FXML
    public void Attendance(Event e){

    }
    @FXML
    public void Profile(Event e){

    }
    @FXML
    public void Logout(Event e){

    }
    @FXML
    public void Exit(Event e){

    }
}
