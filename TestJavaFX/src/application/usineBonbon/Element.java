package src.application.usineBonbon;

public class Element {
	
	private String codeE;
	private String nom;
	private int quantite;
	private String unite;
	private float prixAchat;
	private float prixVente;
	
	public Element(String codeE, String nom, int quantite, String unite, float prixAchat,float prixVente) {
		this.codeE=codeE;
		this.nom=nom;
		this.prixAchat=prixAchat;
		this.prixVente=prixVente;
		this.quantite=quantite;
		this.unite=unite;
	}

}
