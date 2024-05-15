/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chessboard;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import static javafx.scene.paint.Color.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class ChessBoard extends Application {
    @Override
    public void start(Stage primaryStage)
    {
        
        GridPane grid = new GridPane();
        int start = 0;
        int s= 60;
        for (int i = 0; i < 10; i++) {
      start++;
      for (int j = 0; j < 10; j++) {
        Rectangle r = new Rectangle(s, s, s, s);
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
