package kermisdingen;

public class Medewerker {


	private static String wachtwoord = "isdebaas";
	private static boolean isAanHetWerk;
	
	public static boolean getIsAanHetWerk() {
		return isAanHetWerk;
	}
	
	
	public static String getWachtwoord() {
		return wachtwoord;
	}
	
	public Medewerker() {
		this.isAanHetWerk = true;
	}
	
	public static void eindeWerkdag() {
		isAanHetWerk = false;
	}
}
