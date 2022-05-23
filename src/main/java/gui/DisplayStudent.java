package gui;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DisplayStudent {
    @FXML
    private TextArea TextArea;
    private PrintStream ps ;


    public void initialize() {
        ps = new PrintStream(new Console(TextArea)) ;
    }

    public void button(ActionEvent event) {
        System.setOut(ps);
        System.setErr(ps);
        Controller.BL.students.Display();
    }

    public class Console extends OutputStream {
        private TextArea console;

        public Console(TextArea console) {
            this.console = console;
        }

        public void appendText(String valueOf) {
            Platform.runLater(() -> console.appendText(valueOf));
        }

        public void write(int b) throws IOException {
            appendText(String.valueOf((char)b));
        }
    }
}