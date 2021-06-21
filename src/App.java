import Comportement_Arme.ComportementArcEtFleches;
import Comportement_Arme.ComportementArme;
import Comportement_Arme.ComportementHache;
import personnes_package.*;
//Comportement_Arme.ComportementHache / Comportement_Arme.arme.ComportementHache
// Comportement_Arme.comportementArme.ComportementHache
import java.util.Scanner;

public class App {
    /** Pattern Strategy 1st Example */
    public static void main(String[] args) {
        Personnage troll = new Troll();
        /**I let the user choose which behavior he/she want to print*/
        Scanner clavier = new Scanner(System.in);
        while (true){
            System.out.println("Nom du Comportement: ");
            //I write name_Of_Packege.nameOfBehaviorClass or just the class name if the package does not exist
            String nomComportement =clavier.next();
            if (nomComportement.equals("quit"))
                break;
            try {
                Class ClassExtractedAndStord = Class.forName(nomComportement);
                ComportementArme Arm_Behavior = (ComportementArme) ClassExtractedAndStord.newInstance();
                troll.SetComportementArme(Arm_Behavior);
//                troll.applyStrategy();
                troll.combattre();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        System.out.println("*****************");
        troll.applyStrategy();
//        System.out.println("Arm N°1: ");
        /**I changed the behavior multiple times for "chevalier" dynamically*/
//        chevalier.SetComportementArme(new ComportementPoignard());
//        chevalier.combattre();
//        chevalier.SetComportementArme(new ComportementArcEtFleches());
//        chevalier.combattre();

//        chevalier.combattre();
//        chevalier.applyStrategy();
//        System.out.println("*New Arm_behavior *************");
//        chevalier.SetComportementArme(new ComportementHache());
//        chevalier.applyStrategy();
//
//        System.out.println("-----------------------");
//
//        System.out.println("Arm N°2: ");
//        Roi roi = new Roi();
//        roi.SetComportementArme(new ComportementHache());
//        roi.combattre();
//
//        System.out.println("------------------------");
//
//        System.out.println("Arm N°3 ::");
//        Reine reine = new Reine();
//        reine.SetComportementArme(new ComportementArcEtFleches());
//        reine.combattre();



    }
}
