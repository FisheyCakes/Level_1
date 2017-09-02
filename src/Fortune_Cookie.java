import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fortune_Cookie implements ActionListener {
	private JButton button = new JButton();
	private button.addActionListener(this);
	public static void main(String[] args) {

		
	}
	public void showButton(){
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		JButton button = new JButton();
		frame.add(button);
		frame.setVisible(true);
		button.setSize(500, 500);
		button.setText("Am...What you seek. Want... To help you");

		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("WooHoo");
		
	}
}
