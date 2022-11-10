package histoires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Ronin;
import personnages.principaux.Samourai;
import personnages.principaux.Yakusa;
import personnages.secondaires.GrandMere;
import personnages.secondaires.Traitre;


public class MonHistoire {

	public static void main(String[] args) {
		Humain humain = new Humain("Prof", 10, "Porto");
		humain.direBonjour();
		humain.boire();
		
		Commercant commercant = new Commercant("Marchand", 35);
		commercant.direBonjour();
		
		Yakusa yakusa = new Yakusa("Yaku le noir", 42, "biere", "Warsong");
		yakusa.direBonjour();
		yakusa.extorquer(commercant);
		
		Ronin ronin = new Ronin("Roro", 61, "sake");
		ronin.donner(10,commercant);
		ronin.provoquer(yakusa);
		ronin.direBonjour();
		
		Ronin musaichi = new Samourai("Akimoto", 20, "thé", "Miyamoto");
		musaichi.direBonjour();
		musaichi.boire();
		Samourai samourai = new Samourai("Akimoto", 20, "thé", "Miyamoto");
		samourai.boire("sake");
		
		Samourai susame = new Traitre("Toti", 30, "lait", "Mami");
		susame.direBonjour();
		Traitre traitre = new Traitre("Toti", 30, "lait", "Mami");
		traitre.extorquer(commercant);
		traitre.faireLeGentil();
		
		Humain yalola = new GrandMere("Tata", 40);
		yalola.direBonjour();
		yalola.boire();
		GrandMere grandmere = new GrandMere("Tata", 40);
		grandmere.faireConnaissanceAvec(humain);
		grandmere.ragoter();
	}

}
