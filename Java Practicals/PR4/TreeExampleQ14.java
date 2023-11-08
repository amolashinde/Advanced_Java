import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  
public class TreeExampleQ14 extends JFrame {  
	TreeExampleQ14(){  
 
		DefaultMutableTreeNode gpp=new DefaultMutableTreeNode("GPP");  
		DefaultMutableTreeNode bra=new DefaultMutableTreeNode("Branches");  
		gpp.add(bra);  
		DefaultMutableTreeNode co=new DefaultMutableTreeNode("Computer");  
		DefaultMutableTreeNode it=new DefaultMutableTreeNode("Infromation Technology");  
		DefaultMutableTreeNode me=new DefaultMutableTreeNode("Mechanical");
		DefaultMutableTreeNode ee=new DefaultMutableTreeNode("Electrical");
		bra.add(co);  bra.add(it);  bra.add(me);  bra.add(ee);      

		DefaultMutableTreeNode java=new DefaultMutableTreeNode("Java Programming");  
		DefaultMutableTreeNode android=new DefaultMutableTreeNode("Android");  
		DefaultMutableTreeNode acn=new DefaultMutableTreeNode("ACN");  
		co.add(java); co.add(android); co.add(acn);

		JTree jt=new JTree(gpp);  
		add(jt);  
		setSize(500,500);  
		setVisible(true);  
	}
	public static void main(String[] args) {  
    new TreeExampleQ14();  
    }
}  


