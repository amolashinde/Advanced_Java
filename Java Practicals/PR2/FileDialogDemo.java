import java.awt.*;
import java.awt.event.*;
public class FileDialogDemo
{
    Frame f;
    Label headerLabel;
    Label statusLabel;
    Panel Cpanel;

   public FileDialogDemo()
   {
      f=new Frame("FileDialogDemo");
      f.setSize(400,400);
      f.setLayout(new GridLayout(3, 1));
      f.addWindowListener(new WindowAdapter() 
	  {
		public void windowClosing(WindowEvent windowEvent)
		{
            System.exit(0);
        }        
      });    
	  
      headerLabel=new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel=new Label();        
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      Cpanel=new Panel();
      Cpanel.setLayout(new FlowLayout());

      f.add(headerLabel);
      f.add(Cpanel);
      f.add(statusLabel);
      f.setVisible(true); 
   }
   public static void main(String[] args){
      FileDialogDemo  FileDialogDemo = new FileDialogDemo();
      FileDialogDemo.showFileDialogDemo();
   }
   void showFileDialogDemo()
   {
	  headerLabel.setText("Control in action: FileDialog"); 
	  FileDialog fileDialog=new FileDialog(f,"Select file");
      Button BtnFileDialog = new Button("Open File");
      BtnFileDialog.addActionListener(new ActionListener() 
	  {
        public void actionPerformed(ActionEvent e) 
		{
			fileDialog.setVisible(true);
			statusLabel.setText("File Selected :" 
			+ fileDialog.getDirectory() + fileDialog.getFile());
        }
      });
      Cpanel.add(BtnFileDialog);
      f.setVisible(true);  
   }
}










