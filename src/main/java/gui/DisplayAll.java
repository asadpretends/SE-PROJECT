package gui;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import BusinessLogic.Classroom;
import BusinessLogic.Student;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.Callback;

public class DisplayAll{

    @FXML
    private ListView<Student> table;


    @FXML
    private TextField ClassroomCode;

    ObservableList<Student> students = FXCollections.observableArrayList();

    public void button(ActionEvent event)
    {
        System.out.println(ClassroomCode.getText());
        System.out.println(Controller.BL.teachers.GetloggedInTeacher().getEmail());
        List<Student> object = Controller.BL.classrooms.DisplayEnrolledStudents(Controller.BL.teachers.GetloggedInTeacher().getEmail(),ClassroomCode.getText());
        students = FXCollections.observableArrayList();
        for (int i=0;i<object.size();i++)
        {
            students.add(object.get(i));
            table.getItems().add(object.get(i));
        }
        for (int i=0;i< students.size();i++) {
            students.get(i).Display();
        }
        table.setCellFactory(param->new ListCell<Student>(){
            @Override
            protected void updateItem(Student s,boolean empty){
                super.updateItem(s,empty);
                if (empty ||s == null || s.getName() == null)
                {
                    setText(null);
                }
                else
                {
                    setText(s.getName() + "\t" +s.getEmail() + "\t" + s.getProgram());
                }
            }
        });
    }
    @FXML
    void Back(ActionEvent event) {
        Main.s.setWidth(565);
        Main.s.setHeight(312);
        Main.s.setScene(Controller.teachermenu);
    }
}