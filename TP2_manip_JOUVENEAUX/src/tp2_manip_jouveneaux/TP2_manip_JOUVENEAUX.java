/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_jouveneaux;

import java.util.Random;

/**
 *
 * @author emmaj
 */
public class TP2_manip_JOUVENEAUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        
        System.out.println("nb de calories de Assiette 1 : " + 
        assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + 
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + 
        assiette3.nbCalories) ;
        
        assiette2.nbCalories=assiette2.nbCalories+1;
        System.out.println("nb de calories de Assiette 2 : " + 
        assiette2.nbCalories) ;
        
        Tartiflette temp=assiette1;
        assiette1=assiette2;
        assiette2=temp;
        
        Moussaka[] tableauMoussaka=new Moussaka[10];
        for (int i=0;i<tableauMoussaka.length ;i++){
            tableauMoussaka[i]=new Moussaka(generateurAleat.nextInt(1000));
        }
    }
    
}
