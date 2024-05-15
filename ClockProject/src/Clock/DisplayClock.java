/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clock;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author epicb
 */
public class DisplayClock extends Application{ // opens java aplication class
    @Override
   public void start(Stage primaryStage) // start stage
   {
       ClockPane clock = new ClockPane(); // new clock
       
       String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond(); //added time string
       
       Label lblCurrentTime = new Label(timeString); // ad time to label
       
       BorderPane pane = new BorderPane(); //creates new border pane
       pane.setCenter(clock); // centers clock
       pane.setBottom(lblCurrentTime); // but label to bottom
       BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER); // centers label
       
       Scene scene = new Scene(pane, 250, 250); // creates new scene
       primaryStage.setTitle("THE BEST CLOCK"); // titles scene
       primaryStage.setScene(scene); // puts scene in front
       primaryStage.show(); // duh
   }
   
   public void runStart()
   {
       Application.launch(); // makes sense
   }
    
}
