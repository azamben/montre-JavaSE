package montre;

public class Vitre extends Accessoire{

	public Vitre(String unNom, double valeurDeBase) {
		super("vitre "+unNom, valeurDeBase);
		
	}
	// consctueur de copie
	public Vitre(Vitre autre)
	{ super(autre);
	}

	// copie polymorphique de Boitier
	@Override
	public Vitre copie()
	{ return new Vitre(this);
	}
}
