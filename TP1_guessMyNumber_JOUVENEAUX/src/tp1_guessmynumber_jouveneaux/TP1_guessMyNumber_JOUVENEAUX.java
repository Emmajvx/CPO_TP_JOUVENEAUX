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
        int essai=1;
        int choix;
        int alea;
        
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        number = generateurAleat.nextInt(100);
        System.out.println("\n Veuillez seectionner un niveau de difficulte: \n 1) Facile, nombre illimite de tentatives \n 2) Moyen, 20 tentatives \n 3) Difficile, seulement 7 tentatives \n 4) Cauchemar");
        choix = sc.nextInt();
        System.out.println("\n Veuillez saisir un nombre entre 1 et 100:");
        test = sc.nextInt();
        
        if (choix==1){
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
            System.out.println("\n Vous avez reussi en "+(essai+1)+"! \n le nombre etait "+number);
        }
        
        if (choix==2){
            while (number!=test){
                essai=essai+1;
                if (number>test && essai<21){
                    System.out.println("\n Votre nombre est trop petit, veuillez essayer a nouveau:");
                    test = sc.nextInt();
                }
                if (number<test){
                    System.out.println("\n Votre nombre est trop grand, veuillez essayer a nouveau:");
                    test = sc.nextInt();
                }
                if (essai>20){
                    System.out.println("\n Perdu! Vous avez atteint le nombre maximum de tentatives");
                }
            }
            System.out.println("\n Vous avez reussi en "+(essai+1)+"! \n le nombre etait "+number);
        }
        if (choix==3){
            while (number!=test){
                essai=essai+1;
                if (number>test && essai<8){
                    System.out.println("\n Votre nombre est trop petit, veuillez essayer a nouveau:");
                    test = sc.nextInt();
                }
                if (number<test){
                    System.out.println("\n Votre nombre est trop grand, veuillez essayer a nouveau:");
                    test = sc.nextInt();
                }
                if (essai>7){
                    System.out.println("\n Perdu! Vous avez atteint le nombre maximum de tentatives");
                }
            }
            System.out.println("\n Vous avez reussi en "+(essai+1)+"! \n le nombre etait "+number);
        }
        if (choix==4){
            while (number!=test){
                essai=essai+1;
                if (number>test){
                    alea = generateurAleat.nextInt(3);
                    if (alea==1 || alea==2){
                     System.out.println("\n Votre nombre est trop grand, veuillez essayer a nouveau:");
                    test = sc.nextInt();    
                    }
                    if (alea==3){
                    System.out.println("\n Votre nombre est trop petit, veuillez essayer a nouveau:");
                    test = sc.nextInt();
                    }
                }
                if (number<test){
                    alea = generateurAleat.nextInt(3);
                    if (alea==3){
                     System.out.println("\n Votre nombre est trop grand, veuillez essayer a nouveau:");
                    test = sc.nextInt();    
                    }
                    if (alea==1 || alea==2){
                    System.out.println("\n Votre nombre est trop petit, veuillez essayer a nouveau:");
                    test = sc.nextInt();
                    }
                }
            }
            System.out.println("\n Vous avez reussi en "+(essai+1)+"! \n le nombre etait "+number);
        }
    }
    
}
