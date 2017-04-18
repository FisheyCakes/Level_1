import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyGUI {
	JFrame window;
JPanel sand;
JButton ducks;
	void setup() {
		window = new JFrame();
		window.setVisible(true);
		window.setSize(1000, 1000);
		sand = new JPanel();
		window.add(sand);
		ducks=new JButton("Become Button");
		sand.add(ducks);
		window.setSize(500,  500);
		ducks.addActionListener((stewart)->{
			JOptionPane.showMessageDialog(null, "Cake");
		});
	}
}
