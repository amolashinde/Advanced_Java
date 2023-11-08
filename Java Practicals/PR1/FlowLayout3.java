import java.awt.*;

class FlowLayout3 extends Frame {
	FlowLayout3() {
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		setLayout(new FlowLayout(FlowLayout.RIGHT,25,20));
		setSize(200,200);
		setVisible(true);
		add(b1); add(b2);
		add(b3); add(b4);
		add(b5); add(b6);
	}

	public static void main(String args[]) {
		FlowLayout3 obj = new FlowLayout3();
	}
}