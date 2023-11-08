import java.awt.*;

class BorderLayout2 extends Frame {
	BorderLayout2() {
		Button b1 = new Button("North");
		Button b2 = new Button("South");
		Button b3 = new Button("East");
		Button b4 = new Button("West");
		Button b5 = new Button("Center");
		setLayout(new BorderLayout(10,10));
		setVisible(true);
		setSize(400,400);
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);
	}

	public static void main(String args[]) {
		BorderLayout2 obj = new BorderLayout2();
	}
}