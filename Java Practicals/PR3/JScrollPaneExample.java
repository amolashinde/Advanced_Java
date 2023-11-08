import javax.swing.*;
import java.awt.*;
/*
<applet code="JScrollPaneExample.class" width="400" height="200">
</applet>
*/
public class JScrollPaneExample extends JApplet
{
	public void init()
	{
		 setLayout(new BorderLayout());
		 JPanel jp=new JPanel();
		 jp.setLayout(new GridLayout(10,10));
		 int b=0;
		 for(int i=0; i<10; i++)
		 {
			 for(int j=0; j<10; j++)
			 {
				 jp.add(new Button("Button"+b));
				 ++b;
			 }
		 }
		 int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		 int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		 
		 JScrollPane jsp=new JScrollPane(jp,v,h);
		 add(jsp, BorderLayout.CENTER);
	}
}






