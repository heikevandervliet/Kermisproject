package kermisdingen;

public class Spin extends Attractie {
	
	private static String name = "Spin";
	private static double omzet = 0;
	private static double ritprijs = 2.25;
	private static int ritjes;
	
	public Spin () {
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
		System.out.println("Spin draait.");
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
