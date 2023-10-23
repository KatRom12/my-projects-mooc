package smiley;

import java.awt.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class SmileyApplication extends Application{
    
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        
        Canvas canvas = new Canvas(250, 250);
        GraphicsContext painter = canvas.getGraphicsContext2D();
        
        painter.fillRect(60, 20, 30, 30);
        painter.fillRect(160, 20, 30, 30);
        painter.fillRect(30, 120, 30, 30);
        painter.fillRect(190, 120, 30, 30);
        painter.fillRect(60, 150, 130, 30);
        
        
        layout.setCenter(canvas);
        
        
        Scene view = new Scene(layout, 300, 300);
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
