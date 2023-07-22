import java.net.*;
import java.io.*;
public class TCPClient
{
public static void main(String [] args) throws Exception
{
Socket s = new Socket("localhost",6667);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Client Message");
String str = br.readLine();
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
DataInputStream din = new DataInputStream(s.getInputStream());
dout.writeUTF(str);
dout.flush();
str = din.readUTF();
System.out.println("Client Says -"+str);
dout.close();
din.close();
s.close();
}
}
