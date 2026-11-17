package ds_2014;

public class ParcAttraction {
    private Attraction[] lesAttractions;
    private String nom;
    private int nb_attraction;
    private int taille;


    public ParcAttraction(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
        this.lesAttractions = new Attraction[taille];
        this.nb_attraction = 0;
    }


    public void ajouteAttraction(Attraction att) {
        if (nb_attraction < taille) {
            lesAttractions[nb_attraction] = att;
            nb_attraction++;
        } else {
            System.out.println("Impossible d'ajouter l'attraction, le parc est plein !");
        }
    }


    public float getRecette() {
        float total = 0;
        for (int i = 0; i < nb_attraction; i++) {
            total += lesAttractions[i].getRecette();
        }
        return total;
    }


    public void affiche () {
    	System.out.println("Le nom de parc : "+this.nom);
    	for(int i=0 ; i < this.nb_attraction ; i++) {
    		lesAttractions[i].affiche();
    		System.out.println("Recette : " +getRecette());
    	}
    	
    }
    
    
}


