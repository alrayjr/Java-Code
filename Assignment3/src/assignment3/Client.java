
package assignment3;

import java.io.*;
import java.net.Socket;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.*;

public class Client extends Application{
    DataOutputStream toServer = null; 
    DataInputStream fromServer = null;
    @Override
    public void start(Stage stage)
    {
        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(10, 10, 10, 10)); 
        paneForTextField.setStyle("-fx-border-color: green");
        Label namel = new Label("Name: ");
        namel.setTextFill(Color.color(0, .6, 1));
        paneForTextField.setLeft(namel);
        TextField tf = new TextField();
        tf.setAlignment(Pos.BOTTOM_LEFT);
        
        
        paneForTextField.setCenter(tf);
        
        
        
        BorderPane mainPane = new BorderPane();
        // Text area to display contents 
        TextArea ta = new TextArea(); 
        mainPane.setCenter(new ScrollPane(ta));
        mainPane.setTop(paneForTextField);
        ta.setEditable(false);
        
        BorderPane messagePane = new BorderPane();
        messagePane.setPadding(new Insets(10, 10, 10, 10)); 
        messagePane.setLeft(new Label("Message: "));
        TextField tf2 = new TextField();
        tf2.setAlignment(Pos.BOTTOM_LEFT);
        messagePane.setCenter(tf2);
        Button button = new Button("Send to Server");
        messagePane.setRight(button);
        mainPane.setBottom(messagePane);

        // Create a scene and place it in the stage 
        Scene scene = new Scene(mainPane, 480, 275);
        stage.setTitle("Client"); // Set the stage title 
        stage.setScene(scene); // Place the scene in the stage 
        stage.show(); // Display the stage 
        
        button.setOnAction(e -> {
            try {
                
                // Get the message and name from the text field 
                String message = tf2.getText();
                String name = tf.getText();
                // Send the message and to the server
                toServer.writeUTF(name + ": " + message);
                toServer.flush();
                // Display to the text area 
                ta.appendText(name +": "+ message +"\n");
               
                
            }
            catch (IOException ex) {
                System.err.println(ex);
            }
        });
        tf2.setOnAction(e -> {
            try {
                
                // Get the message and name from the text field 
                String message = tf2.getText();
                String name = tf.getText();
                // Send the message and to the server
                toServer.writeUTF(name + ": " + message);
                toServer.flush();
                // Display to the text area 
                ta.appendText(name +": "+ message +"\n");
               
                
            }
            catch (IOException ex) {
                System.err.println(ex);
            }
        });
        try {
            // Create a socket to connect to the server 
            Socket socket = new Socket("localhost", 8000); 
            // Create an input stream to receive data from the server 
            fromServer = new DataInputStream(socket.getInputStream()); 
            // Create an output stream to send data to the server 
            toServer = new DataOutputStream(socket.getOutputStream()); 
            }
        catch (IOException ex) {
            ta.appendText(ex.toString() + '\n');
        }
        new Thread(() -> {
            try{
            while (true) {
                
                    // Receive message from the server
                    String message = fromServer.readUTF();
                    // dispaly message
                    Platform.runLater(() -> {
                    ta.appendText(message + '\n');
                   
                    });
                    
                }
            }
            catch(IOException ex) {
                ex.printStackTrace();
            }
            
        }).start();
        
        
    }
    public static void main(String[] args) {
       Application.launch();
    }
    
}