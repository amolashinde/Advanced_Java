import java.awt.*;
import java.awt.event.*;

class DialogDemoUsernamePass extends Frame implements ActionListener
{
	DialogDemoUsernamePass()
	{
		setSize(500,500);
		setVisible(true);
		setLayout(new FlowLayout());
		
		Button submit=new Button("Open Dialog");
		submit.addActionListener(this);
		add(submit);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Dialog d=new Dialog(DialogDemoUsernamePass.this);
		d.add(l);
		d.setVisible(true);
		d.setSize(400,400);
		d.setLayout(new FlowLayout());
	}
	public static void main(String args[])
	{
		new DialogDemoUsernamePass();
	}
}