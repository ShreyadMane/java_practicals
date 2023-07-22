import java.awt.*;
import java.awt.event.*;
public class pra13que1
{
Frame f;
pra13que1()
{
f = new Frame("Practical_13");
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
f.dispose();

System.out.println("Anonymous Inner Class Example");
System.out.println("\r\n");
System.out.println("Window is Closed");
}
});
f.setSize(600,600);
f.setVisible(true);
}
public static void main(String [] args)
{
new pra13que1();
}
}