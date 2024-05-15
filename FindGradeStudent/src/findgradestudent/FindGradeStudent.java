/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findgradestudent;

import java.sql.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author epicb
 */
public class FindGradeStudent extends Application{

   // Statement for executing queries
  private Statement stmt;
  private TextField tfSSN = new TextField();
  //private TextField tfCourseId = new TextField();
  private TextArea TaStatus = new TextArea();
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Initialize database connection and create a Statement object
    initializeDB();
    Button btShowGrade = new Button("Show Grade");
    HBox hBox = new HBox(5);
    hBox.getChildren().addAll(new Label("SSN"), tfSSN, 
      (btShowGrade));
    VBox vBox = new VBox(10);
    vBox.getChildren().addAll(hBox, TaStatus);
    
    tfSSN.setPrefColumnCount(6);
    
    btShowGrade.setOnAction(e -> showGrade());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(vBox, 420, 80);
    primaryStage.setTitle("FindGrade"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage   
  }
  private void initializeDB() {
    try {
      // Load the JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");
//      Class.forName("oracle.jdbc.driver.OracleDriver");
      System.out.println("Driver loaded");
      // Establish a connection
      Connection connection = DriverManager.getConnection
        ("jdbc:mysql://localhost/javabook", "scott", "tiger");
//    ("jdbc:oracle:thin:@liang.armstrong.edu:1521:orcl",
//     "scott", "tiger");
      System.out.println("Database connected");
      // Create a statement
      stmt = connection.createStatement();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  private void showGrade() {
    String ssn = tfSSN.getText();
    //String courseId = tfCourseId.getText();
    try { // couldnt figure out the correct query to return whats wanted 
      String queryString = "select firstName, mi, " +
        "lastName, title, grade from Student NATURAL join Enrollment NATURAL join Course " +
        "where Student.ssn = '" + ssn + "' and Enrollment.ssn "
        + "= '" + ssn +
        "' Group by  Course.Title" ;
      ResultSet rset = stmt.executeQuery(queryString);
      if (rset.next()) {
          while(rset.next())
          {
        String lastName = rset.getString(1);
        String mi = rset.getString(2);
        String firstName = rset.getString(3);
        String title = rset.getString(4);
        String grade = rset.getString(5);
        // Display result in a label
        
        TaStatus.appendText(firstName + " " + mi +
          " " + lastName + "'s grade on course " + title + " is " +
          grade + "\n");
          }
      } else {
        TaStatus.setText("Not found");
      }
    }
    catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
  public static void main(String[] args) {
    launch(args);
  }
}