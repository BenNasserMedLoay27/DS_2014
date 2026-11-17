package ds_2014;

public class Attraction {
    private String nom;
    private double cout;
    private ConditionAge conditionAge;
    private int nbPersonnes;
    private double recette;


    public Attraction(String nom, double cout, ConditionAge conditionAge) {
        this.nom = nom;
        this.cout = cout;
        this.conditionAge = conditionAge;
        this.nbPersonnes = 0;
        this.recette = 0.0;
    }


    public void affiche() {
        System.out.println("Attraction : " + this.nom + " , Coût : " + this.cout + " DT , Personnes : " + this.nbPersonnes + " et Recette : " + this.recette + " DT");
    }


    public double getRecette() {
        return this.recette;
    }

    public String getNom() {
        return this.nom;
    }

    public ConditionAge getConditionAge() {
        return this.conditionAge;
    }
    
    
    public void utilise(Personne p) {
        if (conditionAge != null && !conditionAge.accesPossible(p)) {
            System.out.println("Accès refusé pour " + p.getNom() + " à l'attraction " + nom);
        }
        else{
        	this.nbPersonnes++;
        	this.recette += this.cout;
            System.out.println("Accès valide pour " + p.getNom() + " à l'attraction " + nom);
        }
    }
}
