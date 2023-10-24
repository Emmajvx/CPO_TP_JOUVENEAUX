/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Baton;

/**
 *
 * @author emmaj
 */
public class Magicien extends Personnages{
    private boolean cheval;
    
    public Magicien(String Nom, int niveau, String cavalier) {
        super(Nom, niveau);
        setcheval(cavalier);
    }
    
    public void setcheval(String cavale){
        if (cavale=="à cheval"){
            cheval=true;
        }
        else{
            cheval=false;
        }
    
    }
    public void Armepredilection(){
        int a=0;
        for (int i=0; i<liste_arme.size(); i++){
            if (liste_arme.get(i) instanceof Baton){
                a += 1;
            }
    }
        System.out.println("Le magicien a "+a+" arme(s) de prédilection(s)");
        
    }
    
}
