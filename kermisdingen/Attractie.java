package kermisdingen;

public abstract class Attractie {
	
	static double totaleOmzet = 0;
	static double ritprijs = 2;
	static int ritjes = 0;
	
	protected abstract void draait();
		
	
	public static double getRitprijs() {
		return ritprijs;
	}
	
	public static double getRitjes() {
		return ritjes;
	}
	
	public static double getTotaleOmzet() {
		return totaleOmzet;
	}
	
	

}
