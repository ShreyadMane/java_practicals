import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class JavaPanel1  extends JPanel  implements ActionListener
{
  JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l10,l11;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JButton b1,b2;
	JComboBox j,j1,j6;
	JavaPanel1()
	{
		setLayout(null);
		l=new JLabel("STUDENTS DETAILS");
		l.setBounds(150,20,300,50);
		l.setForeground(Color.red);
		l.setFont(new Font("Serif", Font.PLAIN, 20));
		
		l11=new JLabel("Select class");
		l11.setBounds(100,80,180,30);
		String item8[]={"FY","SY","TY"};
	    j6=new JComboBox(item8);
		j6.setBounds(210,80,180,30);
		
		l1=new JLabel(" Student ID");
		l1.setBounds(100,110,180,50);
		t1=new JTextField(" ");
		t1.setBounds(210,120,180,30);
		
		l2=new JLabel(" Student Name");
		l2.setBounds(100,160,180,30);
		t2=new JTextField(" ");
		t2.setBounds(210,160,180,30);
		
		l3=new JLabel(" Roll No");
		l3.setBounds(100,210,180,30);
		t3=new JTextField(" ");
		t3.setBounds(210,210,180,30);
		
		l4=new JLabel(" Mobile No");
		l4.setBounds(100,260,180,30);
		t4=new JTextField(" ");
		t4.setBounds(210,260,180,30);
		
		
		l5=new JLabel("Percantage of previous year");
		l5.setBounds(100,320,180,30);
		t6=new JTextField("");
		t6.setBounds(300,320,200,30);
		
		
		l6=new JLabel(" Semester");
		l6.setBounds(100,380,180,30);
		String item1[]={"First","Second","third","Four","Five","Six"};
		j1=new JComboBox(item1);
		j1.setBounds(300,380,180,30);
		
		l7=new JLabel(" Batch");
		l7.setBounds(100,450,180,30);
		String item[]={"B1","B2"};
		j=new JComboBox(item);
		j.setBounds(300,450,180,30);
		setBackground(Color.pink);
		
		b1=new JButton("SUBMIT");
		b1.setBounds(150,550,80,30);
		b2=new JButton("CLEAR");
		b2.setBounds(350,550,80,30);
		
		
		b2.addActionListener(this);
		b1.addActionListener(this);
		

		add(l);
		add(l11);  add(j6);
		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);
		add(l4); add(t4);
		add(l5);  add(t6);
		add(l6);  add(j1);
		add(l7); add(j);
		add(b1); add(b2); 
	
		
	}
	 
	 public void actionPerformed(ActionEvent ae)
	 {
		 if(ae.getSource()==b1)
		 {
			 try{
				 
				 
				 Class.forName("com.mysql.cj.jdbc.Driver");
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
				 String sql="insert into studentinfo2 values(?,?,?,?,?,?,?,?)";
				 PreparedStatement pstmt=con.prepareStatement(sql);
				 pstmt.setString(1,j6.getSelectedItem().toString());
				 pstmt.setString(2,t1.getText());
				 pstmt.setString(3,t2.getText());
				 pstmt.setString(4,t3.getText());
				 pstmt.setString(5,t4.getText());
				 pstmt.setString(6,t6.getText());
				 pstmt.setString(7,j1.getSelectedItem().toString());
				 pstmt.setString(8,j.getSelectedItem().toString());
				 pstmt.executeUpdate();
				 JOptionPane.showMessageDialog(null,"Data is submitted");
				
				con.close();
				
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Error data is not submitted");
				}
		 }
		 if(ae.getSource()==b2)
		 {
			
			 t1.setText(" ");
			 t2.setText(" ");
			 t3.setText(" ");
			 t4.setText(" ");
			 t6.setText(" ");
		 }
	 }
}
class JavaPanel2 extends JPanel implements ActionListener
{
   JTextField t1;
   JButton b1;
   JCheckBox checkbox1,r1,r2,checkbox2,r3,r4,checkbox3,r5,r6,checkbox4;
   JavaPanel2()
   {
	JLabel l=new JLabel("Attended Curriculum Activities");
	l.setBounds(100,30,300,50);
	l.setForeground(Color.red);
	l.setFont(new Font("Serif", Font.PLAIN, 20));
	add(l);
		
     setLayout(null);
	 JLabel l1 = new JLabel("Roll Number");
	 l1.setBounds(100,90,180,30);
	 add(l1);
	 t1 = new JTextField();
	 t1.setBounds(210,90,180,25);
	 add(t1);
	 
	 checkbox1 = new JCheckBox("-Co-Cariculam");
	 checkbox1.setBounds(100,130,200,40);
	 add(checkbox1);
	 r1 = new JCheckBox("-webinar");
	 r1.setBounds(100,160,100,30);
	 add(r1);
	  
	 r2 = new JCheckBox("-seminar");
	 r2.setBounds(100,190,200,30);
	 add(r2);
	 
	 checkbox2 = new JCheckBox("-Extra Activities");
	 checkbox2.setBounds(100,230,200,40);
	 add(checkbox2);
	 
	 r3 = new JCheckBox("-Events");
	 r3.setBounds(100,270,100,30);
	 add(r3);
	 r4 = new JCheckBox("-Extra Excpert Lectures");
	 r4.setBounds(100,300,200,30);
	 add(r4);
	 
	 checkbox3 = new JCheckBox("-Technical Activities");
	 checkbox3.setBounds(100,340,200,40);
	 add(checkbox3);
	 
	 r5 = new JCheckBox("-Paper Presentation");
	 r5.setBounds(100,380,100,30);
	 add(r5);
	 r6 = new JCheckBox("-Quiz");
	 r6.setBounds(100,410,100,30);
	 add(r6);
	 checkbox4 = new JCheckBox("-Any Other");
	 checkbox4.setBounds(100,450,100,30);
	 add(checkbox4);
	 
	 b1 = new JButton("Submit");
	 b1.setBounds(150,500,100,30);
	 b1.addActionListener(this);
	 add(b1);
   }
   public void actionPerformed(ActionEvent ae)
   {
      if(ae.getSource()==b1)
	  {
	     try{
			   //register the driver
		       Class.forName("com.mysql.cj.jdbc.Driver");
			    //Establish connection
			   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
			   String sql="Insert Into activity Values(?,?)";
			   PreparedStatement stmt = con.prepareStatement(sql);
			   stmt.setInt(1,Integer.parseInt(t1.getText()));
			   String s ="";
			   if(checkbox1.isSelected()){
			       s+=checkbox1.getText()+",";
			   }
			   if(r1.isSelected()){
			       s+=r1.getText()+",";
			   }
			   if(r2.isSelected()){
			       s+=r2.getText()+",";
			   }
			   if(checkbox2.isSelected()){
			       s+=checkbox2.getText()+",";
			   }
			   if(r3.isSelected()){
			       s+=r3.getText()+",";
			   }
			   if(r4.isSelected()){
			       s+=r4.getText()+",";
			   }
			   if(checkbox3.isSelected()){
			       s+=checkbox3.getText()+",";
			   }
			   if(r5.isSelected()){
			       s+=r5.getText()+",";
			   }
			   if(r6.isSelected()){
			       s+=r6.getText()+",";
			   }
			   if(checkbox4.isSelected()){
			       s+=checkbox4.getText()+",";
			   }
			   stmt.setString(2,s);
			   stmt.executeUpdate();
			   JOptionPane.showMessageDialog(null,"Your Data is Submitted"); 
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Your Data is not Submitted");
			}
	   
         }
    }
}
 class project extends JFrame implements ActionListener
{
	JButton b1,b2;
	CardLayout c1;
	JPanel p;
	{
	setLayout(new BorderLayout());
	  
	  JavaPanel1  p1 = new JavaPanel1(); 
	  JavaPanel2 p2 = new JavaPanel2();
	  
	  b1 = new JButton("Next");
	  b2 = new JButton("Previous");
	  
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  
	  JPanel pb = new JPanel();
	  
	  pb.add(b1);
	  pb.add(b2);
	  
	  p = new JPanel();
	  
      c1 = new CardLayout();
      p.setLayout(c1);
	 
	  p.add(p1,"Panel 1");
	  p.add(p2,"Panel 2");
	  
	  add(pb,BorderLayout.SOUTH);
	  add(p,BorderLayout.CENTER);
	  
	  pb.setBackground(Color.pink);
   } 
	public void actionPerformed(ActionEvent ae)
	{
	   	if(ae.getSource()== b1)
		{
			c1.next(p);
		}
		else
		{
			c1.previous(p);
		}
	}
   public static void main(String args[])
   {
      project c = new project();
      c.setVisible(true);
	  c.setSize(500,500);
	  c.setTitle("CO Student Association Management");
   }
}

