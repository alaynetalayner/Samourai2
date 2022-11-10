package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain{
	
	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		int arg=getArgent();
		perdreArgent(arg);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return arg;
	}
	
	public void recevoir(int argent) {
		ajouterArgent(argent);
		parler("Je te remercie généreux donateur!");		
	}
}
