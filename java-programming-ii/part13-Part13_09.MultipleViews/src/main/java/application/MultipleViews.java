package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class MultipleViews extends Application{

    @Override
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        Button one = new Button("To the second view!");
        layout.setTop(new Label("First view!"));
        layout.setCenter(one);
        
        VBox layoutTwo = new VBox();
        Button two = new Button("To the third view!");
        Label text = new Label("Second view!");
        layoutTwo.getChildren().addAll(two, text);
        
        GridPane layoutThree = new GridPane();
        Label words = new Label("Third view!");
        GridPane.setConstraints(words, 0, 0);
        Button three = new Button("To the first view!");
        GridPane.setConstraints(three, 1, 1);
        layoutThree.getChildren().addAll(words, three);
        
        Scene first = new Scene(layout);
        Scene second = new Scene(layoutTwo);
        Scene third = new Scene(layoutThree);
        
        one.setOnAction((event) -> {
            window.setScene(second);
        });
        
        two.setOnAction((event) -> {
            window.setScene(third);
        });
        
        three.setOnAction((event) -> {
            window.setScene(first);
        });
        
        window.setScene(first);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
