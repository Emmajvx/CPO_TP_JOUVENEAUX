/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_jouveneaux;

/**
 *
 * @author emmaj
 */
public class TP2_Bieres_JOUVENEAUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 
        7.0 ,"Dubuisson",true) ;
        uneBiere.lireEtiquette();
        System.out.println(uneBiere) ;

        
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", 
        6.6 ,"Abbaye de Leffe", false) ;
        secondeBiere.Decapsuler();
        secondeBiere.lireEtiquette();
        
        BouteilleBiere troisBiere = new BouteilleBiere("goudale", 
        6.0 ,"Abbaye de goudale",true) ;
        troisBiere.lireEtiquette();
        
        BouteilleBiere quatreBiere = new BouteilleBiere("La chouffe", 
        6.8 ,"Abbaye de Chouffe",false) ;
        quatreBiere.Decapsuler();
        quatreBiere.lireEtiquette();
        
        BouteilleBiere cinqBiere = new BouteilleBiere("Leffe", 
        6.6 ,"Abbaye de Leffe",true) ;
        cinqBiere.lireEtiquette();
        
        quatreBiere.Decapsuler();
        
        

    }
    
}
