package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonfav, int argent) {
		super(nom, boissonfav, argent);
	}

	public void recevoir(int argent) {
		this.argent += argent;
		parler(argent + " sous ! Je te remercie genereux donateur !" );

	}

	public int seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste ...");
		return argent;
	}
}
