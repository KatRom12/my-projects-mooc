package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;


public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) {
        Label instruction = new Label("Enter your name and start.");
        TextField textField = new TextField();
        Button start = new Button("Start");
        
        GridPane startLayout = new GridPane();
        startLayout.add(instruction, 0, 0);
        startLayout.add(textField, 0, 1);
        startLayout.add(start, 0, 2);
        
        startLayout.setPrefSize(300, 180);
        startLayout.setAlignment(Pos.CENTER);
        startLayout.setVgap(10);
        startLayout.setHgap(10);
        startLayout.setPadding(new Insets(20, 20, 20, 20));
        
        Scene logingView = new Scene(startLayout);
      
        StackPane welcomeLayout = new StackPane();
        
        welcomeLayout.setPrefSize(300, 180);
        
        welcomeLayout.setAlignment(Pos.CENTER);
        
        Scene welcomeView = new Scene(welcomeLayout);
        
        start.setOnAction((event) -> {
            String name = textField.getText();
            Label welcome = new Label("Welcome " + name + "!");
            welcomeLayout.getChildren().add(welcome);
            window.setScene(welcomeView);
        });
        
        window.setScene(logingView);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
