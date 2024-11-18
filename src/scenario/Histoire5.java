package scenario;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class Histoire5 {
	public static void main(String[] args) {
		
		Commercant marco = new Commercant("Marco", "the", 15);
		Commercant chonin = new Commercant("Chonin", "the", 15);
		Commercant yumi = new Commercant("Yumie", "the", 15);
		Yakuza yaku = new Yakuza("Yaku le Noir","Whiskey",30,"Warsong",0);
		Ronin roro = new Ronin("Roro","shochu",60);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(yumi);
		marco.faireConnaissanceAvec(chonin);
		marco.listerConnaissance();
		
		yaku.parler();

	}
}
