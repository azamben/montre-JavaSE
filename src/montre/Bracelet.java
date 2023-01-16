package montre;

public class Bracelet extends Accessoire{

	public Bracelet(String unNom, double valeurDeBase) {
		super("bracelet "+unNom, valeurDeBase);
	}
	// CONSCTEUR DE COPIE
	public Bracelet(Bracelet autre) {
		super(autre);
		
	}
	// copie polymorphique de Bracelet
	@Override
	public Bracelet copie() {
		
		return  new Bracelet(this);
	}

}
