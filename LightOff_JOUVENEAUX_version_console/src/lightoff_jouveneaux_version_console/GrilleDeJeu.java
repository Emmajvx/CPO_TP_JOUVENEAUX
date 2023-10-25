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
    
    public void eteindreToutesLesCellules (){
        for (int i=0;i<nbColonnes;i++){
            for (int j=0; j<nbLignes;j++){
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    
    public void activerLigneColonneOuDiagonaleAleatoire(){
        int nb = generateurAleat.nextInt(2);
        if (nb==1){
            int ligne=generateurAleat.nextInt(nbLignes);
            for (int i=0;i<nbColonnes;i++){
                matriceCellules[ligne][i].activerCellule();
            }
        }
        if (nb==2){
            int colonne=generateurAleat.nextInt(nbColonnes);
            for (int i=0;i<nbLignes;i++){
                matriceCellules[i][colonne].activerCellule();
            }
        }
    }
    
    
    
}
