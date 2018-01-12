package kermisdingen;

public abstract class Attractie {
	
	static double omzet = 0;
	static double ritprijs = 2;
	static int ritjes = 0;
	
	protected abstract void draait();
		
	
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
