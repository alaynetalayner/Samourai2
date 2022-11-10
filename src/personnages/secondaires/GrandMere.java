package personnages.secondaires;
import java.util.Random;

import personnages.Humain;

public class GrandMere extends Humain {
	
    private Humain [] memoire;
    private int nbHumains;
    
    public GrandMere(String n,int a){
        super(n,a,"tisane");
        this.memoire=new Humain[30];
        this.nbHumains=0;
    }
    private String humainHasard() {
        Random rand = new Random();
        int nb=4;
        int int_random=rand.nextInt(nb);
        switch (int_random) {
        case 0:
            return "Commercant";
        case 1:
            return "Yakuza";
        case 2:
            return "Ronin";
        case 3:
            return "Samourai";
        }
        return "";
    }
    
    public void faireConnaissanceAvec(Humain humain) {
        if(nbHumains<30) {
            this.memoire[nbHumains]=humain;
            this.nbHumains+=1;
        }
        else {
            System.out.println("Grand-mere ne peux plus retenir de personnes");
        }
    }
    public void ragoter() {
        for(int i=0;i<nbHumains;i++) {
            if(memoire[i] instanceof Traitre) {
                parler("Je sais que "+memoire[i].getNom()+" est un traitre!");
            }
            else {
                String nom=humainHasard();
                parler("Je crois que "+ memoire[i].getNom() +" est un "+nom);
            }
        }
    }
}
