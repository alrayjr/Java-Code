
package platformexample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PlatformExample extends Application{ // making an application
    private String text = "";
    
    @Override
    public void start(Stage primaryStage)
    {
        StackPane pane = new StackPane(); // make pane
        Label lblText = new Label("Programming is fun!"); // make label
        pane.getChildren().add(lblText); // add label to pane
        
        
        
        new Thread(new Runnable() // creates new thread from runnable interface,notice syntax
        {
            @Override 
            public void run(){
                try{ // try for possible exception
                    while(true) // infinite loop
                    {
                        if(lblText.getText().trim().length() == 0) // if text is empty
                        {
                            text = "Welcome";
                        }
                        else   
                            text = "";
                        
                        Platform.runLater(new Runnable() // creates new thread in this thread to allow GUI to work and not only run 
                        {
                        @Override 
                        public void run()
                         {
                                lblText.setText(text);
                            }
                        
                        }); // closes inner thread
                        Thread.sleep(1000); // thread will run every second
                    }
                }
                catch(Exception ex)
                {
                    
                }
            }
        }).start(); // closes outer thread and starts
        Scene scene = new Scene(pane, 200,200);
        primaryStage.setTitle("Flash Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

 
    public static void main(String[] args) {
        Application.launch();
    }
    
}
