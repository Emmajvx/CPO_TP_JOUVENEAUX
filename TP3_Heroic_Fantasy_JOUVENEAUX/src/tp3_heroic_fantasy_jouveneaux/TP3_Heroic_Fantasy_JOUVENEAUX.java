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
    
    
        Magicien Houdini = new Magicien("Houdini",65,"confirmé");
        Guerrier Hercules = new Guerrier("Hercules",20,"à pied");
        Epee Sofia = new Epee("Sofia",50,5);
        Epee Jeanne = new Epee("Jeanne",80,10);
        Epee Brisinger = new Epee("YBrisinger",60,95);
        Baton Baguette = new Baton("Baguette",50,3);
        Baton Sureaux = new Baton("Sureaux",10,10);
        Baton fleche = new Baton("fleche",10,14);
        
        Hercules.ajout_arme(fleche);
        Hercules.ajout_arme(Sofia);
        Hercules.ajout_arme(Jeanne);
        Hercules.equiper_arme(Sureaux);
        Houdini.ajout_arme(Baguette);
        Houdini.ajout_arme(Sureaux);
        Houdini.ajout_arme(Brisinger);
        Houdini.equiper_arme(Brisinger);
        Houdini.Armepredilection();
        
    }
}
