import java.awt.*; 
class FlowLayoutExample extends Frame 
{
	FlowLayoutExample() 
    { 
        Button button[] =new Button[10]; 
        setLayout(new FlowLayout(FlowLayout.CENTER)); 
        for(int i=0;i<button.length;i++) 
        { 
            button[i]=new Button("Button "+(i+1)); 
            add(button[i]); 
        } 
		setTitle("FlowLayout in Java Example"); 
        setSize(400,150); 
        setVisible(true); 
    } 
	
	public static void main(String args[]) 
	{
		new FlowLayoutExample() ;
	}
 } 
 
 
 

 
