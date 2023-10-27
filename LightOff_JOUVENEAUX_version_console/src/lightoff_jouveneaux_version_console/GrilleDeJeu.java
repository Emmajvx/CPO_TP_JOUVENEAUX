/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_jouveneaux_version_console;

import java.util.Random;

/**
 *
 * @author emmaj
 */
public class GrilleDeJeu {
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;
    Random generateurAleat = new Random();

    /**
     *met en place et reserve les parametres
     * @param p_nbLignes
     * @param p_nbColonnes
     */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes=p_nbLignes;
        nbColonnes=p_nbColonnes;
        matriceCellules=new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i=0;i<nbColonnes;i++){
            for (int j=0; j<nbLignes;j++){
                matriceCellules[i][j]=new CelluleLumineuse();
            }
        }
    }
    
    /**
     *permet d'eteindre toutes les cellules 
     */
    public void eteindreToutesLesCellules (){
        for (int i=0;i<nbColonnes;i++){
            for (int j=0; j<nbLignes;j++){
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    
    /**
     *permet d'activer aleatoirement une ligne, une colonne ou une diagonale
     */
    public void activerLigneColonneOuDiagonaleAleatoire(){
        int nb = generateurAleat.nextInt(3);
        if (nb==0){
            int ligne=generateurAleat.nextInt(nbLignes);
            for (int i=0;i<nbColonnes;i++){
                matriceCellules[ligne][i].activerCellule();
            }
        }
        if (nb==1){
            int colonne=generateurAleat.nextInt(nbColonnes);
            for (int i=0;i<nbLignes;i++){
                matriceCellules[i][colonne].activerCellule();
            }
        }
        if (nb==2){
            int diag=generateurAleat.nextInt(2);
            if (diag==0){
               for (int i=0;i<nbLignes;i++){
                matriceCellules[i][i].activerCellule();
               } 
            }
            if (diag==1){
               for (int i=0;i<nbLignes;i++){
                    matriceCellules[i][nbLignes-i-1].activerCellule();
                } 
            }
        }
    }

    /**
     *permet de melanger la matrice aleatoirement, un nombre de fois defini 
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours){
        eteindreToutesLesCellules();
        for (int i=0; i<nbTours;i++){
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    /**
     *permet d'activer une ligne donnee
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne){
            for (int i=0;i<nbColonnes;i++){
                matriceCellules[idLigne][i].activerCellule();
            }
    }

    /**
     *permet d'activer une colonne aleatoirement 
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne){
            for (int i=0;i<nbLignes;i++){
                matriceCellules[i][idColonne].activerCellule();
            }
    }
    
    /**
     *permet d'activer la diagonale descendante 
     */
    public void activerDiagonaleDescendante(){
        for (int i=0;i<nbLignes;i++){
                matriceCellules[i][i].activerCellule();
        } 
    }
    
    /**
     *permet d'activer la diagonale montante
     */
    public void activerDiagonaleMontante(){
        for (int i=0;i<nbLignes;i++){
                    matriceCellules[i][nbLignes-i-1].activerCellule();
        } 
    }

    /**
     *permet de verifier que toutes les cellules sont eteintes
     * @return false si elles ne sont pas toutes eteintes et true si elles sont bien eteintes
     */
    public boolean cellulesToutesEteintes(){
        for (int i =0; i<nbLignes;i++){
            for (int j=0;j<nbColonnes;j++){
                boolean verif = matriceCellules[i][j].estEteint();
                if (verif==false){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     *permet de modeliser la grille de jeu
     * @return al grille de jeu avec des X et des O en fonction de si la cellules est allum?e ou eteinte
     */
    @Override
    public String toString() {
        String chaine = "   |";
        for (int i=0;i<nbLignes;i++){
                chaine+= " "+i+" |";
        }
        
        chaine += "\n";
        
        for (int i=0;i<nbLignes+1;i++){
            chaine+= "----";
        }
        
        chaine += "\n";
            
        for (int j=0;j<nbLignes;j++){
            chaine+= " "+j+" |";
            for (int k=0;k<nbColonnes;k++){
                chaine+=" "+matriceCellules[j][k].toString()+" |";
            }
            chaine += "\n";
            for (int i=0;i<nbLignes+1;i++){
            chaine+= "----";
            }
            chaine += "\n";
        }
        
        return chaine;
    }
    
}
    
    
    
    


