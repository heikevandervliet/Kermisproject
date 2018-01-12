package kermisdingen;

public class Spookhuis extends Attractie {

	private static String name = "Spookhuis";
	private static double omzet = 0.00;
	private static double ritprijs = 2.25;
	private static int ritjes = 0;
	
	public Spookhuis() {
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
		System.out.println("Je bent in het spookhuis. Brrrrr...");
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
