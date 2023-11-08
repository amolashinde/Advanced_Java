import java.awt.*;  
import java.awt.event.*;  
class ActionListenerDemo extends Frame implements ActionListener
{
	TextField tf1, tf2;
	ActionListenerDemo()
	{
		setLayout(null);
		Label l1=new Label("Name: ");
		l1.setBounds(50,50,50,20);
		
		tf1=new TextField();
		tf1.setBounds(100,50,150,20);
		
		tf2=new TextField();
		tf2.setBounds(100,100,150,20);
		
		Button b=new Button("Click Here");
		b.setBounds(100,150,70,30);
		
		add(l1); add(tf1); add(tf2); add(b);
		
		setSize(500,500);
		setVisible(true);
		setTitle("ActionListenerDemo");
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		tf2.setText("Welcome "+tf1.getText());
	}
	public static void main(String args[])
	{
		new ActionListenerDemo();		
	}
}
