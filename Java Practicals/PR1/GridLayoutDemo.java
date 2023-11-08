import java.awt.*;
class GridLayoutDemo extends Frame
{ 
	GridLayoutDemo()
	{
		GridLayout g1=new GridLayout(5,5);
		setLayout(g1);
		for(int i=1;i<=10;i++)
		{
			add(new Button(""+i)); 
		}
	}
	public static void main(String args[])
	{
		GridLayoutDemo gd=new GridLayoutDemo();
		gd.setVisible(true);
		gd.setTitle("GridLayout Manager");
		gd.setSize(500,500);
	}
}



