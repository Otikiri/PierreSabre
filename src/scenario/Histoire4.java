package scenario;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class Histoire4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof","Kombucha",52);
		Commercant marco = new Commercant("Marco", "the", 15);
		Yakuza yaku = new Yakuza("Yaku le Noir","Whiskey",30,"Warsong",0);
		Ronin roro = new Ronin("Roro","shochu",60);
		prof.direBonjour();
		prof.acheter("Kombucha", 12);
		prof.boire();
		prof.parler("J'ai 42 sous en poche. Je pouvais m'offrir un jeu a 2 sous ");
		prof.parler("J'ai 40 sous en poche. Je ne peux meme pas m'offrir un kimono a 50 sous");
		yaku.direBonjour();
		yaku.parler("Tiens,tiens, ne serait pas un faible commercant? ");
		yaku.parler(marco.getNom()+", si tu tient a ta vie donne moi ta bourse");
		yaku.extorquer(marco);
		roro.donner(marco);
		roro.provoquer(yaku);
		}
}
