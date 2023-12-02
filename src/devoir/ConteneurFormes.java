package devoir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ConteneurFormes<T extends Forme> {
    private T[] tableau;

   
    public ConteneurFormes(T[] tableau) {
        this.tableau = tableau;
    }

  
    public void trierTableau() {
        Arrays.sort(tableau);
    }

    
    public void ajouterElement(T element) {
        tableau = Arrays.copyOf(tableau, tableau.length + 1);
        tableau[tableau.length - 1] = element;
    }

    
    public void supprimerElement(T element) {
        tableau = Arrays.stream(tableau)
                        .filter(e -> !e.equals(element))
                        .toArray(size -> Arrays.copyOf(tableau, size));
    }

   
    public int compterElements() {
        return tableau.length;
    }


    public void inverserOrdreTableau() {
        List<T> liste = Arrays.asList(tableau);
        Collections.reverse(liste);
        tableau = liste.toArray(tableau);
    }

    
    public void afficherElements() {
        for (T element : tableau) {
            System.out.println(element);
        }
    }

    
    public T obtenirElementMax() {
        return Arrays.stream(tableau)
                     .max(Comparator.naturalOrder())
                     .orElse(null);
    }

   
    public boolean estEgal(ConteneurFormes<?> autreConteneur) {
        return Arrays.equals(tableau, autreConteneur.tableau);
    }
}