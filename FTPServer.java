package server;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FTPServer extends ServerSocket{
	private static final int PORT = 2013;
	
	private ServerSocket server;
	private Socket client;
	private DataInputStream dis;
	private FileOutputStream fos;
	
	public FTPServer() throws Exception{
		try{
			server = new ServerSocket(PORT);
			
			while(true){
				client = server.accept();
				
				dis = new DataInputStream(client.getInputStream());
				
				String fileName = dis.readUTF();
				long fileLength = dis.readLong();
				fos = new FileOutputStream(new File("E:\\"+fileName));
				
				byte[] sendBytes = new byte[1024];
				int transLen = 0;
				System.out.println("------ Start to receive files <" + fileName+">, the size of the file is <"+fileLength+"> ------");
				
				while(true){
					int read = 0;
					read = dis.read(sendBytes);
					if(read == -1)
						break;
					transLen += read;
					System.out.println("The process of receving file <" + fileName+"> is " + 100.0*transLen/fileLength + "% ...");
					
					fos.write(sendBytes, 0, read);
					fos.flush();
				}
				System.out.println("------ Receive file <"+fileName+"> successfully ---------");
				client.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(dis != null){
				dis.close();
			}
			if(fos != null){
				fos.close();
			}
			server.close();
		}
	}
	
	public static void main(String[] args) throws Exception{
		new FTPServer();
	}
}
