package textstatistics;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import java.util.Arrays;

public class TextStatisticsApplication extends Application{
    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
    
    @Override
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        TextArea field = new TextArea();
        Label letters = new Label();
        Label word = new Label();
        Label longy = new Label();
        
        field.textProperty().addListener((change, oldValue, newValue) ->{
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            letters.setText("Letters: " + String.valueOf(characters));
            word.setText("Words: " + String.valueOf(words));
            longy.setText("The longest word is: " + longest);
        });
        
        HBox texts = new HBox();
        texts.setSpacing(10);
        texts.getChildren().add(letters);
        texts.getChildren().add(word);
        texts.getChildren().add(longy);
        
        layout.setCenter(field);
        layout.setBottom(texts);
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    

   
}
