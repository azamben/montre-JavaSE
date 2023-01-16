package montre;

import java.util.ArrayList;

public class Montre extends Produit{
	private Mecanisme coeur;
	private ArrayList<Accessoire>accessoires;
	
	public Montre() {
		this.accessoires = new ArrayList<Accessoire>();
	}
	public Montre(Mecanisme depart ) {
		this.coeur = depart;
		this.accessoires = new ArrayList<Accessoire>();
	}
	// CONSTRUCTEUR DE COPIE  PROFONDE d'une Montre
	public Montre(Montre autre ) {
		super(autre);
		coeur= autre.coeur.copie();
		accessoires = new ArrayList<Accessoire>();
		for (Accessoire acc : autre.accessoires) {
						accessoires.add(acc.copie());
				}
	}
//METHODE AJOTER UN ACCESSOIRE
	public void ajouter(Accessoire accessoire) {
		accessoires.add(accessoire);
	}
	
	//METHODE AJOTER UN ACCESSOIRE
	public void afficher() {
		System.out.println("Une montre composée de : ");
		for(Accessoire acc: accessoires) {
		System.out.println(" * "+ acc);
		}
		System.out.println("==> Prix total : "+ prix());
	}
	@Override
	public double prix() {
		double prixFinal = super.prix();
		for(Accessoire acc: accessoires) {
			prixFinal+= acc.prix();
		}
		
		return prixFinal;
		
	}
}
