package ds_2014;

public class Main {
    public static void main(String[] args) {
        ParcAttraction parc = new ParcAttraction("Dismoitout Land", 5);

        ConditionAge condition1 = new ConditionAge(10);
        ConditionAge condition2 = new ConditionAge(15);

        Attraction a1 = new Attraction("Montagnes Russes", 15.0, condition2);
        Attraction a2 = new Attraction("Carrousel", 5.0, condition1);

        parc.ajouteAttraction(a1);
        parc.ajouteAttraction(a2);

        Personne p1 = new Personne(18, 175, "Ali");
        Personne p2 = new Personne(8, 130, "Ines");

        try {
            a1.utilise(p1);
            System.out.println(p1.getNom() + " a utilisé " + a1.getNom());
        } catch (AccesInterditException e) {
            System.out.println(e.getMessage());
        }

        try {
            a1.utilise(p2);
            System.out.println(p2.getNom() + " a utilisé " + a1.getNom());
        } catch (AccesInterditException e) {
            System.out.println(e.getMessage());
        }

        try {
            a2.utilise(p2);
            System.out.println(p2.getNom() + " a utilisé " + a2.getNom());
        } catch (AccesInterditException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        parc.affiche();
    }
}
