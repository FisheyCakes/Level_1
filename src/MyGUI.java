import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGUI {
	JFrame window;
JPanel sand;
	void setup() {
		window = new JFrame();
		window.setVisible(true);
		window.setSize(1000, 1000);
		sand = new JPanel();
		window.add(sand);
	}
}
