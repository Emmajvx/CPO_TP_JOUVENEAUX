/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_jouveneaux;

import java.util.Random;

/**
 *
 * @author emmaj
 */
public class TP1_guessMyNumber_JOUVENEAUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int nb1 = generateurAleat.nextInt(100);
        int nb2 = generateurAleat.nextInt(100);
        int nb3 = generateurAleat.nextInt(100);
        int nb4 = generateurAleat.nextInt(100);
        int nb5 = generateurAleat.nextInt(100);
        int number = generateurAleat.nextInt(100);
        System.out.println("\n Veuillez saisir un nombre entre 1 et 100:");

    }
    
}
