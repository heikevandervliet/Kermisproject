package kermisdingen;

public class Hawaii extends Attractie{

private static double omzet = 0;
private static double ritprijs = 2.9;
private static int ritjes = 0;
	
	public Hawaii() {
		this.omzet += ritprijs;
		super.totaleOmzet += ritprijs;
		draait();
	}
	
	public void draait() {
		System.out.println("In de Hawaii.");
	}
	
	public static double getRitprijs() {
		return ritprijs;
	}
	
	public static double getRitjes() {
		return ritjes;
	}
	
}
