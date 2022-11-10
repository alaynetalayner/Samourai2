package personnages.principaux;

import personnages.Humain;

public class Yakusa extends Humain{
	
	private String clan;
	private int reputation;
	
	public Yakusa(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan=clan;
		this.reputation=0;
	}
	
	public void extorquer(Commercant commercant) {
		int arg = commercant.seFaireExtorquer();
		ajouterArgent(arg);
		this.reputation++;
		parler("J'ai piqué le fric de "+commercant.getNom());
	}
	
	public void gagner() {
		this.reputation++;
		parler("J'ai gagné mon duel!");
	}
	
	public int perdre() {
		int arg = getArgent();
		perdreArgent(arg);
		this.reputation--;
		parler("J'ai perdu mon duel et mes "+arg+" sous, snif...");
		return arg;
	}
	
	public int getRep() {
		return this.reputation;
	}
	
	public String getClan() {
		return this.clan;
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de "+getClan()+".");
	}
	
	
}

