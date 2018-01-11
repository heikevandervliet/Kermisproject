package kermisdingen;

import java.util.Scanner;

public class Kermis {
	
	private double budget;
	
	public Kermis (double budget) { 
		this.budget = budget;
	}

	public static void main(String[] args) {
		
		Kermis kermis = new Kermis(10.0);
		
		System.out.println("Welkom op de kermis!");
		System.out.println("Je hebt " + kermis.budget + " euro om te besteden.");
			
		Scanner scanner = new Scanner(System.in);
		
			
		bezoekjes: while (kermis.budget >0) {
			System.out.println("Welke attractie wil je doen?");
			System.out.println("Geef het bijbehorende getal in om een attractie te bezoeken");
			System.out.println("1: Botsauto's \n2: Spin \n3: Spiegelpaleis \n4: Spookhuis \n5: Hawaii \n6: Ladderklimmen");
			int bezoek = scanner.nextInt();
		
		switch(bezoek) {
		case 1: new Botsauto();	
				kermis.budget -= Botsauto.getRitprijs();
				break;
		case 2: new Spin();
				kermis.budget -= Spin.getRitprijs();
				break;
		case 3: new Spiegelpaleis();
				kermis.budget -= Spiegelpaleis.getRitprijs();
				break;
		case 4: new Spookhuis();
				kermis.budget -= Spookhuis.getRitprijs();
				break;
		case 5: new Hawaii();
				kermis.budget -= Hawaii.getRitprijs();
				break;
		case 6: new Ladderklimmen();
				kermis.budget -= Ladderklimmen.getRitprijs();
				break;
		default: System.out.println("Geen attractie gekozen, kies een getal tussen 1-6.");
				break;
				}
		
		
		if (kermis.budget>0) {
			System.out.println("Je hebt nog "+ kermis.budget +" euro.");
			System.out.println("Wil je nog een attractie doen? Type: 'ja' of 'nee'.");
		}else {
			break bezoekjes;
		}
			
		String vraag = scanner.next();
		
			if (vraag.equalsIgnoreCase("ja")) {
				continue bezoekjes;
			} else if (vraag.equalsIgnoreCase("nee")){
				System.out.println("Je gaat met " + kermis.budget + " weer naar huis.");
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
					System.out.println("Je gaat met " + kermis.budget + " weer naar huis.");
					System.out.println("Bedankt voor je bezoek en tot ziens!");
					scanner.close();
					break;
				}
				
			}
		
		}
	
		System.out.println("Je geld is op. Bedankt voor je bezoek en tot ziens!");
		scanner.close();
		
	}

}


/*

Houdt bij hoeveel omzet elke attractie draait, en hoeveel de omzet van de hele attractieafdeling is. 
Ook willen we weten hoe vaak er kaartjes per attractie zijn gekocht, en natuurlijk voor de attracties in het totaal.
Met de invoer van de letter "o" zien we de omzet. Met de invoer van de letter "k" zien we het aantal kaartjes.
Denk na in welke class gegevens opgeslagen moeten worden en maak hiervoor onderscheid tussen het gebruik van instance variabelen en class variabelen. 
*/