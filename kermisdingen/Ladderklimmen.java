package kermisdingen;

public class Ladderklimmen extends Attractie {

private String name = "Ladderklimmen";
private static double omzet = 0.00;
private double ritprijs = 5.00;
private static int ritjes = 0;

	public Ladderklimmen() {
		
	}
	
	public String getName() {
		return name;
	}
	public void draait() {
		System.out.println("Jeej, ladders klimmen!");
		this.omzet += ritprijs;
		super.omzet += ritprijs;
		this.ritjes++;
		super.ritjes++;
	}
	
	public double getRitprijs() {
		return ritprijs;
	}
	
	public int getRitjes() {
		return ritjes;
	}
	
	public double getOmzet() {
		return omzet;
	}
	
}
