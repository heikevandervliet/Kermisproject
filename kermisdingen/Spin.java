package kermisdingen;

public class Spin extends Attractie {
	
	private static double omzet = 0;
	private static double ritprijs = 2.25;
	private static int ritjes;
	
	public Spin () {
		this.omzet += ritprijs;
		super.totaleOmzet += ritprijs;
		draait();
	}
	
	public void draait() {
		System.out.println("Spin draait.");
	}
	
	public static double getRitprijs() {
		return ritprijs;
	}
	
	public static double getRitjes() {
		return ritjes;
	}
	

}
