package kermisdingen;

import java.util.Scanner;

public class Kermis {
	
	private double budget;
	private Ladderklimmen ladderklimmen;
	private Spiegelpaleis spiegelpaleis;
	private Spin spin;
	private Spookhuis spookhuis;
	private Botsauto botsauto;
	private Hawaii hawaii;
	
	public Kermis() {
		  ladderklimmen = new Ladderklimmen();
		  spiegelpaleis = new Spiegelpaleis();
		  spin = new Spin();
		  spookhuis = new Spookhuis();
		  botsauto = new Botsauto();
		  hawaii = new Hawaii();
	}
	
	
	public void zetBudget(double b) {
		this.budget = b;
	}
	
	public void kiesAttractie(int bezoek) {
		switch(bezoek) {
		case 1: if(this.budget >= botsauto.getRitprijs()) {
					this.budget -= botsauto.getRitprijs();
					botsauto.draait();
					break;
				}else {
					System.out.println("Je hebt te weinig budget voor de "+ spin.getName()+ ". Kies wat anders.");
					break;
				}
		case 2: if(this.budget >= spin.getRitprijs()) {
					this.budget -= spin.getRitprijs();
					spin.draait();
					break;
				} else { 
					System.out.println("Je hebt te weinig budget voor de "+ botsauto.getName() + ". Kies wat anders.");
					break;
				}
		case 3: if(this.budget >= spiegelpaleis.getRitprijs()) {
					this.budget -= spiegelpaleis.getRitprijs();
					spiegelpaleis.draait();
					break;
				} else {
					System.out.println("Je hebt te weinig budget voor het "+ spiegelpaleis.getName() + ". Kies wat anders.");
					break;
				}
		case 4: if (this.budget >= spookhuis.getRitprijs()) {
					this.budget -= spookhuis.getRitprijs();
					spookhuis.draait();
					break;
				} else {
					System.out.println("Je hebt te weinig budget voor het "+ spookhuis.getName() + ". Kies wat anders.");
					break;
				}
		case 5: if (this.budget >= hawaii.getRitprijs()) {
					this.budget -= hawaii.getRitprijs();
					hawaii.draait();
					break;
				} else {
					System.out.println("Je hebt te weinig budget voor de "+ hawaii.getName() + ". Kies wat anders.");
					break;
				}
		case 6: if (this.budget >= ladderklimmen.getRitprijs()) {
					this.budget -= ladderklimmen.getRitprijs();
					hawaii.draait();
					break;
				} else {
					System.out.println("Je hebt te weinig budget voor het "+ ladderklimmen.getName() + ". Kies wat anders.");
					break;
				}
		case 7: System.out.println("Je kiest er voor om te vertrekken. Bedankt voor je bezoek! Je gaat met "+this.budget+ " euro weer naar huis");
		default: System.out.println("Geen attractie gekozen, kies een getal tussen 1-6.");
					break;
		}

	}
	
	
	public void kermisbezoek () { 
		System.out.println("Leuk dat je er bent! Hoe veel geld heb je te besteden?");
		Scanner scanner = new Scanner(System.in);
		double b = scanner.nextDouble();
			if (b > 0) {
				this.zetBudget(b);
				System.out.println("Je hebt " + this.budget + " euro om te besteden.");
				
				bezoekjes: while (this.budget >0) {
					System.out.println("Welke attractie wil je doen?");
					System.out.println("Geef het bijbehorende getal in om een attractie te bezoeken");
					toonAttracties();
					
					int bezoek = scanner.nextInt();
					kiesAttractie(bezoek);

					if (this.budget>0) {
							System.out.println("Je hebt nog "+ this.budget +" euro.");
					}else {
							System.out.println("Je geld is op");
							break bezoekjes;
					}
		
	}

	scanner.close();
	
	}
		
	}
	
	public void kermiswerk () {
		
	}
	
	
	public void toonAttracties() {
				System.out.println("1: Botsauto's voor "+botsauto.getRitprijs()
				+ "\n2: Spin voor "+spin.getRitprijs()+"\n3: Spiegelpaleis voor "
				+spiegelpaleis.getRitprijs()+ "\n4: spookhuis voor "
				+spookhuis.getRitprijs()+ "\n5: Hawaii voor "+hawaii.getRitprijs()
				+"\n6: Ladderklimmen voor "+ladderklimmen.getRitprijs() 
				+"\n7: Geen attractie meer, tijd om naar huis te gaan!");
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
			Kermis kermis = new Kermis();
			kermis.kermisbezoek();
		
			
		
		}else if (wie.equalsIgnoreCase("m")) {
			Medewerker m = new Medewerker();
			System.out.println("Fijn dat je er bent. Om toegang te krijgen tot de kassa hebben we je wachtwoord nodig: " +
								"\nGeef het wachtwoord in: ");
				String ww = scanner.next();
				while(ww.equals(m.getWachtwoord()) == false) {
					System.out.println("Onjuist. Probeer opnieuw:");
					ww = scanner.next();
				}
				if (ww.equals(m.getWachtwoord())) {
					System.out.println();
					System.out.println("Correct. Werkse!");
					m.startWerkdag();
					
					while (m.getIsAanHetWerk() == true) {
						String keuze = scanner.next();
						m.werken(keuze);
						
						}

						
					}
			}
		
		scanner.close();
		}
		
				
	

}
		


/*

Houdt bij hoeveel omzet elke attractie draait, en hoeveel de omzet van de hele attractieafdeling is. 
Ook willen we weten hoe vaak er kaartjes per attractie zijn gekocht, en natuurlijk voor de attracties in het totaal.
Met de invoer van de letter "o" zien we de omzet. Met de invoer van de letter "k" zien we het aantal kaartjes.
Denk na in welke class gegevens opgeslagen moeten worden en maak hiervoor onderscheid tussen het gebruik van instance variabelen en class variabelen. 
*/