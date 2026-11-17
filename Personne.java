package ds_2014;

public class Personne {
    private int age;
    private int taille;
    private String nom;


    public Personne(int age, int taille, String nom) {
        this.age = age;
        this.taille = taille;
        this.nom = nom;
    }
    
    public interface ConditionAcces{
    	public boolean accesPossible(Personne p);
    }

    public int getAge() {
        return this.age;
    }

    public int getTaille() {
        return this.taille;
    }

    public String getNom() {
        return this.nom;
    }
}
