import java.awt.*;
import java.awt.event.*;

class RegForm extends Frame implements ActionListener {
	Label lblTitle, lblFname, lblMname, lblLname, lblGender, lblCourses, lblEmailid, lblMobileno, lblAddress, lblState; 
	TextField txtFname, txtMname, txtLname, txtEmailid, txtMobileno;
	TextArea txtAddress;
	CheckboxGroup cbg;
	Checkbox checkCR1, checkCR2, cb1, cb2, cb3, cb4, cb5;
	Choice states;
	Button BtnSubmit;

	RegForm() {
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);

		lblTitle = new Label("Registration form");
		lblTitle.setBounds(250,30,300,50);
		add(lblTitle);

		lblFname = new Label("First Name: ");
		lblFname.setBounds(250,90,100,30);
		add(lblFname);
		txtFname = new TextField(20);
		txtFname.setBounds(400,90,100,30);
		add(txtFname);

		lblMname = new Label("Middle Name: ");
		lblMname.setBounds(250,140,100,30);
		add(lblMname);
		txtMname = new TextField(20);	
		txtMname.setBounds(400,140,100,30);	
		add(txtMname);

		lblLname = new Label("Last Name: ");
		lblLname.setBounds(250,190,100,30);
		add(lblLname);
		txtLname = new TextField(20);
		txtLname.setBounds(400,190,100,30);	
		add(txtLname);

		lblGender = new Label("Gender: ");
		lblGender.setBounds(250,240,100,30);
		add(lblGender);
		cbg = new CheckboxGroup();
		checkCR1 = new Checkbox("Male",cbg,false);
		checkCR1.setBounds(400,240,100,30);
		add(checkCR1);
		checkCR2 = new Checkbox("Female",cbg,false);
		checkCR2.setBounds(500,240,100,30);
		add(checkCR2);

		lblCourses = new Label("Courses: ");
		lblCourses.setBounds(250,290,100,30);
		add(lblCourses);
		cb1 = new Checkbox("DMI");
		cb1.setBounds(400,290,100,20);
		add(cb1);
		cb2 = new Checkbox("CS");
		cb2.setBounds(400,310,100,20);
		add(cb2);
		cb3 = new Checkbox("JP2");
		cb3.setBounds(400,330,100,20);
		add(cb3);
		cb4 = new Checkbox("Python");	
		cb4.setBounds(400,350,100,20);
		add(cb4);
		cb5 = new Checkbox("Android");
		cb5.setBounds(400,370,100,20);
		add(cb5);

		lblEmailid = new Label("Email ID: ");
		lblEmailid.setBounds(250,420,100,30);
		add(lblEmailid);
		txtEmailid = new TextField(50);
		txtEmailid.setBounds(400,420,150,30);
		add(txtEmailid);

		lblMobileno = new Label("Mobile No: ");
		lblMobileno.setBounds(250,470,100,30);
		add(lblMobileno);
		txtMobileno = new TextField(20);
		txtMobileno.setBounds(400,470,100,30);
		add(txtMobileno);

		lblAddress = new Label("Address: ");
		lblAddress.setBounds(250,520,100,30);
		add(lblAddress);
		txtAddress = new TextArea();
		txtAddress.setBounds(400,520,300,50);
		add(txtAddress);

		lblState = new Label("State: ");
		lblState.setBounds(250,590,100,30);
		add(lblState);
		states = new Choice();
		states.setBounds(400,595,100,30);
		states.add("Maharashtra");
		states.add("Gujarat");
		states.add("UP");
		states.add("MP");
		states.add("Karnataka");
		add(states);

		BtnSubmit = new Button("Submit");
		BtnSubmit.setBounds(350,650,80,30);
		add(BtnSubmit);
		BtnSubmit.addActionListener(this);
		
	}
		
	public void actionPerformed(ActionEvent ae) {
		Label setdetails;
		//Frame f = new Frame("Entered details");
		TextArea a = new TextArea();
		String details = "First Name: " + txtFname.getText()  + "\nMiddle Name: " + txtMname.getText() + "\nLast Name: " + txtLname.getText() + "\nGender: " + cbg.getSelectedCheckbox().getLabel() + "\nCourses: " ;	
		a.setText(details);
		if(cb1.getState()==true){
			String s1 = cb1.getLabel() + ", ";
			a.append(s1);
		}	
		if(cb2.getState()==true){
			String s2 = cb2.getLabel() + ", ";
			a.append(s2);
		}	
		if(cb3.getState()==true) {
			String s3 = cb3.getLabel() + ", ";
			a.append(s3);
		}
		if(cb4.getState()==true) {
			String s4 = cb4.getLabel() + ", ";
			a.append(s4);
		}
		if(cb5.getState()==true) {
			String s5 = cb5.getLabel() + ", ";
			a.append(s5);
		}	
		String details2 = "\nEmail ID: " + txtEmailid.getText() + "\nMobile No: " + txtMobileno.getText() + "\nAddress: " + txtAddress.getText() + "\nState: " + states.getSelectedItem();
		a.append(details2);
		a.setBounds(200,700,490,490);
		add(a);
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String args[]) {
		RegForm f = new RegForm();
	}
}