package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketClient {
	public static void main(String[] args){
		try{
			while(true){
				Socket socket = new Socket("127.0.0.1",2013);
				socket.setSoTimeout(60000);
				
				PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);	
				BufferedReader sysBuff = new BufferedReader(new InputStreamReader(System.in));
				pw.println(sysBuff.readLine());
				pw.flush();
				
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String res = bufferedReader.readLine();
				System.out.println("Server say : "+res);
				
				pw.close();
				bufferedReader.close();
				socket.close();
			}
		}catch(Exception e){
			System.out.println("Exception : " + e);
		}
	}
}
