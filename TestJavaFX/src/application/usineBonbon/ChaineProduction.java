package application.usineBonbon;

public class ChaineProduction {
	private String codeChaine;
	private String nom;
	private String entree;
	private String sortie;
	private int niveauA;
	
	public ChaineProduction(String codeChaine, String nom,String entree, String sortie,int niveauA) {
		this.setCodeChaine(codeChaine);
		this.entree=entree;
		this.niveauA=niveauA;
		this.setNom(nom);
		this.sortie=sortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeChaine() {
		return codeChaine;
	}

	public void setCodeChaine(String codeChaine) {
		this.codeChaine = codeChaine;
	}
	

}
