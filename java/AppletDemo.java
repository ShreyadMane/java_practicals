import java.awt.*;
import java.applet.*;
public class AppletDemo extends Applet
{
	String msg;
	public void init()
	{
		setBackground (Color.pink);
		setForeground (Color.red);
		msg =getParameter("str");
		
			msg ="java";
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,10,100);
	}
	
}/* <applet code AppletDemo.class  height=100 width=300>
<param name ="str" value="Welcome to applet Programming">
		</applet>*/