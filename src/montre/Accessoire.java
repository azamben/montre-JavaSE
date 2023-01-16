package montre;

abstract public class Accessoire extends Produit{
	private final String NOM;

	public Accessoire(String unNom, double valeurDeBase ) {
		super(valeurDeBase);
		this.NOM = unNom;
	}
// CONSCTEUR DE COPIE
	public Accessoire(Accessoire autre) {
		super(autre);
		this.NOM = autre.NOM;
	}
	// copie polymorphique d'Accessoire
	public abstract Accessoire copie();
	
	
	@Override
	public String toString() {
		String str= this.NOM + " coûtant ";
		str+= super.toString();
		return str;
	}
	
	

}
