package montre;

abstract public class Produit {
//private String nom;
	private final double VALEUR;

//CONSCTEUR VEC VALEUR FIXE
	public Produit(double valeurDeBase) {
		this.VALEUR = valeurDeBase;
	}

// CONSCTEUR PAR DEFAUT
	public Produit() {
		this.VALEUR = 0.0;
	}
	//CONSCTEUR DE COPIE
	public Produit(Produit autre)
	{
		this.VALEUR = autre.VALEUR;
	}
//METHEDE CALCULE DE PRIX
	public double prix() {
		return VALEUR;
	}

	@Override
	public String toString() {
		return Double.toString(prix())+" euros";
	}

}
