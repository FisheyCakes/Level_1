import javax.swing.JOptionPane;

public class NetflixIsBestflix {
	public static void main(String[] args) {
		Movie Movie1 = new Movie("Emoji Movie", 0);
		Movie Movie2 = new Movie("Spiderman:Homecoming", 4);
		Movie movie3 = new Movie(
				"Litterally every Overwatch animation played in chronological order but everytime Genji says \"I need healing\" it cuts to Bazza getting hooked",
				5);
		Movie movie4 = new Movie("Star Wars Episode 1", 2);
		Movie movie5 = new Movie("Electrik Supersonik", 3);
		String Number1 = Movie1.getTicketPrice();
		JOptionPane.showMessageDialog(null, "Emoji Movie: " + Number1);
		String Number2 = Movie2.getTicketPrice();
		JOptionPane.showMessageDialog(null, "Spiderman Homecoming: " + Number2);
		String Number3 = movie3.getTicketPrice();
		JOptionPane.showMessageDialog(null,
				"Litterally every Overwatch animation played in chronological order but everytime Genji says \"I need healing\" it cuts to Bazza getting hooked: "
						+ Number3);
		String Number4 = movie4.getTicketPrice();
		JOptionPane.showMessageDialog(null, "Star Wars Episode 1: " + Number4);
		String Number5 = movie5.getTicketPrice();
		JOptionPane.showMessageDialog(null, "Electrik Supersonik: " + Number5);

		NetflixQueue List = new NetflixQueue();
		List.addMovie(Movie1);
		List.addMovie(Movie2);
		List.addMovie(movie3);
		List.addMovie(movie4);
		List.addMovie(movie5);
		List.printMovies();
		List.sortMoviesByRating();
		// String N1 = List.getMovie(1);
	}
}
