package com.mycompany.bmi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

  @FXML
    private TextField Weight;

    @FXML
    private TextField Height;

    @FXML
    private Button button;

    @FXML
    private TextField display;
    
     @FXML
    private TextField ValueDisplay;

    @FXML
    private TextField StatusDisplay;
    
    @FXML
    private Button reset;

    
    
    @FXML
    void HandleButtonAction(ActionEvent event)  throws IOException {
      try {
            Double weightval = Double.parseDouble(Weight.getText());
            Double heightval = Double.parseDouble(Height.getText());
            Double bmi = weightval/((heightval/100)*(heightval/100));
            
           
         
            setResult(bmi);
            
        } catch(NumberFormatException nf){
            Weight.setText("Check the required field");
            Weight.selectAll();
            Weight.requestFocus();
            Height.setText("Check the required field");
            Height.selectAll();
            
        }
    }
    void setResult(Double bmi){
         DecimalFormat DF= new DecimalFormat("#.00");
        ValueDisplay.setText(String.valueOf(DF.format(bmi)));
        
        if(1<=bmi && bmi<=16.99){
            StatusDisplay.setText(" Severely Underweight");
        } else if (17.00<=bmi && bmi<=18.59  ){
            StatusDisplay.setText("Underweight");
        }
        else if (18.60<= bmi &&bmi <= 24.99){
            StatusDisplay.setText("Healthy, Normal Weight");
        }else if (25.00 <= bmi && bmi <= 29.99){
            StatusDisplay.setText("Overweight");
        }else if(30<=bmi && bmi<=34.99) {
            StatusDisplay.setText("Obesity Class I");
            
        } else if(35<=bmi && bmi<=39.99) {
            StatusDisplay.setText("Obesity Class II");
        }  else if(40<=bmi && bmi<=700) {
            StatusDisplay.setText("Obesity Class III");
            
         }  
        
        else{
       StatusDisplay.setText("Invalid BMI");

    }
    }
    @FXML
    void reset(ActionEvent event)  throws IOException{
      ValueDisplay.clear(); 
      StatusDisplay.clear();
      Weight.clear();
      Height.clear();
     
     
    }
   
} 
        
    