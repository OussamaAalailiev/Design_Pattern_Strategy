package personnes_package;

import Comportement_Arme.ComportementArme;

public abstract class Personnage {
    protected ComportementArme comportementArme;
    /**combattre() -->method */
    public void combattre(){
        System.out.println("Standard code in all behaviors.. ");
        comportementArme.utiliserArme();
        System.out.println("---------");
    }
    /**Dependency Injection */
    public void SetComportementArme(ComportementArme arme){
        this.comportementArme=arme;
//        this.comportementArme.utiliserArme();
    }

    public void applyStrategy(){
        comportementArme.utiliserArme();
    }

}
