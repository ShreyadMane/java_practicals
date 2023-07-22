import java.awt.*;
import javax.swing.*;

class Faculty details extends JFrame
{
	Faculty details()

{
	JLabel l6=new JLabel(" FACULTY DETAILS");
	l6.setFont(new Font("serif",Font.BOLD,25));
	l6.setForeground(Color.red);
	l6.setBounds(180,30,300,70);
	add(l6);
	
	
    JLabel l=new JLabel("NAME OF FACULTY ");
	l.setBounds(100,100,200,40);
	add(l);
	JTextField F=new JTextField("Name");
	F.setBounds(250,100,200,40);
	add(F);
	
	
	
	JLabel l1=new JLabel("DEPARTMENT NAME ");
    l1.setBounds(100,150,200,40);
	add(l1);
	JTextField F1=new JTextField("DEPARTMENT");
	F1.setBounds(250,150,200,40);
	add(F1);
	
	JLabel l2=new JLabel("SUBJECT NAME ");
	l2.setBounds(100,200,100,40);
    add(l2);
	JTextField F2=new JTextField("SUBJECT");
	F2.setBounds(250,200,100,40);
	add(F2);
	
	
	JLabel l3=new JLabel("EDUCATION ");
	l3.setBounds(100,250,100,40);
	 Choice c= new Choice();  
	 c.setBounds(250,250,100,40);
        c.add("BTECH");  
        c.add("ME");  
        c.add("MTECH");  
        c.add("Diploma");
        c.add("BCA");
		add(l3);
	add(c);
	
	JLabel l4=new JLabel("GENDER :-");
	l4.setBounds(100,300,100,40);
	JRadioButton c1=new JRadioButton("Male");
	c1.setBounds(170,300,100,40);
	JRadioButton c2=new JRadioButton("Female",true);
	c2.setBounds(250,300,100,40);
	add(l4);
	add(c1);
	add(c2);
	
	JLabel l5=new JLabel("ADDRESS :-");
	l5.setBounds(100,350,100,40);
	JTextArea T=new JTextArea("address");
	T.setBounds(250,350,100,40);
	add(T);
	add(l5);
	
	
	
	
	
	
	JButton b=new JButton ("SUBMIT");
	b.setBounds(100,400,100,40);
	add(b);
	JButton b1=new JButton ("RESET");
    b1.setBounds(250,400,100,40);
	add(b1);
	
	
	setTitle("faculty details");
    setSize(500,500);
	setLayout(null);
	setVisible(true);
}
public static void main(String a[])
{
	new Faculty details();
}
}
	