package personnages;

public class Humain {
	private static int NB_MEM_MAX = 3;
	private String nom;
	private String boissonfav;
	private int nb_connaissance = 0;
	private Humain[] connaissance = new Humain[NB_MEM_MAX];
	protected int argent;

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
		System.out.println("(" + this.nom + ") - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonfav);
	}

	public void acheter(String bien, int prix) {
		if (argent < prix) {
			parler("Je n'ai pas assez de sous.");
		}
		argent -= prix;
		parler("Jai acheter " + bien + " et maintenant il me reste " + argent + " sous");
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perteArgent(int perte) {
		argent -= perte;
	}

	public void boire() {
		parler("Mmmmm, un bon verre de " + boissonfav + "! GLOUPS!");
	}

	private void memoriser(Humain homme) {
		if (nb_connaissance < NB_MEM_MAX) {
			connaissance[nb_connaissance] = homme;
			nb_connaissance++;
		} else {
			parler("Je connait deja trop de personnes!");
		}
	}

	public void faireConnaissanceAvec(Humain homme2) {
		direBonjour();
		homme2.direBonjour();
		homme2.memoriser(this);
		memoriser(homme2);

	}

	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont : ");
		for (int i = 0; i < nb_connaissance; i++) {
			System.out.println("-" + connaissance[i].nom);
		}
	}
}
