package personnages.principaux;


public class Samourai extends Ronin{
	
	private String seigneur;
	
	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom,argent,boisson);
		this.seigneur = seigneur;
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Je sers a "+this.seigneur);
	}
	
	public void boire() {
		super.boire();
	}
	
	public void boire(String boisson) {
		parler("Mmmm ! Un bon verre de "+boisson+" ! GLOUPS !");
	}
	
}
