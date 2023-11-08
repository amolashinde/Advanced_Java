
import java.awt.*;
import java.awt.event.*; 

class RegistrationForm extends Frame 
implements WindowListener,ActionListener{
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
	TextField tf1,tf2,tf3,tf4,tf5;
	Checkbox c1,c2,c3,cor1,cor2,cor3,cor4;
	CheckboxGroup cbg;
	TextArea ta=new TextArea();
	Choice c=new Choice();
	
	RegistrationForm()
	{
		setLayout(null);
		setBackground(Color.yellow);
		setForeground(Color.black);
		 
		Font f1 = new Font("Courier",Font.PLAIN,20);
		setFont(f1);
		
		l1=new Label("First Name: ");
		l2=new Label("Middle Name: ");
		l3=new Label("Last Name: ");
		l4=new Label("Gender: ");
		l5=new Label("Courses: ");
		l6=new Label("State: ");
		l7=new Label("Email: ");
		l8=new Label("Mobile: ");
		l9=new Label("Adress: ");
		
		Button b1=new Button("Submit");
		
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf3=new TextField(20);
		tf4=new TextField(20);
		tf5=new TextField(20);
		
		cbg=new CheckboxGroup();
		c1=new Checkbox("Male",true,cbg);
		c2=new Checkbox("Female",false,cbg);
		c3=new Checkbox("Other",false,cbg);
		
		cor1=new Checkbox("JP-2", true);
		cor2=new Checkbox("AAP", false);
		cor3=new Checkbox("Python", false);
		cor4=new Checkbox("DMI", false);
		
		c.add("Maharshtra");
		c.add("Karnataka");
		c.add("Gujrat");
		c.add("Madhyapradesh");
		
		l1.setBounds(100,50,150,20);
		l2.setBounds(100,100,150,20);
		l3.setBounds(100,150,150,20);
		l4.setBounds(100,200,150,20);
		l5.setBounds(100,250,150,20);
		l6.setBounds(100,300,150,20);
		l7.setBounds(100,350,150,20);
		l8.setBounds(100,400,150,20);
		l9.setBounds(100,480,150,20);
		
		b1.setBounds(100,650,120,35);
		
		tf1.setBounds(350,50,200,35);
		tf2.setBounds(350,100,200,35);
		tf3.setBounds(350,150,200,35);
		tf4.setBounds(350,350,200,35);
		tf5.setBounds(350,400,200,35);
		ta.setBounds(350,450,400,100);
		
		c1.setBounds(350,200,100,20);
		c2.setBounds(450,200,100,20);
		c3.setBounds(550,200,100,20);
		
		cor1.setBounds(350,250,100,20);
		cor2.setBounds(450,250,100,20);
		cor3.setBounds(550,250,100,20);
		cor4.setBounds(650,250,100,20);
		
		c.setBounds(350,300,180,20);
		
		add(l1); add(tf1);
		add(l2); add(tf2);
		add(l3); add(tf3);
		add(l4); add(c1); add(c2); add(c3);
		add(l5); add(cor1); add(cor2); add(cor3); 
		add(cor4);
		add(l6); add(c);
		add(l7); add(tf4);
		add(l8); add(tf5);
		add(l9); add(ta);
		add(b1);
		
		addWindowListener(this);
		b1.addActionListener(this);
		
		setVisible(true);
		setTitle("Registration Form");
		setSize(500,500);

	}
	public void actionPerformed(ActionEvent ae) {
	Frame f = new Frame("Entered details");
	TextArea a = new TextArea();
	Font f1 = new Font("Courier", Font.PLAIN, 20);
	setFont(f1);
	String details = "\n\nFirst Name: " + tf1.getText()
	+ "\nMiddle Name: " + tf2.getText()+ "\nLast Name: "
	+ tf3.getText() + "\nGender: " + cbg.getSelectedCheckbox().getLabel()
	+ "\nCourses: " ;	
	a.setText(details);
	if(cor1.getState()==true){
		String s1 = cor1.getLabel() + ", ";
		a.append(s1);
	}	
	if(cor2.getState()==true){
		String s2 = cor2.getLabel() + ", ";
		a.append(s2);
	}	
	if(cor3.getState()==true) {
		String s3 = cor3.getLabel() + ", ";
		a.append(s3);
	}
	if(cor4.getState()==true) {
		String s4 = cor4.getLabel() + ", ";
		a.append(s4);
	}
	
	String details2 = "\nEmail ID: " + tf4.getText() + "\nMobile No: " 
	+ tf5.getText() + "\nAddress: " + ta.getText() + "\nState: " 
	+ c.getSelectedItem();
	a.append(details2);
	a.setBounds(10,30,490,490);
	f.add(a);
	f.setLayout(null);
	f.setSize(500,500);
	f.setVisible(true);
	}
	public static void main(String args[])
	{
		new RegistrationForm();
	}
	public void windowActivated(WindowEvent e) {}    
	public void windowClosed(WindowEvent e) {}      
	public void windowDeactivated(WindowEvent e) {}    
	public void windowDeiconified(WindowEvent e) {}    
	public void windowIconified(WindowEvent e) {}    
	public void windowOpened(WindowEvent e) {} 
	public void windowClosing(WindowEvent e) 
	{    
		System.exit(0);    
	}  	
}










