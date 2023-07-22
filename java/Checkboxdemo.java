import java.awt.*;
class CheckboxGroupDemo extends Frame
{
	Checkboxdemo()
	{
		FlowLayout f=new FlowLayout();
		setLayout(f);
		
		Label l= new Label("Checkbox");
		Checkbox cbg=new Checkbox();
		Checkbox c1=new Checkbox("pizza",cbg,false);
		Checkbox c2=new Checkbox("Pastry",cbg,false);
		
		add(l);
		add(c1);
		add(c2);
			
	}
	public static void main(String arg[])
	{
		Checkboxdemo f1=new Checkboxdemo();
		f1.setVisible(true);
		f1.setTitle("Checkbox");
		f1.setSize(400,400);
	}
}