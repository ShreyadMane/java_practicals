import java.sql. *;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Practical18 extends JFrame implements ActionListener
{
JTextField tf1 = new JTextField(10);
JTextField tf2 = new JTextField(10);
JTextField tf3 = new JTextField(10);
Statement stat;
JButton btn = new JButton("Save to Database");
Practical18()
{
setSize(600,500);
setTitle("Database connectivity");
setLayout(new FlowLayout());
add(new JLabel("Name : "));
add(tf1);
add(new JLabel("Roll No : "));
add(tf2);
add(new JLabel("Percentage : "));
add(tf3);
add(btn);
 btn.addActionListener(this);
 try
 {
Class.forName("com.mysql.cj.jdbc.Driver");

System.out.println("Driver Registered");
Connection 
connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","shantanu","Shantanu");
System.out.println("Connected");
stat=connection.createStatement();
}
catch(Exception e)
{
System.out.println(e);
}
}
public void actionPerformed(ActionEvent e)
{
String sql =" insert into practical_18_student values('" + tf1.getText() + "'," + tf2.getText() + "," 
 + tf3.getText() +")";System.out.println(sql);
try
{
stat.execute(sql);
JOptionPane.showMessageDialog(null,"Data Saved to Database");
tf1.setText("");
tf2.setText("");
tf3.setText("");
}
catch(Exception ex)
{
System.out.println(ex);
}
}
public static void main(String [] args)
{

Practical18 f = new Practical18();
f.setVisible(true);
f.setDefaultCloseOperation(3);
}
}
