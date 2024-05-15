/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class CalculatorFXMLController implements Initializable {
    @FXML
    private ChoiceBox<String> chcboxArit;
    @FXML
    private Label lblResult;
    @FXML
    private TextField txtFirst;
    @FXML
    private TextField txtSecond;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<String> arithmeticList = 
FXCollections.observableArrayList("Addition", 
                "Subtraction", "Multiplication", "Division");
        
        chcboxArit.setItems(arithmeticList);
        chcboxArit.setValue("Addition");
    }    
    @FXML
    private void clicked(ActionEvent event) {
        
        int first = Integer.parseInt(txtFirst.getText());
        int second = Integer.parseInt(txtSecond.getText());
        int result;
        
        if(chcboxArit.getValue().equals("Addition"))
        {
            result = first + second;
            lblResult.setText(Integer.toString(result));
        }
        else if(chcboxArit.getValue().equals("Subtraction"))
        {
            result = first - second;
            lblResult.setText(Integer.toString(result));
        }
        else if(chcboxArit.getValue().equals("Multiplication"))
        {
            result = first * second;
            lblResult.setText(Integer.toString(result));
        }
        else{
            result = first / second;
            lblResult.setText(Integer.toString(result));
        }
        
    }
    
}