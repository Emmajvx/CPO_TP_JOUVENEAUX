/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_jouveneaux_version_console;

/**
 *
 * @author emmaj
 */
public class LightOff_JOUVENEAUX_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CelluleLumineuse etat1 =new CelluleLumineuse();
        CelluleLumineuse etat2 =new CelluleLumineuse();
        
        etat1.activerCellule();
        System.out.println(etat2.getEtat());
        System.out.println(etat1.getEtat());
    }
    
}