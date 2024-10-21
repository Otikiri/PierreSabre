package scenario;

import personnages.Humain;

public class Histoire4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof","Kombucha",52);
		prof.direBonjour();
		prof.acheter("Kombucha", 12);
		prof.boire();
		prof.parler("J'ai 42 sous en poche. Je pouvais m'offrir un jeu a 2 sous ");
		prof.parler("J'ai 40 sous en poche. Je ne peux meme pas m'offrir un kimono a 50 sous");
	}
}
