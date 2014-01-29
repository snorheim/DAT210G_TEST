package pakke;

public class Klasse {
	private int AnswerToLifeUniverseAndEverything = 42;

	public Klasse(){
		
	}
	public int getAnswer(){
		return AnswerToLifeUniverseAndEverything;
	}
	
	public static void main(String[] args) {
		Klasse k = new Klasse();
		System.out.print(k.getAnswer());
		System.out.println("Hello");

	}

}
