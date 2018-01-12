package kermisdingen;

public class Ladderklimmen extends Attractie {

private static String name = "Ladderklimmen";
private static double omzet = 0.00;
private static double ritprijs = 5.00;
private static int ritjes = 0;

	public Ladderklimmen() {
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
		System.out.println("Jeej, ladders klimmen!");
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
