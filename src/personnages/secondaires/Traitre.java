package personnages.secondaires;

import personnages.principaux.Commercant;
import personnages.principaux.Samourai;

public class Traitre extends Samourai{
	
	private int traitrise;
	
	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom,argent,boisson,seigneur);
		this.traitrise=0;
	}
	
	public void direBonjour() {
		super.direBonjour();
		System.out.println("\t (Niveau actuel de traitrise : "+this.traitrise+")");
	}
	
	public int extorquer(Commercant commercant) {
		if(this.traitrise<3) {	
			int arg = commercant.seFaireExtorquer();
			ajouterArgent(arg);
			this.traitrise++;
			parler("J'ai piqué le fric de "+commercant.getNom());
		} else {
			parler("Mission échoué... Je dois faire croire que je suis gentil");
		}
		return this.traitrise;
	}

	public void faireLeGentil() {
		int arg = getArgent();
		Commercant commercant = new Commercant("Marchand", 35);
		super.donner(arg, commercant);
		int dixieme = arg / 10;
		if(dixieme > 0) {
			this.traitrise -= dixieme;
		}
		
		
	}
}
