package kermisdingen;

public class Spookhuis extends Attractie {

	private static double omzet = 0;
	private static double ritprijs = 2.25;
	private static double ritjes = 0;
	
	public Spookhuis() {
		this.omzet += ritprijs;
		super.totaleOmzet += ritprijs;
		draait();
	}
	
	public void draait() {
		System.out.println("Je bent in het spookhuis. Brrrrr...");
	}

	public static double getRitprijs() {
		return ritprijs;
	}
	
	public static double getRitjes() {
		return ritjes;
	}
	
}
