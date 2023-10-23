/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_jouveneaux;

import Personnages.Personnages;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author emmaj
 */
public class TP3_Heroic_Fantasy_JOUVENEAUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee epee1 = new Epee("Excalibur",7,5) ;
        Epee epee2 = new Epee("Durandal",4,7) ;
        Baton baton1 = new Baton("Chene",4,5) ;
        Baton baton2 = new Baton("Charme",5,6) ;
        
        ArrayList<Arme> liste=new ArrayList<Arme>();
        liste.add(epee2);
        liste.add(epee1);
        liste.add(baton1);
        liste.add(baton2);
        
        System.out.println("Taille de la liste de chaque arme : "+liste.size());
        for (Arme arme :liste){
            System.out.println(arme);
        }
        
        Magicien mage1 = new Magicien("Gandalf",65,"confirmé") ;
        Magicien mage2 = new Magicien("Garcimore",44,"novice") ;
        Guerrier guerrier1 = new Guerrier("Conan",78,"à pied") ;
        Guerrier guerrier2 = new Guerrier("Lannister",45,"à cheval") ;
        
        ArrayList<Personnages> liste2=new ArrayList<Personnages>();
        liste2.add(mage1);
        liste2.add(mage2);
        liste2.add(guerrier1);
        liste2.add(guerrier2);
        
        System.out.println("caractéristiques de chaque personnage "+liste2.size());
        for (Personnages perso :liste2){
            System.out.println(perso);
        }
    }
    
    
}
