import java.applet.*;
import java.awt.*;

public class test extends Applet
/*<applet code ="test" width=300 height=300></applet>*/

{
	String n;
	String a;
	
	public void init()
	{
		n = getParameter("Name").toUpperCase();  //Sandhya
		a = getParameter("Age");   //15
	
	}
	
	public void paint(Graphics g)
	{
		g.drawString(n, 200, 200);
		g.drawString(a, 200, 250);
	}
}	