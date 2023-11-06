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
        System.out.println("Bienvenue dans Lightoff ! \nLights Off est un jeu de puzzle qui se joue sur une grille de lumieres. \nL'objectif du jeu est d'eteindre toutes les lumi?res de la grille. \nLes lumieres eteintes sont represent?es par un O et les lumieres allumee sont representees par un X \nA chaque tour vou spouvez activer une ligne, une colonne ou une diagonale, donc transformer les X en O et inversement jusqu'a ce que la grille soit entierement eteinte. \nMaintenant que vous connaissez les regles, amusez-vous bien et bonne chance !");
        System.out.println("\nVeuillez choisir votre niveau de difficulte : \n1) Facile \n2) Moyen \n3) Difficile \n4) Cascade \n5) perturbateur");
        int niveau = sc.nextInt();
        int max=0;
        
        if (niveau==1){
            nbLignes=4;
            nbColonnes=4;
            max= 100;
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
        
        if (niveau==1 || niveau==2 || niveau==3){
            grille= new GrilleDeJeu(nbLignes,nbColonnes);

            while (grille.cellulesToutesEteintes()==true){
                Random generateurAleat = new Random();
                int random = generateurAleat.nextInt(70);
                initialiserPartie(random+5);
            }
        
            System.out.println(grille);
        
            while (nbCoups<max && !grille.cellulesToutesEteintes()){
                
                System.out.println("\n que voulez vous faire ? \n 1) Activer une ligne \n 2) Activer une colonne \n 3) activer une diagonale \n ");
                int choix = sc.nextInt();
            
                if (choix==1){
                    System.out.println("Veuillez choisir le numero de la ligne a activer : ");
                    int choix2 = sc.nextInt();
                    grille.activerLigneDeCellules(choix2);
                    nbCoups++;
                }
                if (choix==2){
                    System.out.println("Veuillez choisir le numero de la colonne a activer : ");
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
                System.out.println(nbCoups);
        
            
            }
            
            
            if (nbCoups<max){
                System.out.println("Bravo ! Vous avez gagne en "+nbCoups+"coups");
            }
            else{
                System.out.println("Dommage! Vous avez depasse le nombre de coups maximum autorise");
            }
        }
        
    
        if (niveau==4){
            System.out.println("Vous avez choisi le mode cascade, vous avez maintenant 45 coups pour reussir les trois niveaux qui vont s'enchainer sur votre ecran. \nles niveaux vont du plus simple au plus difficile alors ... \nBonne chance !");
            grille= new GrilleDeJeu(4,4);
            while (grille.cellulesToutesEteintes()==true){
                Random generateurAleat = new Random();
                int random = generateurAleat.nextInt(70);
                initialiserPartie(random+5);
            }
            
            
            
                while (!grille.cellulesToutesEteintes() && nbCoups<46){
                    System.out.println(grille);
                    System.out.println("\n que voulez vous faire ? \n 1) Activer une ligne \n 2) Activer une colonne \n 3) activer une diagonale \n ");
                int choix = sc.nextInt();
            
                if (choix==1){
                    System.out.println("Veuillez choisir le num?ro de la ligne a activer : ");
                    int choix2 = sc.nextInt();
                    grille.activerLigneDeCellules(choix2);
                    nbCoups++;
                }
                if (choix==2){
                    System.out.println("Veuillez choisir le num?ro de la colonne a activer : ");
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
                
                }
                System.out.println("Bravo ! Vous avez termine le premier palier, attention, il ne vous reste plus que "+(45-nbCoups)+" coups");
                grille= new GrilleDeJeu(7,7);
                while (grille.cellulesToutesEteintes()==true){
                Random generateurAleat = new Random();
                int random = generateurAleat.nextInt(70);
                initialiserPartie(random+5);
                }
                
                
                while (!grille.cellulesToutesEteintes() && nbCoups<46){
                    System.out.println(grille);
                    System.out.println("\n que voulez vous faire ? \n 1) Activer une ligne \n 2) Activer une colonne \n 3) activer une diagonale \n ");
                int choix = sc.nextInt();
            
                if (choix==1){
                    System.out.println("Veuillez choisir le num?ro de la ligne a activer : ");
                    int choix2 = sc.nextInt();
                    grille.activerLigneDeCellules(choix2);
                    nbCoups++;
                }
                if (choix==2){
                    System.out.println("Veuillez choisir le num?ro de la colonne a activer : ");
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
                
                }
                System.out.println("Bravo ! Vous avez termine le deuxieme palier, attention, il ne vous reste plus que "+(45-nbCoups)+" coups");
                grille= new GrilleDeJeu(10,10);
                while (grille.cellulesToutesEteintes()==true){
                Random generateurAleat = new Random();
                int random = generateurAleat.nextInt(70);
                initialiserPartie(random+5);
                }
                
                while (!grille.cellulesToutesEteintes() && nbCoups<46){
                    
                    System.out.println(grille);
                    System.out.println("\n que voulez vous faire ? \n 1) Activer une ligne \n 2) Activer une colonne \n 3) activer une diagonale \n ");
                int choix = sc.nextInt();
            
                if (choix==1){
                    System.out.println("Veuillez choisir le num?ro de la ligne a activer : ");
                    int choix2 = sc.nextInt();
                    grille.activerLigneDeCellules(choix2);
                    nbCoups++;
                }
                if (choix==2){
                    System.out.println("Veuillez choisir le num?ro de la colonne a activer : ");
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
                
                }
                
            
            
            if (nbCoups<46){
                System.out.println("Bravo ! Vous avez gagne en "+nbCoups+" coups");
            }
            else{
                System.out.println("Dommage! Vous avez depasse le nombre de coups maximum autorises");
            }
        }
        
        if (niveau==5){
            System.out.println("Vous avez choisi le mode perturbateur, une envie de tenter votre chance ? \nDans ce mode vous jouez contre le hazard, car parfois au lieu du coup que vous avez decide de jouer, le perturbateur pourra jouer. \nA vous de vous adapter pour battre l'ordinateur !");
            System.out.println("Commencer par choisir la taille de votre grille de jeu :");
            int taille=sc.nextInt();
            max =2*taille;
            
            grille= new GrilleDeJeu(taille,taille);

            while (grille.cellulesToutesEteintes()==true){
                Random generateurAleat = new Random();
                int random = generateurAleat.nextInt(70);
                initialiserPartie(random+5);
            }
        
            System.out.println(grille);
        
            while (nbCoups<max && !grille.cellulesToutesEteintes()){
                Random generateurAleat = new Random();
                int random = generateurAleat.nextInt(5);
                if (random==0){
                    System.out.println("Ho non! Le perturbateur a vole votre tour ! \nRegardez bien votre nouvelle grille");
                    grille.activerLigneColonneOuDiagonaleAleatoire();
                    grille.activerLigneColonneOuDiagonaleAleatoire();
                }
                    
                else{
                
                
                    System.out.println("\n que voulez vous faire ? \n 1) Activer une ligne \n 2) Activer une colonne \n 3) activer une diagonale \n ");
                    int choix = sc.nextInt();
            
                    if (choix==1){
                        System.out.println("Veuillez choisir le numero de la ligne a activer : ");
                        int choix2 = sc.nextInt();
                        grille.activerLigneDeCellules(choix2);
                        nbCoups++;
                    }
                    if (choix==2){
                        System.out.println("Veuillez choisir le numero de la colonne a activer : ");
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
                }
                System.out.println(grille);
        
            
            
            
                
            }if (nbCoups<max){
                System.out.println("Bravo ! Vous avez gagne en "+nbCoups+"coups");
            }
            else{
                System.out.println("Dommage! Vous avez depasse le nombre de coups maximum autorise");
            }
        
        }
        
        
        
        
        
        
        }
    
    
    
    
    
    
    
    
    }    









