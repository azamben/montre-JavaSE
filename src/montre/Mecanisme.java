package montre;

public abstract class Mecanisme extends Produit{
	private String heure;

	public Mecanisme(double valeurDeBase, String unHeure) {
		super(valeurDeBase);
		this.heure = unHeure;
			}
	public Mecanisme(double valeurDeBase) {
		super(valeurDeBase);
		this.heure = "12:00";
			}
	// CONSCTEUR DE COPIE
	public Mecanisme(Mecanisme autre) 
	{ super(autre);
		heure = autre.heure;
	}
	@Override
	public final String toString() {
		String resultat = "mécanisme";
		resultat+= toStringType();
		resultat+= " (affichage : ";
		resultat+= toStringCardan();
		resultat+="), prix :";
		resultat+= super.toString();
		return resultat;
	}
protected String toStringCardan() {
	return this.heure;
	
}
protected abstract String toStringType();
//copie polymorphique de Mecanisme
public abstract Mecanisme copie();
}
