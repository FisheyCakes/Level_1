// Copyright The League of Amazing Programmers, 2015
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
 * 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/

public class Jukebox implements Runnable, ActionListener {
	private JButton buttonOne = new JButton();
	private JButton buttonTwo = new JButton();
	private JButton buttonThree = new JButton();
	private JButton buttonFour = new JButton();
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Jukebox());
	}
	Song song1 = new Song("TheMobRap.mp3");
	Song song2 = new Song("Ain'tNoMan.mp3");
	Song song3 = new Song("BestIEverHad.mp3");
	Song song4 = new Song("Angry Genji Mains.mp3");
           public void run() {

		// 3. Find an mp3 on your computer or on the Internet.
		// 4. Create a Song

		// 5. Play the Song
//song1.play();


		/*
		 * 6. Create a user interface for your Jukebox so that the user can to
		 * choose which song to play. You can use can use a different button for
		 * each song, or a picture of the album cover. When the button or album
		 * cover is clicked, stop the currently playing song, and play the one
		 * that was selected.
		 */
	JFrame Frame = new JFrame();
	JPanel Panel = new JPanel();
Frame.add(Panel);
Panel.add(buttonOne);
Panel.add(buttonTwo);
Panel.add(buttonThree);
Panel.add(buttonFour);
buttonOne.setText("The Mob Rap");
buttonTwo.setText("Ain't No Man");
buttonThree.setText("Best I Ever Had");
buttonFour.setText("Angry Genji Mains");
buttonOne.addActionListener(this);
buttonTwo.addActionListener(this);
buttonThree.addActionListener(this);
buttonFour.addActionListener(this);
Frame.pack();
Frame.setVisible(true);

}
           

           public void  actionPerformed(ActionEvent arg0) {
        		// Remove this temporary message:
        		JButton buttonPressed = (JButton) arg0.getSource(); 
        		
        		if(buttonPressed.equals(buttonOne)){
        			song1.stop();
        			song2.stop();
        			song3.stop();
        			song4.stop();
        			song1.play();
        		} 
        		if(buttonPressed.equals(buttonTwo)){
        			song1.stop();
        			song2.stop();
        			song3.stop();
        			song4.stop();
        			song2.play();
        		} 
        		if(buttonPressed.equals(buttonThree)){
        			song1.stop();
        			song2.stop();
        			song3.stop();
        			song4.stop();
        			song3.play();
        		} 
        		if(buttonPressed.equals(buttonFour)){
        			song1.stop();
        			song2.stop();
        			song3.stop();
        			song4.stop();
        			song4.play();
        		} 
        	
           }






          
	/* Use this method to add album covers to your Panel. */
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	


}

class Song {

	private int duration;
	private String songAddress;
	private AdvancedPlayer mp3Player;
	private InputStream songStream;

	/**
	 * Songs can be constructed from files on your computer or Internet
	 * addresses.
	 * 
	 * Examples: <code> 
	 * 		new Song("everywhere.mp3"); 	//from default package 
	 * 		new Song("/Users/joonspoon/music/Vampire Weekend - Modern Vampires of the City/03 Step.mp3"); 
	 * 		new	Song("http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3"); 
	 * </code>
	 */
	public Song(String songAddress) {
		this.songAddress = songAddress;
	}

	public void play() {
		loadFile();
		if (songStream != null) {
			loadPlayer();
			startSong();
		} else
			System.err.println("Unable to load file: " + songAddress);
	}

	public void setDuration(int seconds) {
		this.duration = seconds * 100;
	}

	public void stop() {
		if (mp3Player != null)
			mp3Player.close();
	}

	private void startSong() {
		Thread t = new Thread() {
			public void run() {
				try {
					if (duration > 0)
						mp3Player.play(duration);
					else
						mp3Player.play();
				} catch (Exception e) {
				}
			}
		};
		t.start();
	}

	private void loadPlayer() {
		try {
			this.mp3Player = new AdvancedPlayer(songStream);
		} catch (Exception e) {
		}
	}

	private void loadFile() {
		if (songAddress.contains("http"))
			this.songStream = loadStreamFromInternet();
		else
			this.songStream = loadStreamFromComputer();
	}

	private InputStream loadStreamFromInternet() {
		try {
			return new URL(songAddress).openStream();
		} catch (Exception e) {
			return null;
		}
	}

	private InputStream loadStreamFromComputer() {
		try {
			return new FileInputStream(songAddress);
		} catch (FileNotFoundException e) {
			return this.getClass().getResourceAsStream(songAddress);
		}
	}

	
}


