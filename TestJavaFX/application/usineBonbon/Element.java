package application.usineBonbon;

public class Element {
	
	private String codeE;
	private String nom;
	private int quantite;
	private String unite;
	private float prixAchat;
	private float prixVente;
	
	public Element(String codeE, String nom, String unite, float prixAchat,float prixVente) {
		this.codeE=codeE;
		this.nom=nom;
		this.prixAchat=prixAchat;
		this.prixVente=prixVente;
		this.quantite=0;
		this.unite=unite;
	}
	
	public Element(String codeE, String nom, String unite, int qte, float prixAchat,float prixVente) {
		this.codeE=codeE;
		this.nom=nom;
		this.prixAchat=prixAchat;
		this.prixVente=prixVente;
		this.quantite=qte;
		this.unite=unite;
	}
	
	public String getCodeE() {
		return this.codeE;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getUnite() {
		return this.unite;
	}
	
	public int getQte() {
		return this.quantite;
	}
	
	public void setQte(int qte) {
		this.quantite = qte;
	}

	public float getPrixVente() {
		return this.prixVente;
	}
	
	public float getPrixAchat() {
		return this.prixAchat;
	}
	

}
