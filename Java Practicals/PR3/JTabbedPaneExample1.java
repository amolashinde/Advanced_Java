import javax.swing.*;

class JTabbedPaneExample1 extends JFrame{
	JTabbedPaneExample1(){

		JCheckBox c1 = new JCheckBox("F.Y");
		c1.setBounds(50,50,100,50);
		JCheckBox c2 = new JCheckBox("S.Y");
		c2.setBounds(50,150,100,50);
		JCheckBox c3 = new JCheckBox("T.Y");
		c3.setBounds(50,200,100,50);

		JPanel p1 = new JPanel();
		p1.add(c1); p1.add(c2); p1.add(c3);
		
		JRadioButton cb1 = new JRadioButton("Male");
		cb1.setBounds(50,50,100,50);
		JRadioButton cb2 = new JRadioButton("Female");
		cb2.setBounds(50,150,100,50);
		ButtonGroup bg = new ButtonGroup();
		bg.add(cb1); bg.add(cb2);
		
		JPanel p2 = new JPanel();
		p2.add(cb1); p2.add(cb2); 

		JTabbedPane tb = new JTabbedPane();
		tb.setBounds(50,50,500,500);
		tb.add("CheckBox",p1);
		tb.add("RadioButton",p2);
		add(tb);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String args[]){
		new JTabbedPaneExample1();
	}
}	









