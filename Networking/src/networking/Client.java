/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;


public class Client 
{
    public static void main(String[] args) {
        
        try{ // try and catch for if connection isnt made and you get error
          Socket socket = new Socket("localhost", 8000);  // socket for client
        //Socket socket = new Socket("floridapoly.edu", 8000);
        
        DataInputStream fromServer = new DataInputStream(socket.getInputStream()); // stream that recives data/responce from sever
        DataOutputStream toServer = new DataOutputStream(socket.getOutputStream()); // stream that sends data to server
        
        while(true)
        {
            Random rn = new Random();
            double radius = rn.nextInt(10) + 1; // radius from 1 to 10
            
            toServer.writeDouble(radius); // radius is double
            toServer.flush(); // send radius as double to server
            
            double area = fromServer.readDouble(); // get aread that is a double from server and set it to area here 
            
            System.out.println("The area of radius " + radius + " is " + area);
        }
        }
        catch(IOException ex){
            
        }
    }
}
