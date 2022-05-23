package gui;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class StudentMenu {

    @FXML
    private Button Exit;

    @FXML
    private Button JoinClassroom;

    @FXML
    private Button LeaveClassroom;

    @FXML
    private Button Login;

    @FXML
    private Button Logout;

    @FXML
    private Button Register;

    @FXML
    private Button SeeAnnouncements;

    @FXML
    private Button SeeAttendance;

    @FXML
    private Button SeeProfile;

    @FXML
    private ImageView TeacherDep;

    @FXML
    private Button UploadMaterial;

    @FXML
    void Exit(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Display Profile");
        Main.s.setScene(scene);
        Main.s.show();
    }

    @FXML
    public void JoinClassroom(Event e) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("StudentJoinClass.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        System.out.println("hello");
        Main.s.setTitle("Create Classroom Menu");
        Main.s.setScene(scene);
        Main.s.show();

    }

    @FXML
    void LeaveClassroom(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("LeaveClassroom.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Leave Classroom");
        Main.s.setScene(scene);
        Main.s.show();
    }


    @FXML
    public void Login(Event e) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("StudentLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Login Menu");
        Main.s.setScene(scene);
        Main.s.show();
    }

    @FXML
    void Logout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Student Logged Out");
        alert.setHeaderText("Student has logged out successfully.");


        if (alert.showAndWait().get() == ButtonType.OK) {
            //   Controller.BL.teachers.RegisterTeacher(Name.getText(), Password.getText(), Email.getText(), CNIC.getText());
            Main.s.setWidth(565);
            Main.s.setHeight(312);
            Main.s.setScene(Main.scene);
        }
    }

    @FXML
    public void Register(Event e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("StudentRegister.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Register Menu");
        Main.s.setScene(scene);
        Main.s.show();
    }

    @FXML
    void SeeAnnouncements(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SeeAnnouncements.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Announcements");
        Main.s.setScene(scene);
        Main.s.show();
    }

    @FXML
    void SeeAttendance(ActionEvent event) {

    }

    @FXML
    void SeeProfile(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("DisplayStudent.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Announcements");
        Main.s.setScene(scene);
        Main.s.show();
    }

    @FXML
    void UploadMaterial(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SeeUploadMaterial.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Announcements");
        Main.s.setScene(scene);
        Main.s.show();
    }

}
