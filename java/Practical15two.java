import java.net.*;
import java.util.*;
class Practical15two
{
public static void main(String [] args) throws MalformedURLException
{
System.out.println("Enter URL :-");
Scanner in = new Scanner(System.in);
String sn = in.next();
try

{
System.out.println("\r\n");
URL hp = new URL("http://www.msbte.org.in");
URLConnection uc = hp.openConnection();
Date d = new Date();
System.out.println("Date :- "+d.getDate()+" - "+d.getMonth()+" -"+d.getYear());
System.out.println("Content Type :- "+uc.getContentType());
System.out.println("Content Length :- "+uc.getContentLength());
}
catch(Exception e)
{
System.out.println(e);
}
}
}
