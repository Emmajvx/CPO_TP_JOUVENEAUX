/*
 *TPO Exercice 1 
 * JOUVENEAUX EMMA TDA
 *Septembre 2023
 */
package exo1;

import java.util.Scanner;

/**
 *
 * @author emmaj
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour");
        int i = 20;
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        System.out.print("Au revoir " + prenom);
        
    }
    
}

