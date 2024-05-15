/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package lab6;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author epicb
 */
public class LabSixFXMLController implements Initializable {

    @FXML 
    private ImageView ImgPok;
    @FXML 
    private TextField xField;
    @FXML 
    private TextField yField;
    @FXML 
    private TextField angField;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
     @FXML
    private void Animate (ActionEvent event) {
        int ang = Integer.parseInt(angField.getText());
        int X = Integer.parseInt(xField.getText());
        int Y = Integer.parseInt(yField.getText());
        
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(ImgPok);
        translate.setDuration(Duration.millis(500));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setInterpolator(Interpolator.LINEAR);
        translate.setByX(X);
        translate.setByX(Y);
        translate.setAutoReverse(true);
        translate.play();
        
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(ImgPok);
        rotate.setDuration(Duration.millis(1000));
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        
        rotate.setByAngle(ang);
        rotate.setAutoReverse(true);
        rotate.play();
        }
    @FXML
    private void Rotate(ActionEvent event) {
        int ang = Integer.parseInt(angField.getText());
        
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(ImgPok);
        rotate.setDuration(Duration.millis(500));
        //rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(ang);
        rotate.setAutoReverse(false);
        rotate.play();
        }
    @FXML
    private void Translate(ActionEvent event) {
        int X = Integer.parseInt(xField.getText());
        int Y = Integer.parseInt(yField.getText());
        
         TranslateTransition translate = new TranslateTransition();
        translate.setNode(ImgPok);
        translate.setDuration(Duration.millis(500));
        //translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setInterpolator(Interpolator.LINEAR);
        translate.setByX(X);
        translate.setByY(Y);
        translate.setAutoReverse(false);
        translate.play();
        }

    }
    

