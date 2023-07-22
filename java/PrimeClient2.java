import java.io.*;
import java.net.*;
public class PrimeClient2
{
public static void main(String [] args) throws Exception
{
Socket s = new Socket("localhost",6667);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Number :");
int n = Integer.parseInt(br.readLine());
OutputStream os = s.getOutputStream();
PrintStream ps = new PrintStream(os);
ps.println(n);
BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
int c = br1.read();
while(c != -1)
{
System.out.println((char)c);
c = br1.read();
}
s.close();
}
}
