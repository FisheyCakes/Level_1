 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;
 
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
public class QUIZESZESS {
 
	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setSize(1000, 1000);
		quizWindow.setVisible(true);
 int points = 0;
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
 String duck = "https://thumbs.dreamstime.com/z/duck-family-152764.jpg";
		// 2. create a variable of type "Component" that will hold your image
 Component Duck;
		// 3. use the "createImage()" method below to initialize your Component
 Duck = createImage(duck);
		// 4. add the image to the quiz window
 quizWindow.add(Duck);
		// 5. call the pack() method on the quiz window
 quizWindow.pack();
		// 6. ask a question that relates to the image
 String Answer = JOptionPane.showInputDialog("Is the duck family?");
		// 7. print "CORRECT" if the user gave the right answer
 if(Answer.equals("Yes")){
	 JOptionPane.showMessageDialog(null, "Correct");
	 points++;
	 JOptionPane.showMessageDialog(null, "Score:"+points);
 }
		// 8. print "INCORRECT" if the answer is wrong
 else{
	 JOptionPane.showMessageDialog(null, "Incorrect");
	 JOptionPane.showMessageDialog(null, "Score:"+points);
 }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
 quizWindow.remove(Duck);
		// 10. find another image and create it (might take more than one line of code)
 String Penguin ="http://i140.photobucket.com/albums/r2/the_ebil_chiken/PENGUINMAFIA.png";
 Component Mafia = createImage(Penguin);
		// 11. add the second image to the quiz window
 quizWindow.add(Mafia);
		// 12. pack the quiz window
 quizWindow.pack();
		// 13. ask another question
 String Answer2 = JOptionPane.showInputDialog("Are you about to be kneeccapped?");
		// 14+ check answer, say if correct or incorrect, etc.
 if(Answer2.equals("Yes")){
	 JOptionPane.showMessageDialog(null, "You saw it comming but still got kneecapped by a mob penguin hitman. You gained Beaten Up debuff.");
	 points++; 
	 JOptionPane.showMessageDialog(null, "Score:"+points);
 }
 else{
	 JOptionPane.showMessageDialog(null, "A Mob Penguin Hitman sneeks up behind you and kneecapps you from out of nowhere. You never saw it coming. You gained Beaten Up debuff.");
	 JOptionPane.showMessageDialog(null, "Score:"+points);
 }
	}
 
	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
 
	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}
