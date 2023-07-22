import java.net.*;
import java.io.*;
public class TCPServer
{
public static void main(String [] args) throws Exception
{
ServerSocket ss = new ServerSocket(6667);
System.out.println("Server is waiting for client");
Socket s = ss.accept();
System.out.println("Connection Established");
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
DataInputStream dis = new DataInputStream(s.getInputStream());
String str = (String)dis.readUTF();
System.out.println("Client Says :"+str);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Server Message");
str = br.readLine();
dos.writeUTF(str);
System.out.println("Reply to client :"+str);
ss.close();
dos.close();
dis.close();
}
}
