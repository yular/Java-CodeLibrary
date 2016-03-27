package multiclientserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class multicserver extends ServerSocket{
	private static final int SERVER_PORT = 2013;

	public multicserver() throws IOException {
		super(SERVER_PORT);
		
		try{
			while(true) {
				Socket socket = accept();
				new CreateServerThread(socket);
			}
		}catch(IOException e) {
		}finally{
			close();
		}
	}
	
	class CreateServerThread extends Thread {
		private Socket client;
		private BufferedReader bReader;
		private PrintWriter pwriter;
		
		public CreateServerThread(Socket s) throws IOException {
			client  = s;
			
			bReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pwriter = new PrintWriter(client.getOutputStream(),true);
			System.out.println("Client("+ getName() +") come in ...");
			
			start();
		}
		
		public void run() {
			try{
				String line = bReader.readLine();
				
				while(!line.equals("bye")){
					pwriter.println("continue, Client("+getName()+")!");
					line = bReader.readLine();
					System.out.println("Client("+getName()+") say: "+line);
				}
				pwriter.println("bye,Client("+getName()+")!");
				
				System.out.println("Client("+getName()+") exit!");
				pwriter.close();
				bReader.close();
				client.close();
			}catch(IOException e){
			}
		}
	}
	
	public static void main(String[] args)throws IOException {
		new multicserver();
	}
}
