
package javafxfirst;


import java.awt.Color;
import java.awt.Insets;
import java.awt.Rectangle;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import static javafx.scene.paint.Color.WHITE;


public class JavaFxFirst extends Application {
    @Override
    public void start(Stage primaryStage)
    {
        
        GridPane grid = new GridPane();
        int start = 0;
        int s= 60;
        for (int i = 0; i < 10; i++) {
      start++;
      for (int j = 0; j < 10; j++) {
        javafx.scene.shape.Rectangle r = new javafx.scene.shape.Rectangle(s, s, s, s);
        if (start % 2 != 0)
          r.setFill(WHITE);
        grid.add(r, j, i);
        start++;
      }
     }
        
        
       
        Scene scene = new Scene(grid, 600, 600);
        primaryStage.setTitle("chessboard"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }
    public static void main(String[] args) {
        Application.launch();
    }
 
}
