
package animate;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;


public class TranslateRotationFXMLController implements Initializable {

    @FXML 
    private ImageView ImgFlag;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(ImgFlag);
        translate.setDuration(Duration.millis(1000));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setInterpolator(Interpolator.LINEAR);
        translate.setByX(100);
        translate.setAutoReverse(true);
        translate.play();
        
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(ImgFlag);
        rotate.setDuration(Duration.millis(1000));
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        
        rotate.setByAngle(360);
        rotate.setAutoReverse(true);
        rotate.play();
        
    }    
    
}
