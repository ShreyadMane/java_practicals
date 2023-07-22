import java.io.*;
import java.net.*;
public class PrimeServer1
{
public static void main(String [] args) throws Exception
{
ServerSocket ss = new ServerSocket(6667);
System.out.println("Server Waiting for Client...");
Socket s = ss.accept();
System.out.println("Connection Established");
BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
int n = Integer.parseInt(br.readLine());
OutputStream os = s.getOutputStream();
PrintStream ps = new PrintStream(os);
int i=2;
boolean flag = false;
while(i<=n/2)
{
if(n%i == 0)
{
flag = true;
break;
}
++i;
}
if(! flag)

ps.print(n+"is a prime number");
else
ps.print(n+"isn't prime number");
}
}