import java.applet.*;
import java.awt.*;
/*<applet code ="AppletParam" width=300 height=300></applet>*/

public class AppletParam extends Applet
{
	String n;
	String a;
	String b;
	String c;
	
	public void init()
	{
		n = getParameter("Name").toUpperCase(); //shreya 
		a = getParameter("Age");  //18
        b=getParameter("Collage Name").toUpperCase();//GRWPT
        c=getParameter("java sub Teacher Name").toUpperCase(); //MISS VRANE
		
	
	}
	
	public void paint(Graphics g)
	{
		g.drawString(n, 200, 200);
		g.drawString(a, 200, 250);
		g.drawString(b,300,300);
		g.drawString(c,200,200);
		
	}
}
		