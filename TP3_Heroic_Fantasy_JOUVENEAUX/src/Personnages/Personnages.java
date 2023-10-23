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
    ArrayList<Arme> liste=new ArrayList<Arme>();
    String nom;
    int niveau_vie;
    Arme arme_en_main;
    
    public Personnages(String Nom, int niveau) {
    nom=Nom;
    niveau_vie=niveau;
    arme_en_main=null;
    
    }
    
    public int voirvie(){
        System.out.println(niveau_vie);
        return niveau_vie;
    }
    
    public String toString() {
    return "nom du personnage"+ nom+" niveau de vie"+niveau_vie;
    }
    
    public String voirnom(){
        System.out.println(nom);
        return nom;
    }

    public Arme getAjouter() {
        return ajouter;
    }
    
    
    public void ajouterarme(Arme ajouter){
        if(liste.size()<5){
            liste.add(ajouter);
        }
        else System.out.println("Vous possédez deja 5 armes");
        
    }
    
    
}
