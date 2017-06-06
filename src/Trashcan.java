
public class Trashcan {
String myTrash;
public Trashcan(String trash){
	myTrash=trash;
}
void sing(){
	if(myTrash.equals("Banana")){
		System.out.println("Explosive gorillas");
		speak("Explosive Gorrilas");
	}
	if(myTrash.equals("Dexter's stew")){
	System.out.println("Noodles");
	speak("Noodles");
	}
	if(myTrash.equals("Dwayne")){
		System.out.println("Dwayne the rock Johnson");
		speak("Dwyane the rock Johnson");
	}
}
	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
