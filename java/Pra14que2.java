import java.net.*;
import java.util.*;
public class Pra14que2
{
public static void main(String [] args)
{
System.out.println("Enter the host name :");
Scanner in = new Scanner(System.in);
String sn = in.next();
try
{
System.out.println("\r\n");
InetAddress ip=InetAddress.getByName(sn);
System.out.println("Host Name: "+ip.getHostName());
System.out.println("IP Address: "+ip.getHostAddress());
}
catch(Exception e)
{
System.out.println(e);
}
}
}
