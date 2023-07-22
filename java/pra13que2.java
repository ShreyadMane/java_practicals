import java.awt.*;
import java.awt.event.*;
public class pra13que2 extends Frame
{
int x1,y1,x2,y2;
pra13que2()
{
setSize(600,600);
setTitle("Practical_13");
addMouseListener(new MouseHandler());
addMouseMotionListener(new MouseMotionHandler());
}
class MouseHandler extends MouseAdapter
{
public void mousePressed(MouseEvent e)
{
x1 = e.getX();
y1 = e.getY();
}
}
class MouseMotionHandler extends MouseMotionAdapter
{
public void mouseDragged(MouseEvent e)
{
x2 = e.getX();
y2 = e.getY();
repaint();
}
}
public void paint(Graphics g)
{
g.drawLine(x1,y1,x2,y2);
}
public static void main(String [] args)
{
pra13que2 t = new pra13que2();
t.setVisible(true);
}
}