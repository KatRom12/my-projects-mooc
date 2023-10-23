package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import java.util.Map;
import java.util.HashMap;


public class ShanghaiApplication extends Application{
    
    @Override
    public void start(Stage window){
        Map<Integer, Integer> values = new HashMap<>();
        
        values.put(2007, 73);
        values.put(2008, 68);
        values.put(2009, 72);
        values.put(2010, 72);
        values.put(2011, 74);
        values.put(2012, 73);
        values.put(2013, 76);
        values.put(2014, 73);
        values.put(2015, 67);
        values.put(2016, 56);
        values.put(2017, 56);
        
        
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        
        XYChart.Series rankingPlace = new XYChart.Series();
        values.keySet().stream().forEach(pair -> {
            rankingPlace.getData().add(new XYChart.Data(pair, values.get(pair)));
        });
        
        lineChart.getData().add(rankingPlace);
        
        Scene view = new Scene(lineChart, 640, 480);
        window.setScene(view);
        window.show();
        
        
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}
