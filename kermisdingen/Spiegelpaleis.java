package kermisdingen;

public class Spiegelpaleis extends Attractie {

	private static double omzet = 0.00;
	private double ritprijs = 2.75;
	private static int ritjes = 0;
	private String name = "Spiegelpaleis";
	
	public Spiegelpaleis() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void draait() {
		System.out.println("Je bent in het spiegelpaleis. Haha!");
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
