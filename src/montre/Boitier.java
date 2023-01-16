package montre;

public class Boitier extends Accessoire{

	public Boitier(String unNom, double valeurDeBase) {
		super("boitier " +unNom, valeurDeBase);
	}
	// CONSCTEUR DE COPIE
	public Boitier(Boitier autre) {
		super(autre);
		
	}
	// copie polymorphique de Boitier
	@Override
	public Boitier copie() {
		
		return  new Boitier(this);
	}

}
