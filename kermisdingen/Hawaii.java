package kermisdingen;

public class Hawaii extends Attractie{

	private String name = "Hawaii";
	private static double omzet = 0.00;
	private double ritprijs = 2.90;
	private static int ritjes = 0;
	
	public Hawaii() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void draait() {
		System.out.println("In de Hawaii.");
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
