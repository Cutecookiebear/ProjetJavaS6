package application.usineBonbon;

import java.util.ArrayList;

public class ChaineProduction {
	private String codeChaine;
	private String nom;
	private ArrayList<Element> entree;
	private ArrayList<Element> sortie;
	private int niveauA;
	
	public ChaineProduction(String codeChaine, String nom,  ArrayList<Element> entree, ArrayList<Element> sortie) {
		this.codeChaine = codeChaine;
		this.nom = nom;
		this.niveauA=0;
		this.entree= entree;
		this.sortie= sortie;
	}

	public String getNom() {
		return nom;
	}

	public String getCodeChaine() {
		return codeChaine;
	}
	
	public int getNiveau() {
		return this.niveauA;
	}
	
	public String retournerEntree() {
		String r = "( ";
		for(Element e : this.entree) {
			r+=e.getNom()+"["+e.getQte()+e.getUnite()+"] ";
		}
		r+=")";
		return r;
	}
	
	public String retournerSortie() {
		String r = "( ";
		for(Element e : this.sortie) {
			r+=e.getNom()+"["+e.getQte()+e.getUnite()+"] ";
		}
		r+=")";
		return r;
	}

	public void setNiveau(int n) {
		this.niveauA = n;
	}
	//yo

}
