/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_jouveneaux;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emmaj
 */
public class TP1_guessMyNumber_JOUVENEAUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int test=0;
        int number=1000;
        int essai=0;
        
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        number = generateurAleat.nextInt(100);
        System.out.println("\n Veuillez saisir un nombre entre 1 et 100:");
        test = sc.nextInt();
        while (number!=test){
            essai=essai+1;
            if (number>test){
                System.out.println("\n Votre nombre est trop petit, veuillez essayer a nouveau:");
                test = sc.nextInt();
            }
            if (number<test){
                System.out.println("\n Votre nombre est trop grand, veuillez essayer a nouveau:");
                test = sc.nextInt();
            }
        }
        System.out.println("\n Vous avez reussi en "+essai+"! \n le nombre etait "+number);

    }
    
}
