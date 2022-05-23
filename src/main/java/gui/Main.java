package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    public static Stage s;
    public static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        s= stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        scene = new Scene(fxmlLoader.load(), 565, 312);
        s.setTitle("Classroom Management System");
       // s.setResizable(false);
       // s.setFullScreen(true);
        // autoresize
        s.setScene(scene);
        s.show();
    }



    public static void main(String[] args) {
        launch();
    }
}