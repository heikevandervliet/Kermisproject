package kermisdingen;

public class Spiegelpaleis extends Attractie {

	private static double omzet = 0;
	private static double ritprijs = 2.75;
	private static int ritjes = 0;
	
	public Spiegelpaleis() {
		this.omzet += ritprijs;
		super.totaleOmzet += ritprijs;
		draait();
	}
	
	public void draait() {
		System.out.println("Je bent in het spiegelpaleis. Haha!");
	}
	
	public static double getRitprijs() {
		return ritprijs;
	}
	
	public static double getRitjes() {
		return ritjes;
	}
	

}
