
package lab6;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lab6 extends Application{

    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("LabSIxFXML.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Animation Translation");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
    
}
