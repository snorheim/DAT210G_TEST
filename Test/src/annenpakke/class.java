package annenpakke;

public class Pear {
	private int weight = 42;

	public Pear(){
		
	}
	public int getWeight(){
		return weight;
	}
	
	public static void main(String[] args) {
		Pear p = new Pear();
		System.out.print("P�ra veier %s kilo!", p.getWeight());

	}

}
