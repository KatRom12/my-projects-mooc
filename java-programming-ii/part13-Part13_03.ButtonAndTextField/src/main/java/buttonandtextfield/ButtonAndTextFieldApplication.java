package buttonandtextfield;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class ButtonAndTextFieldApplication extends Application{

    @Override
    public void start(Stage window){
        TextField textField = new TextField();
        Button button = new Button("Button");
        
        FlowPane group = new FlowPane();
        group.getChildren().addAll(textField, button);
        
        Scene view = new Scene(group);
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
