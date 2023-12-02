package devoir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListeFormes {
    private List<Forme> listeFormes;

    public ListeFormes() {
        this.listeFormes = new ArrayList<>();
    }

    public void ajouterForme(Forme forme) {
        listeFormes.add(forme);
    }

    public void afficherListe() {
        for (Forme forme : listeFormes) {
            System.out.println(forme);
        }
    }

    public void parcourirListe() {
        Iterator<Forme> iterator = listeFormes.iterator();
        while (iterator.hasNext()) {
            Forme forme = iterator.next();
            System.out.println(forme);
        }
    }

    public void insererElement(int position, Forme forme) {
        listeFormes.add(position, forme);
    }

    public Forme recupererElement(int position) {
        return listeFormes.get(position);
    }

    public void supprimerElement(Forme forme) {
        listeFormes.remove(forme);
    }

    public boolean rechercherElement(Forme forme) {
        return listeFormes.contains(forme);
    }

    public void trierListe() {
        Collections.sort(listeFormes);
    }

    public List<Forme> copierListe() {
        return new ArrayList<>(listeFormes);
    }

    public void melangerListe() {
        Collections.shuffle(listeFormes);
    }

    public void inverserListe() {
        Collections.reverse(listeFormes);
    }

    public List<Forme> extrairePartie(int debut, int fin) {
        return new ArrayList<>(listeFormes.subList(debut, fin));
    }

    public boolean comparerListes(List<Forme> autreListe) {
        return listeFormes.equals(autreListe);
    }

    public void echangerElements(int indice1, int indice2) {
        Collections.swap(listeFormes, indice1, indice2);
    }

    public void viderListe() {
        listeFormes.clear();
    }

    public boolean estVide() {
        return listeFormes.isEmpty();
    }
}
