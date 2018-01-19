package kermisdingen;

public class Medewerker {


	private String wachtwoord = "isdebaas";
	private boolean isAanHetWerk;
	
	public boolean getIsAanHetWerk() {
		return isAanHetWerk;
	}
	
	
	public String getWachtwoord() {
		return wachtwoord;
	}
	
	public Medewerker() {
	}
	
	public void startWerkdag() {
		this.isAanHetWerk = true;
		System.out.println("Geef door middel van de cijfers 1-6 aan welke kaartjes je verkoopt." + 
				"\nOf kijk met 'o' of 'k' wat de omzet of de hoeveelheid verkochte kaartjes is."+
				"\nOm je werkdag te beeindigen kies 's'.");
		
		System.out.println("1: Botsauto's \n2: Spin \n3: Spiegelpaleis \n4: Spookhuis \n5: Hawaii \n6: Ladderklimmen \no = omzet \nk = aantal verkochte kaartjes \ns = stop"); 
	
	}
	
	public void werken(String keuze) {
		Attractie a = new Attractie();
		Botsauto b = new Botsauto();
		Spin s = new Spin();
		Spiegelpaleis sp = new Spiegelpaleis();
		Spookhuis sh = new Spookhuis();
		Hawaii h = new Hawaii();
		Ladderklimmen l = new Ladderklimmen();

		
		switch(keuze) {
		case "1": 	System.out.println();
					b.draait();
					System.out.println();
					break;
		case "2":	System.out.println();
					s.draait();
					System.out.println();
					break;
		case "3": 	System.out.println();
					sp.draait();
					System.out.println();
					break;
		case "4": 	System.out.println();
					sh.draait();
					System.out.println();
					break;
		case "5": 	System.out.println();
					h.draait();
					System.out.println();
					break;
		case "6": 	System.out.println();
					l.draait();
					System.out.println();
					break;
		case "o"	:	System.out.println();
					System.out.println("De huidige omzet in euro is: "+ (a.getOmzet()));
					System.out.println("De omzet per attractie is: "+
							"\nBotsauto's: " + b.getOmzet()+
							"\nSpin: "+ s.getOmzet()+
							"\nSpiegelpaleis: "+ sp.getOmzet()+
							"\nSpookhuis: "+ sh.getOmzet()+
							"\nHawaii: "+ h.getOmzet()+
							"\nLadderklimmen: "+ l.getOmzet());
					System.out.println();
					break;
		case "k":	System.out.println();
					System.out.println("De huidige kaartverkoop is: "+ a.getRitjes());
					System.out.println("De kaartverkoop per attractie is: "+
						"\nBotsauto's: " + b.getRitjes()+
						"\nSpin: "+ s.getRitjes()+
						"\nSpiegelpaleis: "+ sp.getRitjes()+
						"\nSpookhuis: "+ sh.getRitjes()+
						"\nHawaii: "+ h.getRitjes()+
						"\nLadderklimmen: "+ l.getRitjes());
					System.out.println();
					break;
		case "s":	System.out.println();
					System.out.println("De dag is ten einde.");
					System.out.println("De dagomzet in euro's is: "+ a.getOmzet());
					System.out.println("De totale kaartverkoop is: "+ a.getRitjes());
					System.out.println("Tot de volgende keer!");
					this.eindeWerkdag();
					break ;
		default: 	System.out.println();
					System.out.println("Geen geldige actie gekozen, kies een getal tussen 1-6 of 'o','k' of 's'.");
					System.out.println();
					break;
		}
	}
	
	public void eindeWerkdag() {
		isAanHetWerk = false;
	}
}
