package personnages;

public class Ronin extends Humain {
	private int force; 
	private int honneur = 1; 

	public Ronin(String nom, String boissonfav, int argent,int force) {
		super(nom, boissonfav, argent);
		this.force = force; 
	}
	
	public void donner(Commercant beneficiaire) {
		int argDonner =  (argent*10)/100;
		
		argent -= argDonner;
		parler(beneficiaire.getNom()+" prend ces "+argDonner+" sous.");
		beneficiaire.recevoir(argDonner);
	}

}
