package application.usineBonbon;

import java.util.ArrayList;

public abstract class Commande {
	
    protected ArrayList<Element> liste;

    public Commande() {
        liste = new ArrayList<>();
    }

    public void ajouterPanier(Element e) {
        liste.add(e);
    }

    public void supprimerPanier(Element e) {
        liste.remove(e);
    }

    public ArrayList<Element> getListe() {
        return liste;
    }

    public int taille() {
        return liste.size();
    }

    public boolean estVide() {
        return liste.isEmpty();
    }
    

}
