package devoir;

import devoir.Cercle;
import devoir.Forme;

class Cercle extends Forme implements Cloneable {
    double rayon;

    
    public Cercle(String couleur, double rayon) {
        super(couleur);
        this.rayon = rayon;
    }

    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Cercle autreCercle = (Cercle) obj;
        return Double.compare(autreCercle.rayon, rayon) == 0;
    }
    @Override
    public String toString() {
        return "Cercle [couleur=" + couleur + ", rayon=" + rayon + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
