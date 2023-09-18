/*
 *TPO Exercice 1 
 * JOUVENEAUX EMMA TDA
 *Septembre 2023
 */
package exo2;

/**
 *
 * @author emmaj
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
        int nb; //nombre d'entiers a additionner
        int result; // resultat
        int ind; //
        nb=5;
        result=0;
        
        //additionner des nb premiers entiers
        ind=1;
        while (ind <= nb) {
            result=result+ind;
        }
        //Affichage du resulat
        System.out.print();
        System.out.print("La somme des "+ nb);
        
    }
    
}
