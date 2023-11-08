import java.awt.*;  
import java.awt.event.*;  
public class DialogBoxDemo 
{  
    private static Dialog d;  
    DialogBoxDemo() 
	{  
        Frame f= new Frame();  
        d = new Dialog(f , "DialogBoxDemo", true);  
        d.setLayout(new FlowLayout());  
        Button b = new Button("OK");  
        b.addActionListener (new ActionListener()  
        {  
            public void actionPerformed(ActionEvent e)  
            {  
                DialogBoxDemo.d.setVisible(false);  
            }  
        });  
        d.add(new Label("Click On Button To Close Dialog Box "));  
        d.add(b);   
        d.setSize(500,500);    
        d.setVisible(true);  
    }  
    public static void main(String args[])  
    {  
        new DialogBoxDemo();  
    }  
}  







