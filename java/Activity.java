import java.awt.*;
import javax.swing.*;
class Activity extends JFrame
{
	
	
	Activity()
	{
		
		 
		JLabel l=new JLabel("Cuirriculam Activities");
		l.setBounds(100,50,200,50);
		l.setForeground(Color.red);
		l.setFont(new Font("Serif", Font.PLAIN, 20));
		
		JCheckBox checkBox1 = new JCheckBox("Co-curiculam activities");  
        checkBox1.setBounds(100,130, 200,40);  
		
		JCheckBox r1=new JCheckBox("Webiner");    
		JCheckBox r2=new JCheckBox("Seminar");    
		r1.setBounds(100,160,100,30);    
		r2.setBounds(100,190,100,30);    
		    
	
        JCheckBox checkBox2 = new JCheckBox("Extra Activities");  
        checkBox2.setBounds(100,230, 200,50);
		JCheckBox r3=new JCheckBox("Events");    
		JCheckBox r4=new JCheckBox("Extera Excpert Lectures");    
		r3.setBounds(100,260,100,30);    
		r4.setBounds(100,290,200,30);    
	  
		JCheckBox checkBox3 = new JCheckBox("Technical Activities");  
        checkBox3.setBounds(100,330, 200,50);
		JCheckBox r5=new JCheckBox("Peper Presentation");    
		JCheckBox r6=new JCheckBox("Quiz");
		    
		r5.setBounds(100,360,100,30);    
		r6.setBounds(100,390,100,30); 
			
		 
		
		add(l);
		add(checkBox1);
		add(r1);
		add(r2);
		add(checkBox2);
		add(r3);
		add(r4);
		add(checkBox3);
		add(r5);
		add(r6);
		
		
	}
	
	public static void main(String ar[])
	{
		Activity a=new Activity();
		a.setSize(700,700);
		a.setVisible(true);
		a.setLayout(new FlowLayout());
		
	}
}