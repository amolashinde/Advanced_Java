import java.awt.*;  
import java.awt.event.*;  
class MouseListenerDemo extends Frame
 implements MouseListener{  
    Label l;  
    MouseListenerDemo()
	{  
        addMouseListener(this);   
        l=new Label();  
        l.setBounds(20,50,100,20);  
        add(l);  
        setSize(500,500);  
        setLayout(null);  
        setVisible(true);
		setTitle("MouseListenerDemo");
    }  
    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    } 
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  

	public static void main(String[] args) 
	{  
		new MouseListenerDemo();  
	}  
} 


