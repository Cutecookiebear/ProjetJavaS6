package src.application.usineBonbon;

import java.util.ArrayList;

public class Commande<T> {
	
    private ArrayList<T> liste;

    public Commande() {
        liste = new ArrayList<>();
    }

    public void ajouterElement(T element) {
        liste.add(element);
    }

    public void supprimerElement(T element) {
        liste.remove(element);
    }

    public ArrayList<T> getListe() {
        return liste;
    }

    public int taille() {
        return liste.size();
    }

    public boolean estVide() {
        return liste.isEmpty();
    }
}
