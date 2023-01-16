package montre;

public class Montres {

	public static void main(String[] args) {
		
		// test de l'affichage des mécanismes
				MecanismeAnalogique v1 = new MecanismeAnalogique(312.00, 20141212);
				MecanismeDigital   v2 = new MecanismeDigital(32.00, "11:45", "7:00");
				MecanismeDouble v3 = new MecanismeDouble(543.00, "8:20", 20140328, "6:30");

				System.out.println(v1);
				System.out.println(v2);
				System.out.println(v3);
		
		
		
		
		
		
				// test de l'affichage des montres
		Montre m = new Montre();
		m.ajouter(new Bracelet("cuir",54.0));
		m.ajouter(new Fermoir("acier",12.5));
		m.ajouter(new Boitier("acier",36.6));
		m.ajouter(new Vitre("quartz",44.8));
		
		System.out.println("\nMontre m : ");
		m.afficher();
	}

}
