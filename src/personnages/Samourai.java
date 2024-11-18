package personnages;

public class Samourai extends Ronin {
	protected String seigneur;

	public Samourai(String nom, String boissonfav, String seigneur, int argent) {
		super(nom, boissonfav, argent);
		this.seigneur = seigneur;
	}

	@Override
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + this.getNom() + " et j'aime boire du " + this.getNom());
		parler("Je suis fier de servir le seigneur " + seigneur);
	}

	
	public void boire(String boisson) {
		parler("Qu'est ce que je vais boire comme boisson ? Tiens je vais prendre du "+boisson);
	}
}
