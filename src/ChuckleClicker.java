import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {
	public static void makeButtons() {
		JFrame firstFrame = new JFrame();
		JPanel firstPanel = new JPanel();
		JButton buttonOne = new JButton();
		JButton buttonTwo = new JButton();
		firstFrame.add(firstPanel);
		firstFrame.setVisible(true);
		firstFrame.setSize(500, 500);
		buttonOne = new JButton("Joke");
		buttonTwo = new JButton("Punchline");
		firstPanel.add(buttonOne);
		firstPanel.add(buttonTwo);
	buttonOne.addActionListener((e)->{
		JOptionPane.showMessageDialog(null, "My ex wife still misses me,");
	});
	buttonTwo.addActionListener((e)->{
	JOptionPane.showMessageDialog(null, "BUT HER AIM IS GETING BETTER");
			});
	}
	public static void main(String[] args) {
makeButtons();
	}

	
}
