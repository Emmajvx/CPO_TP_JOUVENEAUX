/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author emmaj
 */

    public class Epee extends Arme{
        int finesse;

    
        
    public Epee(String Nom, int niveau, int fine ) {
        super(Nom, niveau);
        fine = finesse;
        if (finesse>100){
        finesse=100;
    }
        
                
     
    
    
    }
        
    }

    
    
