package application.usineBonbon;

import java.util.ArrayList;

public class Usine {
	
	private ArrayList<ChaineProduction> chainesProduction;
	private ArrayList<Element> stocks;
	private ArrayList<CommandeFournisseur> commandesF;
	private ArrayList<CommandeClient> commandesC;
	private int porteMonnaie;
	
	public Usine(int solde) {
		this.porteMonnaie = solde;
		this.chainesProduction = new ArrayList<>();
		this.stocks = new ArrayList<>();
		this.commandesF = new ArrayList<>();
		this.commandesC = new ArrayList<>();
		
	}
	
	public void ajouterChaine(ChaineProduction chaine) {
		this.chainesProduction.add(chaine);
	}
	
	public void supprimerChaine(ChaineProduction chaine) {
		this.chainesProduction.remove(chaine);
	}
	
	public void ajouterStock(Element e) {
		this.stocks.add(e);
	}
	
	public void supprimerStock(Element e) {
		this.stocks.remove(e);
	}
	
	public void supprimmerCommandeF(CommandeFournisseur commande) {
		this.commandesF.remove(commande);
	}
	
	public void supprimmerCommandeC(CommandeClient commande) {
		this.commandesC.remove(commande);
	}
	
	public int getPorteMonnaie() {
		return this.porteMonnaie;
	}
	
	public void changerNiveauA(ChaineProduction chaine, int niveau) {
		this.chainesProduction.remove(chaine);
		chaine.setNiveau(niveau);
		this.chainesProduction.add(chaine);
	}
	
	public void passerCommandeC(CommandeClient commande) {
		for(Element e1 : commande.liste) {
			int qteCommandee = e1.getQte();
			String codeElemC = e1.getCodeE();
			for(Element e2 : this.stocks) {
				if(e2.getCodeE()==codeElemC) {
					int qteActuelle = e2.getQte();
					int qteFinale = qteActuelle - qteCommandee;
					stocks.add(new Element(e2.getCodeE(), e2.getNom(), e2.getUnite(), qteFinale, e2.getPrixAchat(), e2.getPrixVente()));
					stocks.remove(e2);
					break;
				}
			}
			this.porteMonnaie += (qteCommandee*e1.getPrixVente());
		}
		this.commandesC.add(commande);
	}
	
	public void passerCommandeF(CommandeFournisseur commande) {
		for(Element e1 : commande.liste) {
			int qteCommandee = e1.getQte();
			String codeElemC = e1.getCodeE();
			for(Element e2 : this.stocks) {
				if(e2.getCodeE()==codeElemC) {
					int qteActuelle = e2.getQte();
					int qteFinale = qteActuelle + qteCommandee;
					stocks.add(new Element(e2.getCodeE(), e2.getNom(), e2.getUnite(), qteFinale, e2.getPrixAchat(), e2.getPrixVente()));
					stocks.remove(e2);
					break;
				}
			}
			
			this.porteMonnaie -= (qteCommandee*e1.getPrixVente());
		}
		this.commandesF.add(commande);
	}
	
	public void afficherStock() {
		System.out.println("STOCK DE L'USINE : \n");
		for(Element e : this.stocks) {
			System.out.println("code : "+e.getCodeE());
			System.out.println("nom : "+e.getNom());
			System.out.println("quantite en stock : "+e.getQte());
			System.out.println("unite : "+e.getUnite());
			System.out.println("prix d'achat : "+e.getPrixAchat());
			System.out.println("prix de vente : "+e.getPrixVente());
			System.out.println();
		}
	}
	
	public void afficherChaines() {
		System.out.println("CHAINES DE PRODUCTION DE L'USINE : \n");
		for(ChaineProduction c : this.chainesProduction) {
			System.out.println("code : "+c.getCodeChaine());
			System.out.println("nom : "+c.getNom());
			System.out.println("entrée : "+c.retournerEntree());
			System.out.println("entrée : "+c.retournerSortie());
			System.out.println("niveau d'activation : "+c.getNiveau());
		}
	}
	
	

}
