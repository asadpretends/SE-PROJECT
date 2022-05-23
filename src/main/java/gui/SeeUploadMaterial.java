package gui;

import java.util.List;

import BusinessLogic.UploadMaterial;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SeeUploadMaterial{

    @FXML
    private ListView<UploadMaterial> table;


    @FXML
    private TextField ClassroomCode;


    ObservableList<UploadMaterial> uploadMaterials = FXCollections.observableArrayList();

    public void button(ActionEvent event)
    {
        System.out.println(ClassroomCode.getText());
        List<UploadMaterial> object = Controller.BL.classrooms.SeeUploadedMaterial(ClassroomCode.getText());
        uploadMaterials = FXCollections.observableArrayList();
        for (int i=0;i<object.size();i++)
        {
            uploadMaterials.add(object.get(i));
            table.getItems().add(object.get(i));
        }
        for (int i = 0; i< object.size(); i++) {
            object.get(i).Display();
        }
        table.setCellFactory(param->new ListCell<UploadMaterial>(){
            @Override
            protected void updateItem(UploadMaterial s,boolean empty){
                super.updateItem(s,empty);
                if (empty ||s == null || s.getTeachername() == null)
                {
                    setText(null);
                }
                else
                {
                    setText(s.getTeachername() + "\t\t" + s.getTimee() + "\t\t" + s.getDatee());
                }
            }
        });
    }
    @FXML
    void Back(ActionEvent event) {
        Main.s.setWidth(565);
        Main.s.setHeight(312);
        Main.s.setScene(Controller.studentmenu);
    }
}