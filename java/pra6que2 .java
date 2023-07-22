import javax.swing.*;
import java.awt.*;

 public class pra6que2 extends JFrame
 {
	 pra6que2 ()
	 {
		 String[] item = {"MAHARASTRA","GOA","PANJAB","KERAL","BIHAR"};
     JComboBox cb =new JComboBox(state);
	 cb.setBounds(50,50,90,20);
	 add(cb);
	 setTitle("JComboBox ");
        setLayout(new FlowLayout());
	 setSize(700, 200);
        setVisible(true);
	 }
	 public static void main(	String a[])
	 {
		 new  pra6que2 ();
	 }
 }