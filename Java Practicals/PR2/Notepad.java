import java.awt.*;
import java.awt.event.*;
class MyNotepade extends Frame implements ActionListener
{
    TextArea txta_show;
    Menu file, edit, view, help;
	Menu zoom;
    MenuItem New,Open,Save,Exit,Cut,Copy,Paste,Delete;
	MenuItem zin,zout,rdz,sbar,wwrap;
    MenuBar mb=new MenuBar();
  	
    public MyNotepade()
    {
		Font f1 = new Font("Courier", Font.PLAIN, 20);
		setFont(f1);
        file=new Menu("File");
        New=new MenuItem("New");
        Open=new MenuItem("Open");
        Save=new MenuItem("Save");
        Exit=new MenuItem("Exit");
		
		edit=new Menu("Edit");
		Cut=new MenuItem("Cut");
		Copy=new MenuItem("Copy");
		Paste=new MenuItem("Paste");
		Delete=new MenuItem("Delete");
		
		view=new Menu("View");
		zoom=new Menu("Zoom");
		zin=new MenuItem("Zoom in");
		zout=new MenuItem("Zoom out");
		rdz=new MenuItem("Restore Default Zoom");
		sbar=new MenuItem("Status bar");
		wwrap=new MenuItem("Word wrap");
		help=new Menu("Help");
       
        file.add(New);
        file.add(Open);
        file.add(Save);
        file.add(Exit);
		
		edit.add(Cut);
		edit.add(Copy);
		edit.add(Paste);
		edit.add(Delete);
		
		view.add(zoom);
		zoom.add(zin);
		zoom.add(zout);
		zoom.add(rdz);
		view.add(sbar);
		view.add(wwrap);
		
        mb.add(file);
		mb.add(edit);
		mb.add(view);
		mb.add(help);
       
        New.addActionListener(this);
        Open.addActionListener(this);
        Save.addActionListener(this);
        Exit.addActionListener(this);	
		Cut.addActionListener(this);
       
        setTitle("Java Notepad");
        setSize(400,400);
        setLocation(100,100);
		setVisible(true);
        setMenuBar(mb);
       
        txta_show=new TextArea();
        add(txta_show);
       
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==New)
        {
            txta_show.setText(" ");
        }
        else if(ae.getSource()==Open)
        {
            FileDialog fd=
			new FileDialog(this,"Open File",FileDialog.LOAD);
            fd.setVisible(true);
        }
        else if(ae.getSource()==Save)
        {
            FileDialog fd=
			new FileDialog(this,"Save File",FileDialog.SAVE);
            fd.setVisible(true);
        }
        else if(ae.getSource()==Exit)
        {
            System.exit(0);
        }
		else if(ae.getSource()==Cut)
		{
			txta_show.getSelectedText();
			txta_show.setText(" ");
		}
    }
}
class Notepad
{
    public static void main(String args[])
    {
        new MyNotepade();
    }
}

















