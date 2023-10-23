/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

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
}
