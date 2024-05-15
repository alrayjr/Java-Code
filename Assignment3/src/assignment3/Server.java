
package assignment3;
import java.io.*;
import java.net.*;
import java.net.Socket;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.*;

public class Server extends Application{

    @Override
    public void start(Stage stage)
    {
        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(10, 10, 10, 10)); 
        paneForTextField.setStyle("-fx-border-color: green");
        Label namel = new Label("Name: ");
        namel.setTextFill(Color.color(1, 0, 0));
        paneForTextField.setLeft(namel);
        TextField tf = new TextField();
        
        
        paneForTextField.setCenter(tf);
        
        
        
        BorderPane mainPane = new BorderPane();
        // Text area to display contents 
        TextArea ta = new TextArea();
        ta.setEditable(false);
   
        BorderPane messagePane = new BorderPane();
        messagePane.setPadding(new Insets(10, 10, 10, 10)); 
        messagePane.setLeft(new Label("Message: "));
        
        TextField tf2 = new TextField();
        messagePane.setCenter(tf2);
        
        Button button = new Button("Send to Client");
        messagePane.setRight(button);
        
        mainPane.setTop(paneForTextField);
        mainPane.setCenter(new ScrollPane(ta)); //sets ta in a scrollpane to center of 
        mainPane.setBottom(messagePane); //sets messagepane to bottom of main pane
        
        // Create a scene and place it in the stage 
        Scene scene = new Scene(mainPane, 480, 275);
        stage.setTitle("Server"); // Set the stage title 
        stage.setScene(scene); // Place the scene in the stage 
        stage.show(); // Display the stage 
      
        
        
         new Thread(() -> {
            try {
                // Create a server socket 
                ServerSocket serverSocket = new ServerSocket(8000); 
                Platform.runLater(() ->
                ta.appendText("Server started at " + new Date() + '\n'));
                // Listen for a connection request 
                Socket socket = serverSocket.accept(); 
                // Create data input and output streams 
                DataInputStream inputFromClient = new DataInputStream(
                socket.getInputStream());
                DataOutputStream outputToClient = new DataOutputStream(
                socket.getOutputStream());
                
                  
        button.setOnAction(e -> {
            try {
                // Get the message and name from the text field 
                String message = tf2.getText();
                String name = tf.getText();
                // Send the message and to the client
                outputToClient.writeUTF(name + ": " + message);
                outputToClient.flush();
                // Display to the text area
                Platform.runLater(() -> {   
                ta.appendText(name +": "+ message +"\n");
                
                });
                
                
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
                // Send the message and to the client
                outputToClient.writeUTF(name + ": " + message);
                outputToClient.flush();
                // Display to the text area
                Platform.runLater(() -> {   
                ta.appendText(name +": "+ message +"\n");
                
                });
                
                
            }
            catch (IOException ex) {
                System.err.println(ex);
            }
        });
                
                while (true) {
                    // Receive message from the client 
                    String message = inputFromClient.readUTF();
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
