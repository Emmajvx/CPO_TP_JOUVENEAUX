/*
 *TPO Exercice 1 
 * JOUVENEAUX EMMA TDA
 *Septembre 2023
 */
package exo2;

import java.util.Scanner;

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
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); // On demande a sc de donner le prochain entier
        result=0;
        
        //additionner des nb premiers entiers
        ind=1;
        while (ind <= nb) {
            result=result+ind;
            ind=ind+1;
        }
        //Affichage du resulat
        System.out.println();
        System.out.println("La somme des entiers est: " +result);
        
    }
    
}
