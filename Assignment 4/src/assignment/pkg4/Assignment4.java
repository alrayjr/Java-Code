
package assignment.pkg4;


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


public class Assignment4 extends Application{
// Statement for executing queries
  private Statement stmt;
  private TextField tblName = new TextField();
  //private TextField tfCourseId = new TextField();
  private TextArea TaStatus = new TextArea();
  
  @Override // Override the start method in the Application class
  
  public void start(Stage primaryStage) {
    // Initialize database connection and create a Statement object
    initializeDB();
    Button btShowGrade = new Button("Show Contents");
    HBox hBox = new HBox(5);
    hBox.getChildren().addAll(new Label("Table Name:"), tblName, 
      (btShowGrade));
    VBox vBox = new VBox(10);
    vBox.getChildren().addAll(hBox, TaStatus);
    
    tblName.setPrefColumnCount(6);
    
    btShowGrade.setOnAction(e -> showGrade());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(vBox, 420, 80);
    primaryStage.setTitle("Display Table"); // Set the stage title
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
    String tblNm = tblName.getText();
    
    try {  
      String queryString = "select * from " + tblNm ;
      ResultSet rset = stmt.executeQuery(queryString);
      ResultSetMetaData rsetmd = rset.getMetaData();
      int columnNum = rsetmd.getColumnCount();
      String columnNm = rsetmd.getColumnName(columnNum);
      
    
      if (rset.next()) {
          for(int i = columnNum; i > 0 ; i--)
      {
          String clmNm = rsetmd.getColumnName(i);
          TaStatus.appendText(clmNm + " ");
      }
          
     TaStatus.appendText("\n");
          while(rset.next())
          {
               for(int x = columnNum; x > 0; x--)
      {
          
        String test = rset.getString(x);
        
       
        // Display result in a label
        
        TaStatus.appendText( test + "       ");
        
          }
               TaStatus.appendText("\n");
      }
      } 
      else {
        TaStatus.setText("Not found");
      }
    }
    catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
    
    public static void main(String[] args) {
     launch(args);    }
    
}
