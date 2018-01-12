package kermisdingen;

public class Spiegelpaleis extends Attractie {

	private static double omzet = 0;
	private static double ritprijs = 2.75;
	private static int ritjes = 0;
	private static String name = "Spiegelpaleis";
	
	public Spiegelpaleis() {
		this.omzet += ritprijs;
		super.omzet += ritprijs;
		this.ritjes++;
		super.ritjes++;
		draait();
	}
	
	public static String getName() {
		return name;
	}
	
	public void draait() {
		System.out.println("Je bent in het spiegelpaleis. Haha!");
	}
	
	public static double getRitprijs() {
		return ritprijs;
	}
	
	public static int getRitjes() {
		return ritjes;
	}
	
	public static double getOmzet() {
		return omzet;
	}
	

}
