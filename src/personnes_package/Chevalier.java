package personnes_package;

import Comportement_Arme.ComportementArme;
import Comportement_Arme.ComportementPoignard;

public class Chevalier extends Personnage{

//    @Override
//    public void combattre() {
//        System.out.println("Partie de l'algorithme qui ne change pas,,");
//        System.out.println("Chevalier va combattre...");
////        comportementArme.utiliserArme();
//    }

    public Chevalier(){
    /**I injected the behavior inside the Constructor of Chevalier class
     * By assigning the specific "Behavior implementation" class to the "Behavior Interface" that has a
     * relation with the Parent class "Personnage"*/
    //    comportementArme = new ComportementPoignard();
    }
}
