package kermisdingen;

public class Botsauto extends Attractie {

private static double omzet = 0.00;
private static double ritprijs = 2.50;
private static int ritjes = 0;
private static String name = "Botsauto's";
	
	public Botsauto () {
		this.omzet += ritprijs;
		super.omzet += ritprijs;
		this.ritjes++;
		super.ritjes++;
		draait();
	}
	
	public void draait() {
		System.out.println("Botsauto's rijden.");
	}
	
	public static String getName() { 
		return name;
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
