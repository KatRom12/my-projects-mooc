package application;

import java.util.Map;
import java.util.HashMap;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import javafx.geometry.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.chart.XYChart;

public class SavingsCalculatorApplication extends Application{
    
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        
        LineChart chart = new LineChart(xAxis, yAxis);
        chart.setTitle("Savings calculator");
        
        VBox box = new VBox();
        box.setPadding(new Insets(10,20,10,20));
        
        BorderPane month = new BorderPane();
        BorderPane year = new BorderPane();
        
         
        Label months = new Label("Monthly savings");
        Slider monthly = new Slider(25, 250, 25);
        monthly.setShowTickMarks(true);
        monthly.setShowTickLabels(true);
        Label endMonth = new Label(monthly.getValue() + "");
        
        Label years = new Label("Yearly interest rate");
        Slider yearly = new Slider(0, 10, 0.1);
        yearly.setShowTickMarks(true);
        yearly.setShowTickLabels(true);
        Label endYear = new Label(yearly.getValue() + "");
        
        month.setLeft(months);
        month.setCenter(monthly);
        month.setRight(endMonth);
        
        year.setLeft(years);
        year.setCenter(yearly);
        year.setRight(endYear);
        
        box.getChildren().addAll(month, year);
        
         
        
        monthly.valueProperty().addListener(event -> {
            chart.getData().clear();
            endMonth.setText((double) Math.round(monthly.getValue()) + "");
            endYear.setText((double) Math.round(yearly.getValue()) + "");
            Savings saving = new Savings(monthly.getValue(), yearly.getValue()); 
            XYChart.Series saveMonthly = new XYChart.Series();
            XYChart.Series savingRate = new XYChart.Series();
            saving.dataToMonthChart().entrySet().stream().forEach(data -> {
                saveMonthly.getData().add(new XYChart.Data(data.getKey(), data.getValue()));
            });
            saving.dataToYearChart().entrySet().stream().forEach(rating -> {
                savingRate.getData().add(new XYChart.Data(rating.getKey(), rating.getValue()));
            });
            chart.getData().add(saveMonthly);
            chart.getData().add(savingRate);
        });
        
        yearly.valueProperty().addListener(event -> {
            chart.getData().clear();
            endMonth.setText((double) Math.round(monthly.getValue()) + "");
            endYear.setText((double) Math.round(yearly.getValue()) + "");
            Savings saving = new Savings(monthly.getValue(), yearly.getValue()); 
            XYChart.Series saveMonthly = new XYChart.Series();
            XYChart.Series savingRate = new XYChart.Series();
            saving.dataToMonthChart().entrySet().stream().forEach(data -> {
                saveMonthly.getData().add(new XYChart.Data(data.getKey(), data.getValue()));
            });
            saving.dataToYearChart().entrySet().stream().forEach(rating -> {
                savingRate.getData().add(new XYChart.Data(rating.getKey(), rating.getValue()));
            });
            chart.getData().add(saveMonthly);
            chart.getData().add(savingRate);
        });
        
        layout.setTop(box);
        layout.setCenter(chart);
        
        Scene scene = new Scene(layout, 640, 480);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

}
