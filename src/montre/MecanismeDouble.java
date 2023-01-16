package montre;

public class MecanismeDouble extends MecanismeAnalogique implements ReveilDigital {
	private String reveil;
	public MecanismeDouble(double valeurDeBase, String unHeure, int uneDate, String heureReveil) {
		super(valeurDeBase, unHeure, uneDate);
		this.reveil = heureReveil;
	}

	
	public MecanismeDouble(double valeurDeBase, int uneDate, String heureReveil) {
		super(valeurDeBase, uneDate);
		this.reveil = heureReveil;
	}
	@Override
	protected String toStringCardan() {
		String result= "sur l'écran : ";
		result+=super.toStringCardan();
		result+=", sous les aiguilles : ";
		result+= toStringReveil();
		return  result ;

	}
	@Override
	protected String  toStringType() {
		return "double";
	}


	@Override
	public String toStringReveil() {
		
		return " reveil "+ reveil;
	}
	
}
