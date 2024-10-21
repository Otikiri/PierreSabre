package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonfav, int argent) {
		super(nom, boissonfav, argent);
	}

	public void donner(Commercant beneficiaire) {
		int argDonner = (argent * 10) / 100;

		argent -= argDonner;
		parler(beneficiaire.getNom() + " prend ces " + argDonner + " sous.");
		beneficiaire.recevoir(argDonner);
	}

	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		parler("Je t'ai retrouve vermine, tu va payer pour ce que tu as fait a ce pauvre marchand !");
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakuza! ");
			argent+= adversaire.perdre();
			honneur += 1;
		} else {
			parler("J'ai perdu contre ce yakuza , mon honneur et ma bourse ont pris un coup.");
			honneur -=1; 
			adversaire.gagner(argent);
			argent -= argent; 
		}
	}

}
