package personnages;

public class Humain {
	private String nom;
	private String boissonfav;
	private int argent;

	public Humain(String nom, String boissonfav, int argent) {
		this.nom = nom;
		this.boissonfav = boissonfav;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public String getBoissonfav() {
		return boissonfav;
	}
	
	public void parler(String texte) {
		System.out.println("("+this.nom+") - "+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour! Je m'appelle "+this.nom+"et j'aime boire du "+this.boissonfav);
	}
	
	public void acheter(String bien,int prix) {
		if (argent < prix) {
			parler("Je n'ai pas assez de sous.");	
		}
		argent -= prix; 
		parler("Jai acheter "+bien+" et maintenant il me reste "+argent+" sous");
	}
	
	public void gagnerArgent(int gain) {
		argent += gain; 
	}
	
	public void perteArgent(int perte) {
		argent -= perte; 
	}
	
	public void boire() {
		parler("Mmmmm, un bon verre de "+boissonfav+"! GLOUPS!");
	}
	
}


