import java.awt.*;
import java.awt.event.*;

class DialogDemoUsernamePass extends Frame implements ActionListener
{
	Label lusername, lpass;
	TextField tusername, tpass;
	DialogDemoUsernamePass()
	{
		setLayout(null);
		lusername=new Label("Enter Username:");
		lusername.setBounds(100,50,100,30);
		tusername=new TextField();
		tusername.setBounds(200,50,100,30);
		
		lpass=new Label("Enter Password:");
		lpass.setBounds(100,100,100,30);
		tpass=new TextField();
		tpass.setBounds(200,100,100,30);
		
		Button submit=new Button("Submit");
		submit.setBounds(200,200,80,30);;
		submit.addActionListener(this);
		
		add(lusername);
		add(tusername);
		add(lpass);
		add(tpass);
		add(submit);
		
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Label status=new Label();
		String user, pass;
		user=tusername.getText();
		pass=tpass.getText();
		if(user.equals("system") && pass.equals("system"))
		{
			status.setText("Valid User!!");
		}
		else
		{
			status.setText("Invalid User!!");
		}
		Dialog d=new Dialog(DialogDemoUsernamePass.this, "User Authentication");
		d.add(status);
		d.setVisible(true);
		d.setSize(400,400);
		d.setLayout(new FlowLayout());
	}
	public static void main(String args[])
	{
		new DialogDemoUsernamePass();
	}
}