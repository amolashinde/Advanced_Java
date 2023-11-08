import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class JTableExamples extends JFrame 
{
	JTable j;
	JTableExamples()
	{
		String[][] data = {{"Amol Shinde", "2006057", "CS" },
			              { "Niral Shah", "2006058", "IT" },
						  { "Mohit Patil", "2006059", "CE" }};
		String[] CTitle = { "Name", "Roll Number", "Department" };
		j = new JTable(data, CTitle);
		j.setBounds(30, 40, 200, 300);
		JScrollPane sp=new JScrollPane(j);
		add(sp);
        setTitle("JTable Example");
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new JTableExamples();
	}
}




