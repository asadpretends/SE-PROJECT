//package gui;
//
//import java.util.List;
//
//import BusinessLogic.Classroom;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.*;
//
//public class DisplayAll{
//
//    @FXML
//    private ListView<Classroom> table;
//
//    @FXML
//    private TextField instructor;
//
//    ObservableList<Classroom> classrooms = FXCollections.observableArrayList();
//
//    public void button(ActionEvent event)
//    {
//        System.out.println(instructor.getText());
//        List<Classroom> object = Controller.BL.classrooms.Display(instructor.getText());
//        classrooms = FXCollections.observableArrayList();
//        for (int i=0;i<object.size();i++)
//        {
//            classrooms.add(object.get(i));
//            table.getItems().add(object.get(i));
//        }
//        for (int i = 0; i< object.size(); i++) {
//            object.get(i).Display();
//        }
//        table.setCellFactory(param->new ListCell<Classroom>(){
//            @Override
//            protected void updateItem(Classroom s,boolean empty){
//                super.updateItem(s,empty);
//                if (empty ||s == null || s.getTeachername() == null)
//                {
//                    setText(null);
//                }
//                else
//                {
//                    setText(s.getTeachername() + "\t\t" + s.getTimee() + "\t\t" + s.getDatee());
//                }
//            }
//        });
//    }
//    @FXML
//    void Back(ActionEvent event) {
//        Main.s.setWidth(565);
//        Main.s.setHeight(312);
//        Main.s.setScene(Controller.teachermenu);
//    }
//}