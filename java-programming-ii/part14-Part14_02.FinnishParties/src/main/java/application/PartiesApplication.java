package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.NumberAxis;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class PartiesApplication extends Application {
    
    public void start(Stage window){
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        
        Map<String, Map<Integer, Double>> data = datas();
        data.keySet().stream().forEach(party -> {
            XYChart.Series dane = new XYChart.Series();
            dane.setName(party);
            data.get(party).entrySet().stream().forEach(pair -> {
                dane.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });
            lineChart.getData().add(dane);
        });
        
        Scene view = new Scene(lineChart, 640, 480);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) throws Exception{
        launch(PartiesApplication.class);
    }
    
    public Map<String, Map<Integer, Double>> datas () {
        Map<String, Map<Integer, Double>> values = new HashMap<>();
        
        List <String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))){
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                list.add(row);
            } 
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage() );
        }
        
        list.remove(0);
        
        for (String rowy: list){
            for(int i = 1; i < list.size(); i++){
                String[] parties = rowy.split("\t");
                String partyName = parties[0];
                int year = 1968;
                Map<Integer, Double> results = new HashMap<>();
                for(int p = 1; p < parties.length; p++){
                    if(!(parties[p].equals("-"))){
                       results.put(year, Double.valueOf(parties[p])); 
                    } 
                    
                    year +=4;
                }
                values.put(partyName, results);
            }
        }
        
        
        return values;
    }

}
