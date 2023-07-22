import java.net.*;
import java.io.*;
public class TCPServer1
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
String str1 = (String)dis.readUTF();

if(str.equals("shantanu") && str1.equals("gaikwad"))
System.out.println("Login Successfully");
else
System.out.println("Login UnSuccessful");
ss.close();
dos.close();
dis.close();
}
}