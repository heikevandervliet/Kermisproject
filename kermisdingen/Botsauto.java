package kermisdingen;

public class Botsauto extends Attractie {

private static double omzet = 0.00;
private double ritprijs = 2.50;
private static int ritjes = 0;
private String name = "Botsauto's";
	
	public Botsauto () {
		
	}
	
	public void draait() {
		System.out.println("Botsauto's rijden.");
		this.omzet += ritprijs;
		super.omzet += ritprijs;
		this.ritjes++;
		super.ritjes++;
	}
	
	public String getName() { 
		return name;
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
