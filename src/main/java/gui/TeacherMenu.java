package gui;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class TeacherMenu
{
    @FXML
    private Button Login;

    @FXML
    private Button Register;

    @FXML
    private Button CreateClassroom;

    @FXML
    private Button EnrolledStudents;

    @FXML
    private Button RemoveStudent;

    @FXML
    private Button Announcements;

    @FXML
    private Button Material;

    @FXML
    private Button Attendance;

    @FXML
    private Button Details;

    @FXML
    private Button Profile;

    @FXML
    private Button Logout;

    @FXML
    private Button Exit;
    public static Stage s;


    @FXML
    public void Login(Event e) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("TeacherLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Login Menu");
        Main.s.setScene(scene);
        Main.s.show();
    }
    @FXML
    public void Register(Event e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("TeacherRegister.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Register Menu");
        Main.s.setScene(scene);
        Main.s.show();
    }
    @FXML
    public void CreateClassroom(Event e) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("CreateClassroom.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Create Classroom Menu");
        Main.s.setScene(scene);
        Main.s.show();

    }
    @FXML
    public void EnrolledStudents(Event e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SeeEnrolledStudents.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Enrolled Students Menu");
        Main.s.setScene(scene);
        Main.s.show();
    }
    @FXML
    public void RemoveStudent(Event e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("RemoveStudent.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Remove Student");
        Main.s.setScene(scene);
        Main.s.show();
    }
    @FXML
    public void Announcements(Event e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MakeAnnouncement.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Make Announcement");
        Main.s.setScene(scene);
        Main.s.show();
    }
    @FXML
    public void Material(Event e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("UploadMaterial.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Upload Material");
        Main.s.setScene(scene);
        Main.s.show();
    }
    @FXML
    public void Attendance(Event e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("TakeAttendance.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Attendance");
        Main.s.setScene(scene);
        Main.s.show();
    }
    @FXML
    public void Details(Event e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("DisplayAll.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Details Display");
        Main.s.setScene(scene);
        Main.s.show();
    }
    @FXML
    public void Profile(Event e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("DisplayProfile.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Display Profile");
        Main.s.setScene(scene);
        Main.s.show();
    }
    @FXML
    public void Logout(Event e) throws Exception {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Teacher Logged Out");
        alert.setHeaderText("Teacher has logged out successfully.");


        if (alert.showAndWait().get() == ButtonType.OK) {
            //   Controller.BL.teachers.RegisterTeacher(Name.getText(), Password.getText(), Email.getText(), CNIC.getText());
            Main.s.setWidth(565);
            Main.s.setHeight(312);
            Main.s.setScene(Main.scene);
        }
    }
    @FXML
    public void Exit(Event e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 565, 312);
        Main.s.setTitle("Display Profile");
        Main.s.setScene(scene);
        Main.s.show();
    }
}
