import java.awt.*;
import java.awt.event.*;
class Practical_13 extends Frame
{
Practical_13()
{
setSize(600,600);
setTitle("Practical_13");
addWindowListener(new WindowHandler());
}
class WindowHandler extends WindowAdapter
{
public void windowIconified(WindowEvent e)
{
System.out.println("Window is Minimize");
System.out.println("Window Event : window Iconified");
System.out.println("\r\n");
}
public void windowDeiconified(WindowEvent e)
{
System.out.println("\r\n");
System.out.println("Window is Maximize");
System.out.println("Window Event : window Deiconified");
}
}
public static void main(String [] args)
{
Practical_13 t = new Practical_13();

t.setVisible(true);
}
}