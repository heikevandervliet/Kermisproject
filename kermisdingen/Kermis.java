package kermisdingen;

import java.util.Scanner;

public class Kermis {
	
	private double budget;
	
	public Kermis (double budget) { 
		this.budget = budget;
	}

	public static void main(String[] args) {
		
		System.out.println("Welkom op de kermis!");
		System.out.println("Geef aan of je een bezoeker of medewerker bent. \n"
				+ "Type 'b' voor bezoeker en 'm' voor medewerker. ");
		
		Scanner scanner = new Scanner(System.in);
		String wie = scanner.next();
		while ((wie.equalsIgnoreCase("b")) == false && (wie.equalsIgnoreCase("m") == false)) {
			System.out.println("Onjuiste invoer. Probeer opnieuw: ");
			wie = scanner.next();
		}
		if (wie.equalsIgnoreCase("b")) {
			System.out.println("Leuk dat je er bent! Hoe veel geld heb je te besteden?");
			double b = scanner.nextDouble();
				if (b > 0) {
					Kermis kermisbezoek = new Kermis(b);
					System.out.println("Je hebt " + kermisbezoek.budget + " euro om te besteden.");
					
					bezoekjes: while (kermisbezoek.budget >0) {
					System.out.println("Welke attractie wil je doen?");
					System.out.println("Geef het bijbehorende getal in om een attractie te bezoeken");
					System.out.println("1: Botsauto's voor "+Botsauto.getRitprijs()+ "\n2: Spin voor "+Spin.getRitprijs()+
										"\n3: Spiegelpaleis voor "+Spiegelpaleis.getRitprijs()+ "\n4: Spookhuis voor "+
										Spookhuis.getRitprijs()+ "\n5: Hawaii voor "+Hawaii.getRitprijs()+
										"\n6: Ladderklimmen voor "+Ladderklimmen.getRitprijs());
					int bezoek = scanner.nextInt();
		
					switch(bezoek) {
					case 1: if(kermisbezoek.budget >= Botsauto.getRitprijs()) {
								new Botsauto();	
								kermisbezoek.budget -= Botsauto.getRitprijs();
								break;
							}else {
								System.out.println("Je hebt te weinig budget voor de "+ Spin.getName()+ ". Kies wat anders.");
								break;
							}
					case 2: if(kermisbezoek.budget >= Spin.getRitprijs()) {
								new Spin();
								kermisbezoek.budget -= Spin.getRitprijs();
								break;
							} else { 
								System.out.println("Je hebt te weinig budget voor de "+ Botsauto.getName() + ". Kies wat anders.");
								break;
							}
					case 3: if(kermisbezoek.budget >= Spiegelpaleis.getRitprijs()) {
								new Spiegelpaleis();
								kermisbezoek.budget -= Spiegelpaleis.getRitprijs();
								break;
							} else {
								System.out.println("Je hebt te weinig budget voor het "+ Spiegelpaleis.getName() + ". Kies wat anders.");
								break;
							}
					case 4: if (kermisbezoek.budget >= Spookhuis.getRitprijs()) {
								new Spookhuis();
								kermisbezoek.budget -= Spookhuis.getRitprijs();
								break;
							} else {
								System.out.println("Je hebt te weinig budget voor het "+ Spookhuis.getName() + ". Kies wat anders.");
								break;
							}
					case 5: if (kermisbezoek.budget >= Hawaii.getRitprijs()) {
								new Hawaii();
								kermisbezoek.budget -= Hawaii.getRitprijs();
								break;
							} else {
								System.out.println("Je hebt te weinig budget voor de "+ Hawaii.getName() + ". Kies wat anders.");
								break;
							}
					case 6: if (kermisbezoek.budget >= Ladderklimmen.getRitprijs()) {
								new Ladderklimmen();
								kermisbezoek.budget -= Ladderklimmen.getRitprijs();
								break;
							} else {
								System.out.println("Je hebt te weinig budget voor het "+ Ladderklimmen.getName() + ". Kies wat anders.");
								break;
							}
					default: System.out.println("Geen attractie gekozen, kies een getal tussen 1-6.");
								break;
					}

				if (kermisbezoek.budget>0) {
					System.out.println("Je hebt nog "+ kermisbezoek.budget +" euro.");
					System.out.println("Wil je nog een attractie doen? Type: 'ja' of 'nee'.");
				}else {
					break bezoekjes;
				}
			
			String vraag = scanner.next();
			if (vraag.equalsIgnoreCase("ja")) {
				continue bezoekjes;
			} else if (vraag.equalsIgnoreCase("nee")){
				System.out.println("Je gaat met " + kermisbezoek.budget + " weer naar huis.");
				System.out.println("Bedankt voor je bezoek en tot ziens!");
				scanner.close();
				break;
			}
			else {
				System.out.println("Ik heb het niet begrepen, dus misschien is het tijd om te stoppen? \nJe krijgt nog een kans.");
				System.out.println("Type 'ja' om door te gaan en 'nee' om naar huis te gaan.");
				String laatsteKans = scanner.next();
				if (laatsteKans.equalsIgnoreCase("ja")) {
					continue bezoekjes;
				} else if (vraag.equalsIgnoreCase("nee")){
					System.out.println("Je gaat met " + kermisbezoek.budget + " weer naar huis.");
					System.out.println("Bedankt voor je bezoek en tot ziens!");
					scanner.close();
					break;
				}
				
			}
		 
		}
	
		scanner.close();
		
		}
		
		}else if (wie.equalsIgnoreCase("m")) {
			System.out.println("Fijn dat je er bent. Om toegang te krijgen tot de kassa hebben we je wachtwoord nodig: " +
								"\nGeef het wachtwoord in: ");
				String ww = scanner.next();
				while(ww.equals(Medewerker.getWachtwoord()) == false) {
					System.out.println("Onjuist. Probeer opnieuw:");
					ww = scanner.next();
				}
				if (ww.equals(Medewerker.getWachtwoord())) {
					System.out.println();
					System.out.println("Correct. Werkse!");
					Medewerker medewerker = new Medewerker();
					
					while (medewerker.getIsAanHetWerk() == true) {
						System.out.println("Geef door middel van de cijfers 1-6 aan welke kaartjes je verkoopt." + 
								"\nOf kijk met 'o' of 'k' wat de omzet of de hoeveelheid verkochte kaartjes is."+
								"\nOm je werkdag te beeindigen kies 's'.");
						System.out.println("1: Botsauto's \n2: Spin \n3: Spiegelpaleis \n4: Spookhuis \n5: Hawaii \n6: Ladderklimmen \no = omzet \nk = aantal verkochte kaartjes \ns = stop"); 
						String actie = scanner.next();
						switch(actie) {
						case "1": 	System.out.println();
									new Botsauto();	
									System.out.println();
									break;
						case "2":	System.out.println();
									new Spin();
									System.out.println();
									break;
						case "3": 	System.out.println();
									new Spiegelpaleis();
									System.out.println();
									break;
						case "4": 	System.out.println();
									new Spookhuis();
									System.out.println();
									break;
						case "5": 	System.out.println();
									new Hawaii();
									System.out.println();
									break;
						case "6": 	System.out.println();
									new Ladderklimmen();
									System.out.println();
									break;
						case "o"	:	System.out.println();
									System.out.println("De huidige omzet in euro is: "+ Attractie.getOmzet());
									System.out.println("De omzet per attractie is: "+
											"\nBotsauto's: " + Botsauto.getOmzet()+
											"\nSpin: "+ Spin.getOmzet()+
											"\nSpiegelpaleis: "+ Spiegelpaleis.getOmzet()+
											"\nSpookhuis: "+ Spookhuis.getOmzet()+
											"\nHawaii: "+ Hawaii.getOmzet()+
											"\nLadderklimmen: "+ Ladderklimmen.getOmzet());
									System.out.println();
									break;
						case "k":	System.out.println();
									System.out.println("De huidige kaartverkoop is: "+ Attractie.getRitjes());
									System.out.println("De kaartverkoop per attractie is: "+
										"\nBotsauto's: " + Botsauto.getRitjes()+
										"\nSpin: "+ Spin.getRitjes()+
										"\nSpiegelpaleis: "+ Spiegelpaleis.getRitjes()+
										"\nSpookhuis: "+ Spookhuis.getRitjes()+
										"\nHawaii: "+ Hawaii.getRitjes()+
										"\nLadderklimmen: "+ Ladderklimmen.getRitjes());
									System.out.println();
									break;
						case "s":	System.out.println();
									System.out.println("De dag is ten einde.");
									System.out.println("De dagomzet in euro's is: "+ Attractie.getOmzet());
									System.out.println("De totale kaartverkoop is: "+ Attractie.getRitjes());
									System.out.println("Tot de volgende keer!");
									medewerker.eindeWerkdag();
									scanner.close();
									break ;
						default: 	System.out.println();
									System.out.println("Geen geldige actie gekozen, kies een getal tussen 1-6 of 'o','k' of 's'.");
									System.out.println();
									break;
						}

						
					}
			}
		
		}
		
				
	}

}
		


/*

Houdt bij hoeveel omzet elke attractie draait, en hoeveel de omzet van de hele attractieafdeling is. 
Ook willen we weten hoe vaak er kaartjes per attractie zijn gekocht, en natuurlijk voor de attracties in het totaal.
Met de invoer van de letter "o" zien we de omzet. Met de invoer van de letter "k" zien we het aantal kaartjes.
Denk na in welke class gegevens opgeslagen moeten worden en maak hiervoor onderscheid tussen het gebruik van instance variabelen en class variabelen. 
*/