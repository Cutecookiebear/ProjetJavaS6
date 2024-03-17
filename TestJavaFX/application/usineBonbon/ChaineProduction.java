package application.usineBonbon;

import java.util.ArrayList;

public class ChaineProduction {
	private String codeChaine;
	private String nom;
	private ArrayList<Element> entree;
	private ArrayList<Element> sortie;
	private int niveauA;
	
	public ChaineProduction(String codeChaine, String nom) {
		this.codeChaine = codeChaine;
		this.nom = nom;
		this.niveauA=0;
		this.entree= new ArrayList<>();
		this.sortie= new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public String getCodeChaine() {
		return codeChaine;
	}

	public void setNiveau(int n) {
		this.niveauA = n;
	}
	//yo

}
