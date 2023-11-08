import java.awt.*;
import java.awt.event.*;

class CardLayout1 extends Frame implements ActionListener {
	CardLayout card = new CardLayout(20,20);
	CardLayout1() {
		Button b1 = new Button("First");
		Button b2 = new Button("Second");
		Button b3 = new Button("Third");
		setLayout(card);
		add(b1);
		add(b2);
		add(b3);
		setVisible(true);
		setSize(400,400);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		card.next(this);
	}

	public static void main(String args[]) {
		CardLayout1 obj = new CardLayout1();
	}
}




