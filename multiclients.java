package multiclient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class multiclients {
	public static void main( String[] args ){
		try{
			Socket socket = new Socket("127.0.0.1", 2013);
			socket.setSoTimeout(60000);
			
			PrintWriter pwriter = new PrintWriter(socket.getOutputStream(),true);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String res = "";
			while(res.indexOf("bye") == -1){
				BufferedReader sysBuff = new BufferedReader(new InputStreamReader(System.in));
				pwriter.println(sysBuff.readLine());
				pwriter.flush();
				
				res = bReader.readLine();
				System.out.println("Server say : "+res);
			}
			
			pwriter.close();
			bReader.close();
			socket.close();
		}catch(Exception e){
			System.out.println("Exception: " + e);
		}
	}
}
