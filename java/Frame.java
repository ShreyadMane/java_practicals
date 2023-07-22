import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame extends JFrame implements ItemListener{
    
    private JComboBox jb;
    private JLabel jl;
    private String[] item = {"SOLAPUR","PUNE","BENGLOR","MUMBAI"};
    
   Frame ()
    {
        setTitle("JComboBox with ItemListener");
        setLayout(new FlowLayout());
        setJComboBox();
        setAction();
        setSize(700, 200);
        setVisible(true);
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    private void setJComboBox()
    {
        jb = new JComboBox(item);
        add(jb);
        jl = new JLabel("");
        add(jl);
    }
    
    private void setAction()
    {
        jb.addItemListener(this);
    }
    
    public void itemStateChanged(ItemEvent ie)
    {
        String getItem = (String)jb.getSelectedItem();
        
        if(getItem.equals(item[0]))
            jl.setText("YOU ARE IN SOLAPUR");
        else if(getItem.equals(item[1]))
            jl.setText("YOU ARE IN PUNE");
        else if(getItem.equals(item[2]))
            jl.setText("YOU ARE IN BENGLOR");
        else if(getItem.equals(item[3]))
            jl.setText("YOU ARE IN MUMBAI");
    }
	 public static void main(String[] args) {
        
       Frame frame = new Frame ();
    }
}


   
   
