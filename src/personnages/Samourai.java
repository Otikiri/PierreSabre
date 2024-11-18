package personnages;

public class Samourai extends Humain {
	private String seigneur;

	public Samourai(String nom, String boissonfav, String seigneur, int argent) {
		super(nom, boissonfav, argent);
		this.seigneur = seigneur;
	}

	public void parler() {
		System.out.println("(" + this.getNom() + ")" + " - Bonjour je m'appelle " + this.getNom()
				+ " et j'aime boire du " + this.getBoissonfav());
		System.out.println("(" + this.getNom() + ")" + " - Je suis fier de servir le seigneur " + seigneur);
	}
	
	
	public void boire(String boisson) {
		parler("Qu'est ce que je vais boire comme boisson ? Tiens je vais prendre du "+boisson);
	}
}
