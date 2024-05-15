
package databasefirst;
import java.sql.*;
/**
 *
 * @author epicb
 */
public class DatabaseFirst {

    public static void main(String[] args) throws SQLException, ClassNotFoundException { // main class can throw exceptions
        //Class.forName("oracle.jbdc.driver.OracleDriver"); // for oracle driver
        Class.forName("com.mysql.cj.jdbc.Driver"); //for if we were using mySQL
            System.out.println("Drivers Loaded");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook" , "scott", "tiger");
            //Connects to liang.armstrong.edu at port 1521 with username "scott" and password "tiger"
            System.out.println("Database Connected");
            
            Statement statement = connection.createStatement(); // creates statement
            
            ResultSet resultSet = statement.executeQuery("select firstName, mi, lastName from Student where lastName = 'Smith'");
                //results of this query stored in resultSet
                
            while (resultSet.next()) // while there is something in result set
                   System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3));
                   //itterate through resultSet and print all names
                   
        connection.close(); // closes connection
            
        
    }
    
}
