/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author emmaj
 */
public abstract class Personnages {
    ArrayList<Arme> liste_arme=new ArrayList<Arme>();
    String nom;
    int niveau_vie;
    Arme arme_en_main=null;
    static int nb_perso=0;
    
    public Personnages(String Nom, int niveau) {
    nom=Nom;
    niveau_vie=niveau;
    arme_en_main=null;
    nb_perso++;
    
    }
    public int voir_nb_perso(){
        System.out.println(nb_perso);
        return nb_perso;
    }
    
    public int voirvie(){
        System.out.println(niveau_vie);
        return niveau_vie;
    }
    @Override
    public String toString() {
    return "nom du personnage "+ nom+" niveau de vie "+niveau_vie+ "caracteristiques de l'arme " + arme_en_main;
    }
    
    public String voirnom(){
        System.out.println(nom);
        return nom;
    }

    public Arme getArmeEquipee() {
        return arme_en_main;
    }
    
    
    public void ajout_arme(Arme ajouter){
        if(liste_arme.size()<5){
            liste_arme.add(ajouter);
        }
        else System.out.println("Vous possédez deja 5 armes");
        
    }
    
    
    public void equiper_arme (Arme arme){
    int valide = 0;   
        for (int i=0;i<liste_arme.size();i++){
            
            if (liste_arme.get(i) == arme){
                System.out.println("Vous etes maintenant équipé avec : "+arme);
                arme_en_main = liste_arme.get(i);
                valide = 1;
                break;                
            }
            
        }
        if (valide==0){
       System.out.println("Vous ne possedez pas cette arme"); 
        }
    }
    
    
     
    
    
}
