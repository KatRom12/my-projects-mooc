package notifier;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;




public class NotifierApplication extends Application {
    @Override
    public void start(Stage window){
        TextField textField = new TextField();
        Button button = new Button("Update");
        Label text = new Label();
        
        button.setOnAction(event -> {
            text.setText(textField.getText());
        });
        
        VBox layout = new VBox();
        layout.getChildren().addAll(textField, button, text);
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
