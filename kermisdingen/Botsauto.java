package kermisdingen;

public class Botsauto extends Attractie {

private static double omzet = 0;
private static double ritprijs = 2.5;
private static int ritjes = 0;
	
	public Botsauto () {
		this.omzet += ritprijs;
		super.totaleOmzet += ritprijs;
		draait();
	}
	
	public void draait() {
		System.out.println("Botsauto's rijden.");
	}
	
	public static double getRitprijs() {
		return ritprijs;
	}
	
	public static double getRitjes() {
		return ritjes;
	}
	

}
