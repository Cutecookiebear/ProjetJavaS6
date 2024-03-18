package application.usineBonbon;

public class Main {
	
	public static void main(String args[]) {
		
		/*on commence avec une usine d'un patrimoine de 500 000 euros*/
		Usine HappyCandies = new Usine(500000);
		Element fraise = new Element("B0000001", "Fraise Tagada", "200g", 0.0, 3.50);
		Element elem1 = new Element("M0000001",	"Gélatine", "g", 0.1, 0.0);
		Element elem2 = new Element("M0000002",	"Sucre", "g", 500, 0.05, 0.0);
		Element elem3 = new Element("M0000003", "Sirop de glucose", "g",500, 0.2, 0.0);
		Element elem4 = new Element("M0000005", "Arome fraise", "u", 100, 0.04, 0.0);
		Element elem5 = new Element("M000E104",	"Colorant rouge", "u", 100, 0.07, 0.0);
		Element elem6 = new Element("M000E153", "Colorant rose", "u", 100, 0.08, 0.0);
		HappyCandies.ajouterStock(elem1);
		HappyCandies.ajouterStock(elem2);
		HappyCandies.ajouterStock(elem3);
		HappyCandies.ajouterStock(elem4);
		HappyCandies.ajouterStock(elem5);
		HappyCandies.ajouterStock(elem6);
		HappyCandies.ajouterStock(fraise);
		
	}

}
