package personnages.principaux;


import personnages.Humain;


public class Ronin extends Humain{	
	
	private int honneur;
	
	public Ronin(String nom, int argent, String boisson) {
		super(nom,argent,boisson);
		this.honneur=1;
	}
	
	public void donner(int argent, Commercant commercant) {
		parler("Tiens "+commercant.getNom()+" voila "+argent+" sous.");
		commercant.recevoir(argent);
		perdreArgent(argent);
	}
	
	public void provoquer(Yakusa yakusa) {
		int dbHonneur = 2*(this.honneur);
		if(dbHonneur>yakusa.getRep()) {
			ajouterArgent(yakusa.getArgent());
			yakusa.perdre();
			this.honneur++;
			parler("Je t'ai eu petit yakusa!");
		} else {
			this.honneur--;
			yakusa.gagner();
			parler("J'ai perdu le duel...snif");
		}
	}

}
