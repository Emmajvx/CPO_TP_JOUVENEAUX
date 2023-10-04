/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_jouveneaux;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emmaj
 */
public class TP1_stats_JOUVENEAUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int[] tab = new int[6]; 
        double m;
        
        for (int i = 0; i < tab.length; i++){
            tab[i] =0;
        }
        System.out.println("\n Bonjour, veuillez saisir le nombre de lancers:");
        m = sc.nextInt();
        for (double j=0;j<m;j++){
            int nb= generateurAleat.nextInt(6);
            tab[nb]+= 1;
        }
        for (int k = 0; k < tab.length; k++) {
            if (k == 0) {
                // Premier élément, pas de point-virgule précédent
                System.out.print("["+((tab[k])/m*100)+"%");
            } 
            else {
                // Éléments suivants, ajoute un espace, un point-virgule et un espace avant l'élément
                System.out.print(" ; " + ((tab[k])/m*100)+"%");
            }       
        }

        System.out.print("]"); // Affiche le crochet fermant en fin de ligne

    }
    
}
