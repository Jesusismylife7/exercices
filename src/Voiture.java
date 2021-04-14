public class Voiture {
    int count = 0; // variable d'instance
    String nom;
    static int count_static = 0; // variable de classe
    public final static Marque COMPANY = Marque.VOLVO;
    public Marque marque;

    public Voiture(String nom, Marque mar) {
        this.marque = mar;
        this.nom = nom;
        count_static++;
        System.out.println(count_static + " " + this.toString());
    }

    public String toString() {
        return COMPANY + " : " + nom;
    }

    public static int calculDistance() {
        return count_static * 15;
    }
}
