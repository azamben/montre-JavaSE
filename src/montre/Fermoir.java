package montre;

public class Fermoir extends Accessoire {

	public Fermoir(String unNom, double valeurDeBase) {
		super("fermoir "+unNom, valeurDeBase);
		
	}
	// CONSCTEUR DE COPIE
	public Fermoir(Fermoir autre) {
		super(autre);
		
	}
	// copie polymorphique de Fermoir
	@Override
	public Fermoir copie() {
		
		return  new Fermoir(this);
	}
}
