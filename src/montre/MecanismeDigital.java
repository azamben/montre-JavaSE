package montre;

public class MecanismeDigital extends Mecanisme implements ReveilDigital {
	private String reveil;

	public MecanismeDigital(double valeurDeBase, String unHeure, String heureReveil) {
		super(valeurDeBase, unHeure);
		this.reveil = heureReveil;
	}

	@Override

	protected String toStringType() {
		return "digital";
	}

	@Override
	protected String toStringCardan() {
		return super.toStringCardan() + ", " + toStringReveil();

	}

	public String toStringReveil() {
		return "reveil " + reveil;
	}
	//Copie polymorphique de MecanismeDigital
	public MecanismeDigital(MecanismeDigital autre)
	{
		super(autre);
		this.reveil = autre.reveil;
	}
		@Override
		public MecanismeDigital copie()
		{ return new MecanismeDigital(this);
		}
}
