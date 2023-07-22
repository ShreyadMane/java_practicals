import java.io.*;
import java.net.*;
public class PrimeClient
{
public static void main(String [] args) throws Exception
{
Socket s = new Socket("localhost",6667);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Username :");
String str = br.readLine();
System.out.println("Enter Password :");
String str1 = br.readLine();
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
DataInputStream din = new DataInputStream(s.getInputStream());
dout.writeUTF(str);
dout.writeUTF(str1);
OutputStream os = s.getOutputStream();
PrintStream ps = new PrintStream(os);
ps.print(":");

s.close();
}
}