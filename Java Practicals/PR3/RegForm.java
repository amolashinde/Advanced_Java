import javax.swing.*;
import java.awt.event.*;

class RegForm extends JFrame implements ActionListener{
	JLabel lblTitle, lblFname, lblMname, lblLname, lblGender; 
	JLabel lblEmailid, lblMobileno,lblAddress, lblPwd; 
	JTextField txtFname, txtMname, txtLname, txtEmailid, txtMobileno;
	JTextArea txtAddress;
	JRadioButton c1, c2;	
	ButtonGroup grp;
	JPasswordField p;
	JButton btn;
	
	RegForm(){
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		setTitle("Registration Form");
	
		lblTitle = new JLabel("REGISTRATION FORM");
		lblTitle.setBounds(250,30,300,50);
		add(lblTitle);

		lblFname = new JLabel("First Name: ");
		lblFname.setBounds(250,90,100,30);
		add(lblFname);
		txtFname = new JTextField(20);
		txtFname.setBounds(400,90,100,30);
		add(txtFname);

		lblMname = new JLabel("Middle Name: ");
		lblMname.setBounds(250,140,100,30);
		add(lblMname);
		txtMname = new JTextField(20);	
		txtMname.setBounds(400,140,100,30);	
		add(txtMname);

		lblLname = new JLabel("Last Name: ");
		lblLname.setBounds(250,190,100,30);
		add(lblLname);
		txtLname = new JTextField(20);
		txtLname.setBounds(400,190,100,30);	
		add(txtLname);

		lblGender = new JLabel("Gender: ");
		lblGender.setBounds(250,240,100,30);
		add(lblGender);
		c1 = new JRadioButton("Male");
		c1.setBounds(400,240,100,30);
		c2 = new JRadioButton("Female");
		c2.setBounds(500,240,100,30);
		grp = new ButtonGroup();
		grp.add(c1); grp.add(c2);	
		add(c1); add(c2);

		lblEmailid = new JLabel("Email ID: ");
		lblEmailid.setBounds(250,290,100,30);
		add(lblEmailid);
		txtEmailid = new JTextField(50);
		txtEmailid.setBounds(400,290,150,30);
		add(txtEmailid);

		lblMobileno = new JLabel("Mobile No: ");
		lblMobileno.setBounds(250,350,100,30);
		add(lblMobileno);
		txtMobileno = new JTextField(20);
		txtMobileno.setBounds(400,350,100,30);
		add(txtMobileno);

		lblAddress = new JLabel("Address: ");
		lblAddress.setBounds(250,400,100,30);
		add(lblAddress);
		txtAddress = new JTextArea();
		txtAddress.setBounds(400,400,300,50);
		add(txtAddress);

		lblPwd = new JLabel("Create password: ");
		lblPwd.setBounds(250,480,130,30);
		add(lblPwd);
		p = new JPasswordField();
		p.setBounds(400,480,100,30);
		add(p);

		btn = new JButton("Register");
		btn.setBounds(350,550,100,30);
		add(btn);
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		JFrame f = new JFrame("Your Details");
		JTextArea a = new JTextArea();
		String details1 = "First Name: " + txtFname.getText()  + "\nMiddle Name: " + txtMname.getText() + "\nLast Name: " + txtLname.getText();
		String gender=" ";
		if(c1.isSelected())	gender = "\nGender: Male";
		if(c2.isSelected()) 	gender = "\nGender: Female";
		String details2 = "\nEmail ID: " + txtEmailid.getText() + "\nMobile No: " + txtMobileno.getText() + "\nAddress: " + txtAddress.getText() + "\nPassword: " + new String(p.getPassword());
		String display = details1 + gender + details2;
		a.setText(display);
		a.setBounds(10,30,490,490);
		f.add(a);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
	}

	public static void main(String args[]){
		new RegForm();
	}
}