package kermisdingen;

public class Spin extends Attractie {
	
	private String name = "Spin";
	private static double omzet = 0.00;
	private double ritprijs = 2.25;
	private static int ritjes;
	
	public Spin () {
		
	}
	
	public String getName() {
		return name;
	}
	public void draait() {
		System.out.println("Spin draait.");
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
