package personnages;

public class Yakuza extends Humain {
	private int reputation = 0;
	private String clan;

	public Yakuza(String nom, String boissonfav, int argent,String clan) {
		super(nom, boissonfav, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		int argExt = victime.seFaireExtorquer();
		argent += argExt; 
		parler("J'ai pique "+argExt+" a "+victime.getNom()+" ce qui me fait "+argent+" sous dans ma poche. Hi! Hi!");
	}
	
	
}
