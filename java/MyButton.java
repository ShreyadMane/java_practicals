import java.awt.*;

class MyButton 
{
	public static void main( String []args)
	{
		Frame f = new Frame("My Button");
		f.setSize(600,900);
		
		Button b=new Button("CLICK HERE");
		b.setBounds(100, 100, 90, 50);
		f.add(b);
		
		f.setLayout(null);
		f.setVisible(true);
	}
}