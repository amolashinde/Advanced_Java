import java.awt.*;
class BorderLayoutDemo extends Frame
{
	BorderLayoutDemo()
	{
		BorderLayout bl=new BorderLayout(10,10);
		setLayout(bl);
		setBackground(Color.red); 
		TextArea ta1=new TextArea("BorderLayout...");
		ta1.setEditable(false);
		add(new Button("EAST REGION"),BorderLayout.EAST);
		add(new Button("WEST REGION"),BorderLayout.WEST);
		add(new Button("SOUTH REGION"),BorderLayout.SOUTH);
		add(new Button("NORTH REGION"),BorderLayout.NORTH);
		add(ta1,BorderLayout.CENTER); 
		
		setVisible(true);
		setTitle("BorderLayout Example");
		setSize(500,500);
	}
	public static void main(String args[])
	{
		new BorderLayoutDemo();
	}
}





