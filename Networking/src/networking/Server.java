/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author epicb
 */
public class Server {
    public static void main(String[] args) {
    try{
        ServerSocket serverSocket = new ServerSocket(8000); // socket for server
        
        Socket socket = serverSocket.accept(); // if connection is made with server socket at port 8000, accept the connection and store it in this socket
        
        DataInputStream inputFromClient = new DataInputStream(socket.getInputStream()); 
        DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
        
        while(true)
        {
            double radius = inputFromClient.readDouble();
            double area = radius * radius * Math.PI;
            
            outputToClient.writeDouble(area);
        }
    }
    catch(IOException ex){
        ex.toString();
    }
    }

    
}
