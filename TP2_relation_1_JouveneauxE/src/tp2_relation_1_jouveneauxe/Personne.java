/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_jouveneauxe;

/**
 *
 * @author emmaj
 */
public class Personne {
    @Override
    public String toString() {
    String chaine;
    chaine= Nom+""+Prenom;
    return chaine;
    }
    String Nom;
    String Prenom;
    int nbVoitures=0 ;
    Voiture [] liste_voitures ;

    
    public Personne(String nom, String prenom) {
        Nom=nom;
        Prenom=prenom;
        liste_voitures = new Voiture [3] ;
    }
    
}
