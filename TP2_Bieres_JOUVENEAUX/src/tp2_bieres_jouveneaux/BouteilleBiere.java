/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_jouveneaux;

/**
 *
 * @author emmaj
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +
        " degres) \nBrasserie : " + brasserie +ouverte) ;
    }
    
    
    public BouteilleBiere(String unNom, double unDegre, String 
    uneBrasserie, boolean ouvert) {
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
    }
    public void Decapsuler() {
        if (ouverte==true){
           System.out.println("erreur : biere \n"+ nom+"déjà ouverte") ; 
        }
        if (ouverte==false){
           ouverte=true; 
        }
    }
    
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = (nom + " (" + degreAlcool + " degrés) ouverte?" ); 
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
}

}
