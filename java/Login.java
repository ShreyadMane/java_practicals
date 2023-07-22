import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import java.util.*;

   public class Login

     {

        JButton b1,b2;

        public Login()
        {

            JFrame f1=new JFrame();

            JPanel p1=new JPanel();

            JLabel l1=new JLabel("User Name");

            JLabel l2=new JLabel("password");

     JTextField tf1=new JTextField(10);

      

      b1=new JButton("Login");

      b2=new JButton("Exit");

     JPasswordField pf=new JPasswordField(10);
             

     l1.setBounds(30,15,100,80);

     tf1.setBounds(120,38,150,29);

     l2.setBounds(30,50,100,80);

     pf.setBounds(120,78,150,29);

     b1.setBounds(30,200,140,50);

     b2.setBounds(190,200,140,50);

      

     p1.add(l1);

     p1.add(tf1);

     p1.add(l2);
     p1.add(pf);
     p1.add(b1);
     p1.add(b2);

     p1.setLayout(null);

     pf.setEchoChar('*');

      

     f1.getContentPane().add(p1);

     f1.setSize(500,500);

     f1.setVisible(true);

     p1.setBackground(Color.pink);

     JLogin2 L=new JLogin2();

     b2.addActionListener(L);

    }

    class JLogin2 implements ActionListener
      {

          public void actionPerformed(ActionEvent ae)

           {

               Object ob2=ae.getSource();

               if(ob2==b2);

                {

                    System.exit(0);

               }     
			   }

      }
	  public static void main(String a[])
	  {
		  new Login();
	  }

   } 
