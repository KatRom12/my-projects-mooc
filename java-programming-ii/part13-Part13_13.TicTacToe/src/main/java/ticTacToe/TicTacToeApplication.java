package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import java.util.ArrayList;
import javafx.scene.text.Font;


public class TicTacToeApplication extends Application {
    
    @Override
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        
        Label turn = new Label("Turn: X");
        Label end = new Label("The end.");
        
        Button one = new Button(" ");
        Button two = new Button(" ");
        Button three = new Button(" ");
        Button four = new Button(" ");
        Button five = new Button(" ");
        Button six = new Button(" ");
        Button seven = new Button(" ");
        Button eight = new Button(" ");
        Button nine = new Button(" ");
        
        ArrayList<Button> buttonsList = new ArrayList<>();
        GridPane board = new GridPane();
        
        board.setAlignment(Pos.CENTER);
        board.setVgap(10);
        board.setHgap(10);
        board.setPadding(new Insets(10));
        
        
        board.add(one, 0, 0);
        board.add(two, 1, 0);
        board.add(three, 2, 0);
        board.add(four, 0, 1);
        board.add(five, 1, 1);
        board.add(six, 2, 1);
        board.add(seven, 0, 2);
        board.add(eight, 1, 2);
        board.add(nine, 2, 2);
        
        buttonsList.add(one);
        buttonsList.add(two);
        buttonsList.add(three);
        buttonsList.add(four);
        buttonsList.add(five);
        buttonsList.add(six);
        buttonsList.add(seven);
        buttonsList.add(eight);
        buttonsList.add(nine);
        
        for(Button button: buttonsList){
            button.setFont(Font.font("Monospaced", 40));
        }
        
        layout.setTop(turn);
        layout.setCenter(board);
        
        for (Button button: buttonsList){
            button.setOnAction((event) -> {
                    if (turn.getText().equals("Turn: X") && (button.getText().isEmpty() || button.getText().equals(" "))){
                        buttonAction(button, turn, buttonsList, "X", "O");
                    } else if(turn.getText().equals("Turn: O") && (button.getText().isEmpty()|| button.getText().equals(" "))){
                        buttonAction(button, turn, buttonsList, "O", "X");
                    }
                    if(result(one, two, three) || 
                    result(one, four, seven) ||
                    result(one, five, nine) ||
                    result(four, five, six) ||
                    result (two, five, eight) ||
                    result(seven, eight, nine) ||
                    result (three, six, nine) ||
                    result (three, five, seven)) {
                    turn.setText("The end!");
                   } else if (buttonsList.size() < 1){
                    turn.setText("The end!"); 
                   }
            });
        }
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
    
    public boolean result(Button btn, Button but, Button butn){
        if(btn.getText().equals(but.getText()) && btn.getText().equals(butn.getText())){
            return true;
        }
        return false;
    }
    
    public void buttonAction(Button button, Label label, ArrayList<Button> list, String str, String trs){
        button.setText(str);
        label.setText("Turn: " + trs);
        list.remove(button);
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
    
    
    

}
