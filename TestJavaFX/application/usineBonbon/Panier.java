package application.usineBonbon;

public class Panier {
	
	private Element element;
	private int qte;
	
	public Panier(Element element, int qte2) {
		this.element = element;
		this.qte = qte2;
	}
	
	public Element getElem() {
		return this.element;
	}
	
	public int getQte() {
		return this.qte;
	}

}
