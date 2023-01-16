package montre;

public class MecanismeAnalogique extends Mecanisme {
	private int date;
public MecanismeAnalogique(double valeurDeBase, String unHeure, int uneDate) {
		super(valeurDeBase, unHeure);
		this.date = uneDate;
			}
public MecanismeAnalogique(double valeurDeBase, int uneDate) {
	super(valeurDeBase);
	this.date = uneDate;
	

}
@Override
protected String toStringType() {
	return "digital";
}


//Copie polymorphique de MecanismeAnalogique
public MecanismeAnalogique(MecanismeAnalogique autre)
{
	super(autre);
	date = autre.date;
}
	@Override
	public MecanismeAnalogique copie()
	{ return new MecanismeAnalogique(this);
	}
/*
@Override
protected String toStringCardan() {
	return super.toStringCardan()+ ", "+toStringReveil();

}
public String toStringReveil() {
	return "reveil "+ reveil;
}
*/
}