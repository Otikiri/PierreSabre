package personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int niv_traitrise = 0;

	public Traitre(String nom, String boissonfav, String seigneur, int argent) {
		super(nom, boissonfav, seigneur, argent);
	}

	@Override
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + " et j'aime boire du " + boissonfav);
		parler("Je suis fier de servir le seigneur " + seigneur + "et mon niveau de traitrise est de " + niv_traitrise);
	}

	public void ranconner(Commercant commercant) {
		if (niv_traitrise < 3) {
			int arg_com = commercant.getArgent();
			int arg_ranc = (arg_com * 2) / 10;
			gagnerArgent(arg_ranc);
			niv_traitrise++;
			parler("Si tu veux ma protection des Yakuza ... Donne moi " + arg_ranc + " sous ou gare a toi");
			commercant.perteArgent(arg_ranc);
			parler("Tout de suite grand " + this.getNom() + " .");
		} else {
			parler("Mince .... demasquer");
		}

	}

	public void faireLeGentil() {
		if (nb_connaissance < 1) {
			parler("pas d'ami");
		} else {
			int don = (argent * 2) / 10;
			Random rand = new Random();
			int rand_connaissance = rand.nextInt(nb_connaissance);
			Humain ami = connaissance[rand_connaissance];
			String nomAmi = ami.getNom();
			parler("absolument ... faire ami ami avec " + nomAmi);
			parler("je vous donne " + don + " sous ");
			ami.gagnerArgent(don);
			perteArgent(don);
			ami.parler("vous etes qq de bien " + this.getNom());
			if (niv_traitrise > 1) {
				niv_traitrise--;
			}
		}
	}
}
