package kermisdingen;

public class Ladderklimmen extends Attractie {


private static double omzet = 0;
private static double ritprijs = 5.0;
private static int ritjes = 0;

	public Ladderklimmen() {
		this.omzet += ritprijs;
		super.totaleOmzet += ritprijs;
		draait();
	}
	
	public void draait() {
		System.out.println("Jeej, ladders klimmen!");
	}
	
	public static double getRitprijs() {
		return ritprijs;
	}
	
	public static double getRitjes() {
		return ritjes;
	}
	
}
