package scenario;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;
import personnages.Samourai;
import personnages.Traitre;


public class Histoire5 {
	public static void main(String[] args) {
		
		Commercant marco = new Commercant("Marco", "the", 20);
		Commercant chonin = new Commercant("Chonin", "the", 40);
		Commercant yumi = new Commercant("Yumie", "the", 10);
		Yakuza yaku = new Yakuza("Yaku le Noir","Whiskey",30,"Warsong",0);
		Ronin roro = new Ronin("Roro","shochu",60);
		Samourai aki = new Samourai("Akimoto","sake","Miyamoto",80);
		Traitre masako = new Traitre("Masako", "whiskey","Miyamoto", 100);
		masako.faireLeGentil();
		masako.ranconner(marco);
		masako.ranconner(yumi);
		masako.ranconner(chonin);
		masako.faireConnaissanceAvec(aki);
		masako.faireConnaissanceAvec(yaku);
		masako.faireLeGentil();
		masako.faireConnaissanceAvec(roro);

	}
}
