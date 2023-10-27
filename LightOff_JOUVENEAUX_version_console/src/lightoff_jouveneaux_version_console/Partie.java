/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_jouveneaux_version_console;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author emmaj
 */
public class Partie {
    GrilleDeJeu grille;
    int nbCoups;
    int nbLignes;
    int nbColonnes;

    /**
     *c'est le constructeur, initialise "nbCoups" ? 0
     */
    public Partie() {
        nbCoups=0;
        
    }
    
    /**
     *permet de d?marrer la partie en melangeant la grille de depart un nombre d?fini de fois
     * @param nbTours
     */
    public void  initialiserPartie(int nbTours){
        grille.melangerMatriceAleatoirement(nbTours);
    }
    
    /**
     *c'est le code principal, met tout en commun pour g?rer la partie en foncton du niveau de difficult? choisi
     */
    public void  lancerPartie(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue dans Lightoff ! (rajouter la doc)");
        System.out.println("\n Veuillez choisir votre niveau de difficulte : \n 1) Facile \n 2) Moyen \n 3)difficile \n ");
        int niveau = sc.nextInt();
        int max=0;
        
        if (niveau==1){
            nbLignes=4;
            nbColonnes=4;
            max= 50;
        }   
        if (niveau==2){
            nbLignes=7;
            nbColonnes=7;
            max= 20;
        }
        if (niveau==3){
            nbLignes=10;
            nbColonnes=10;
            max= 15;
        }
                grille= new GrilleDeJeu(nbLignes,nbColonnes);

        while (grille.cellulesToutesEteintes()==true){
            Random generateurAleat = new Random();
            int random = generateurAleat.nextInt(70);
            initialiserPartie(random+5);
        }
        
        System.out.println(grille);
        
        while (!grille.cellulesToutesEteintes()){
            
            System.out.println("\n que voulez vous faire ? \n 1) Activer une ligne \n 2) Activer une colonne \n 3) activer une diagonale \n ");
            int choix = sc.nextInt();
            
            if (choix==1){
                System.out.println("Veuillez choixir le num?ro de la ligne a activer : ");
                int choix2 = sc.nextInt();
                grille.activerLigneDeCellules(choix2);
                nbCoups++;
            }
            if (choix==2){
                System.out.println("Veuillez choixir le num?ro de la colonne a activer : ");
                int choix2 = sc.nextInt();
                grille.activerColonneDeCellules(choix2);
                nbCoups++;
            }
            if (choix==3){
                System.out.println("veuillez choisir la diagonale que vous desirez : \n 1) Diagonale descendante \n 2) Diagonale montante");
                int choix2 = sc.nextInt();
                if (choix2==1){
                    grille.activerDiagonaleDescendante();
                }
                if (choix2==2){
                    grille.activerDiagonaleMontante();
                }
                nbCoups++;
            }
            
            System.out.println(grille);
        
            
        }
        if (max>0){
            System.out.println("Bravo ! Vous avez gagne en "+nbCoups+"coups");
        }
        else{
            System.out.println("Dommage! Vous avez depass? le nombre de coups maximum autoris?");
        }
    }
    
    
}
