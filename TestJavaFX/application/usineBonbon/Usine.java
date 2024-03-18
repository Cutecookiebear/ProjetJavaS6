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
	
	public void passerCommandeC(Commande commande) {
		for(Panier p : commande.liste) {
			Element e = p.getElem();
			int qteActuelle = e.getQte();
			int qteCommandee = p.getQte();
			int newQte = qteActuelle - qteCommandee;
			this.stocks.remove(e);
			e.setQte(newQte);
			this.stocks.add(e);
			this.porteMonnaie += qteCommandee*p.getElem().getPrixVente();
		}
	}

}
