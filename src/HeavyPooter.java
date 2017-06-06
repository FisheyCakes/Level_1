
public class HeavyPooter {
	 
		private boolean cloakOn;
		
		HeavyPooter() {
			System.out.println("making Harry Potter...");
		}
	 
		void castSpell(String spell){
	System.out.println("casting spell: " + spell);
	speak(spell);
		}
	 
		void makeInvisible(boolean invisible) {
			this.cloakOn = invisible;
			
			if (cloakOn)
				System.out.println("Harry is invisible");
			else
				System.out.println("Harry is visible");
		}
	 
		void spyOnSnape() {
			System.out.println("Harry sees Professor Snape doing nefarious things.");
		}
	 
		public static void main(String[] args) {
			// 1. make harry potter
			HeavyPooter Hoovy = new HeavyPooter();
			// 2. become invisible
			Hoovy.makeInvisible(true);
			// 3. spy on professor snape
			Hoovy.spyOnSnape();
			// 4. become visible again
			Hoovy.makeInvisible(false);
			// 5. cast a “stupefy” spell
			Hoovy.castSpell("POOTIS pow!");
		}
	 
		private void speak(String words) {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
