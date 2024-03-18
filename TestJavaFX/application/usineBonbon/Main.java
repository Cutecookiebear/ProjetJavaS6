package application.usineBonbon;

import java.util.ArrayList;

public class Main {
	
	public static void main(String args[]) {
		
		/*on commence avec une usine d'un patrimoine de 500 000 euros*/
		Usine HappyCandies = new Usine(500000);
		
		/*insertion d'éléments*/
		Element B0000001 = new Element("B0000001", "Fraise Tagada", "200g", 1, 0, 3.50);
		Element M0000001 = new Element("M0000001",	"Gélatine", "g", 100, 0.1, 0);
		Element M0000002 = new Element("M0000002",	"Sucre", "g", 75, 0.05, 0);
		Element M0000003 = new Element("M0000003", "Sirop de glucose", "g", 25, 0.2, 0);
		Element M0000005 = new Element("M0000005", "Arome fraise", "u", 1, 0.04, 0);
		Element M000E104 = new Element("M000E104",	"Colorant rouge", "u", 1, 0.07, 0);
		Element M000E153 = new Element("M000E153", "Colorant rose", "u", 1, 0.08, 0);
		HappyCandies.ajouterStock(M0000001);
		HappyCandies.ajouterStock(M0000002);
		HappyCandies.ajouterStock(M0000003);
		HappyCandies.ajouterStock(M0000005);
		HappyCandies.ajouterStock(M000E104);
		HappyCandies.ajouterStock(M000E153);
		HappyCandies.ajouterStock(B0000001);
		ArrayList<Element> list1 = new ArrayList<>();
		ArrayList<Element> list2 = new ArrayList<>();
		list1.add(M0000001);
		list1.add(M0000002);
		list1.add(M0000003);
		list1.add(M0000005);
		list1.add(M000E104);
		list1.add(M000E153);
		list2.add(B0000001);
		ChaineProduction chaine1 = new ChaineProduction("C001","Fraise Tagada", list1, list2);
		HappyCandies.ajouterChaine(chaine1);
		HappyCandies.afficherStock();
		HappyCandies.afficherChaines();
		
	}

}
