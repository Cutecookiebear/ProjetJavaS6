package application.usineBonbon;

import java.util.ArrayList;

public class Commande {
	
    private ArrayList<Panier> liste;

    public Commande() {
        liste = new ArrayList<>();
    }

    public void ajouterPanier(Panier p) {
        liste.add(p);
    }

    public void supprimerPanier(Panier p) {
        liste.remove(p);
    }

    public ArrayList<Panier> getListe() {
        return liste;
    }

    public int taille() {
        return liste.size();
    }

    public boolean estVide() {
        return liste.isEmpty();
    }
    
}
