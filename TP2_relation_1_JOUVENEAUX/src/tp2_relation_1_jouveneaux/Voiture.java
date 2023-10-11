/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_jouveneaux;

/**
 *
 * @author emmaj
 */
public class Voiture {
    String Modele;
    String Marque;
    int Puissance;
    Personne Proprietaire ;

    @Override
    public String toString() {
    return "nb de conversions"+ nbConversions;
    }

    public Voiture(String modele, String marque,int puissance) {
        Modele=modele;
        Marque=marque;
        Puissance=puissance;
        Proprietaire=null;
        
    }
    
    
}
