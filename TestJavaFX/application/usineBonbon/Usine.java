package application.usineBonbon;

import java.util.ArrayList;

public class Usine {
	
	private ArrayList<ChaineProduction> chainesProduction;
	private ArrayList<Element> stocks;
	private int porteMonnaie;
	
	public Usine(int solde) {
		this.porteMonnaie = solde;
		this.chainesProduction = new ArrayList<>();
		this.stocks = new ArrayList<>();
	}
	
	public void ajoutChaine(ChaineProduction chaine) {
		this.chainesProduction.add(chaine);
	}
	
	public void supprimerChaine(ChaineProduction chaine) {
		this.chainesProduction.remove(chaine);
	}
	
	public void ajoutStock(Element e) {
		this.stocks.add(e);
	}
	
	public void supprimerStock(Element e) {
		this.stocks.remove(e);
	}
	
	public int getPorteMonnaie() {
		return this.porteMonnaie;
	}

}
