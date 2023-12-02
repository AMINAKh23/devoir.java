package devoir;

import devoir.Forme;

class Forme implements Cloneable{ 
    String couleur;
    public Forme(String couleur) {
        this.couleur = couleur;
    }
    @Override
    public String toString() {
        return "Forme [couleur=" + couleur + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Forme autreForme = (Forme) obj;
        return couleur.equals(autreForme.couleur);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
		
}
