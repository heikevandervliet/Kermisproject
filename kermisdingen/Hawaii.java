package kermisdingen;

public class Hawaii extends Attractie{

	private static String name = "Hawaii";
	private static double omzet = 0.00;
	private static double ritprijs = 2.90;
	private static int ritjes = 0;
	
	public Hawaii() {
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
		System.out.println("In de Hawaii.");
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
