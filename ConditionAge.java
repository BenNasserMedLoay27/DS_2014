package ds_2014;

import ds_2014.Personne.ConditionAcces;

public class ConditionAge implements ConditionAcces {
    private int ageMin;

    public ConditionAge(int ageMin) {
        this.ageMin = ageMin;
    }

    public boolean accesPossible(Personne p) {
        return p.getAge() > this.ageMin;
    }
}
