package kermisdingen;

public class Spookhuis extends Attractie {

	private String name = "Spookhuis";
	private static double omzet = 0.00;
	private  double ritprijs = 2.25;
	private static int ritjes = 0;
	
	public Spookhuis() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void draait() {
		System.out.println("Je bent in het spookhuis. Brrrrr...");
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
