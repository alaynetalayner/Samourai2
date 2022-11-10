package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom,  int argent, String boisson) {
		this.nom=nom;
		this.boisson=boisson;
		this.argent=argent;
	}
	
	public void parler(String texte) {
		System.out.println("("+this.nom+") - "+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+this.nom+", j'aime boire du "+this.boisson+
				" et j'ai "+this.argent+" sous en poche");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+this.boisson+" ! GLOUPS !");
	}
	
	public void ajouterArgent(int valeur) {
		this.argent += valeur;
	}
	
	public void perdreArgent(int valeur) {
		this.argent -= valeur;
	}
	
	public int getArgent() {
		return this.argent;
	}
	
	public String getBoisson() {
		return this.boisson;
	}
	
	public String getNom() {
		return this.nom;
	}
}
