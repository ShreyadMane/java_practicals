import java.net.*;
import java.io.*;
public class ServerFile
{
            public static void main(String args[])throws IOException
            {
               byte b[]=new byte[3072];
               DatagramSocket dsoc=new DatagramSocket(2019);
               FileOutputStream f=new FileOutputStream("F:\\Project\\Java\\Advanced Java\\4 Networking Basics\\File\\SFile.txt");
                         
                         
                 DatagramPacket dp=new DatagramPacket(b,b.length);
                 dsoc.receive(dp);
                 String data = new String(dp.getData(),0,dp.getLength());  
                                    f.write(data.getBytes(), 0, data.length());
                         
            }
}