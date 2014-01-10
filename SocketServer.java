package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args){
		try{
			ServerSocket serversocket = new ServerSocket(2013);
			while(true){
				Socket socket = serversocket.accept();
				
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String res = bufferedReader.readLine();
				System.out.println("Client say : "+res);
				
				PrintWriter pw = new PrintWriter(socket.getOutputStream());	
				pw.println("Hello Client, I am Server!");
				pw.flush();
				
				pw.close();
				bufferedReader.close();
				socket.close();
			}
		}catch(Exception e){
			System.out.println("Exception : " + e);
		}finally{
			
		}
	}
}
