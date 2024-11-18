package personnages;

public class Yakuza extends Humain {
	private int reputation = 0;
	private String clan;

	public Yakuza(String nom, String boissonfav, int argent, String clan, int reputation) {
		super(nom, boissonfav, argent);
		this.clan = clan;
		this.reputation = reputation;
	}

	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		int argExt = victime.seFaireExtorquer();
		argent += argExt;
		parler("J'ai pique " + argExt + " a " + victime.getNom() + " ce qui me fait " + argent
				+ " sous dans ma poche. Hi! Hi!");
	}

	public int perdre() {
		int argDonner = argent;
		argent -= argDonner;
		reputation -= 1;
		parler("J'ai perdu mon duel et mes " + argDonner + " sous,snif ... J'ai deshonore le clan de " + clan);
		return argDonner;
	}

	public void gagner(int gain) {
		argent += gain;
		parler("Ce ronin pensait vraiment battre " + super.getNom() + " du clan de " + clan
				+ " ? Je l'ai depouille de ses " + gain + " sous!");
	}

	@Override 
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonfav);
		parler("Mon clan est celui de "+clan);
	}


}
