/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;
import java.util.ArrayList;

/**
 *
 * @author emmaj
 */
public abstract class Arme {
    String nom;
    int niveau_attaque;
    
    public Arme(String Nom, int niveau) {
    nom=Nom;
    niveau_attaque=niveau;
     if (niveau_attaque>100){
    niveau_attaque=100;
    }
    }
    
    public String toString() {
    return "nom de l'arme"+ nom+" niveau de l'attaque"+niveau_attaque;
    }
    
    
    
    public int voirattaque(){
        System.out.println(niveau_attaque);
        return niveau_attaque;
    }
    
        
    }

