package application.usineBonbon;

public class Panier {
	
	private Element element;
	private float qte;
	
	public Panier(Element element, float qte) {
		this.element = element;
		this.qte = qte;
	}
	
	public Element getElem() {
		return this.element;
	}
	
	public float getQte() {
		return this.qte;
	}

}
