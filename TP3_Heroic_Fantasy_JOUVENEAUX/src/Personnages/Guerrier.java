/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author emmaj
 */
public class Guerrier extends Personnages{
    private boolean confirme;
    
    public Guerrier(String Nom, int niveau, String conf) {
        super(Nom, niveau);
        setconf(conf);
    }
    
    public void setconf(String confi){
        if (confi=="confirmé"){
            confirme=true;
        }
        else{
            confirme=false;
        }
    
}
}
