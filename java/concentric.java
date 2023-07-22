import java.awt.*;  
import java.applet.*; 

public class concentric extends Applet
{ 
String m="concentric circles";
public void init()
{
	setBackground(Color.blue);
}
public void paint(Graphics g)
{
	g.setColor(Color.red);
	g.drawOval(20,20,45,45);
	g.setColor(Color.yellow);
	g.drawOval(10,10,65,65);
	g.setColor(Color.pink);
	g.drawOval(30,30,25,25);
	g.setColor(Color.green);
	g.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC,20));
	g.drawString(m,100,100);
	
}
}


/* 
<applet code="concentric.class" width="300" height="300"> 
</applet> 
*/  