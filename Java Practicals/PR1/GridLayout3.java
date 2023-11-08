import java.awt.*;
class GridLayout3 extends Frame {
	GridLayout3() {
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		setLayout(new GridLayout(3,3,10,10));
		add(b1); add(b2); add(b3); add(b4); add(b5);
		add(b6); add(b7); add(b8);
		setVisible(true);
		setSize(400,400);
	}

	public static void main(String args[]) {
		GridLayout3 obj = new GridLayout3();
	}
}