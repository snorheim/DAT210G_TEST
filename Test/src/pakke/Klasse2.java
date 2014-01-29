package pakke;

public class Klasse2 {

	/**
	 * @param args
	 */

	public int mystiskTall(int n){
		// Jo da dette funak 
		return mystiskTall(n+1);
	}

	public static void main(String[] args) {
		Klasse k = new Klasse();
		System.out.print(k.getAnswer());

	}

}
