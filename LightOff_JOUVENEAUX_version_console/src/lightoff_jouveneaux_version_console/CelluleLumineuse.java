/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_jouveneaux_version_console;

/**
 *cette classe permet de g?rer chaque cellule individuellement 
 * @author emmaj
 */
public class CelluleLumineuse {

private boolean etat;

    /**
     *initialise la cellule ? "eteinte"
     */
    public CelluleLumineuse() {
     etat = false;
    }
    
    /**
     *permet de changer la valeur de la cellule de ?teinte ? allum?e et inversement 
     */
    public void activerCellule(){
        if (etat==true){
            etat=false;
        }
        if (etat==false){
            etat=true;
        }
    }
    
    /**
     *permet d'etaindre chaque cellule, qu'elle soit allum?es ou deja ?teinte
     */
    public void  eteindreCellule(){
        etat=false;    
    }
    
    /**
     *permet de savoir si la cellule est etainte 
     * @return true si la cellule est etainte et false si elle est allum?e
     */
    public boolean  estEteint(){
        if (etat==false){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     *permet de connaitre l'etat de la cellule
     * @return true si la cellule est allum?e ou false si elle est ?teinte
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     *permet d'afficher la correspondance en grille de chaque cellule
     * @return X si elle est allum?e et O si elle est eteinte
     */
    @Override
    public String toString() {
        if (etat==true){
            return  "X";
        }
        else{
            return "O";
        }
       
    }
    
    
}
