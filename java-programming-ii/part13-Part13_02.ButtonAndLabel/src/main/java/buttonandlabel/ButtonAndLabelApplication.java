package buttonandlabel;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;


public class ButtonAndLabelApplication extends Application{
    
    @Override
    public void start(Stage window){
        Label text = new Label("Text element");
        Button button = new Button("The button");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(text);
        componentGroup.getChildren().add(button);
        
        Scene view = new Scene(componentGroup);
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
