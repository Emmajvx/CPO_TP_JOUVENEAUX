/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_jouveneaux_version_console;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author emmaj
 */
public class CelluleGraphique extends JButton{
    int largeur; // largeur en pixel de la cellule
    int hauteur; // hauteur en pixel de la cellule
    CelluleLumineuse celluleLumineuseAssociee; 
    // constructeur (appel? depuis FenetrePrincipale)
    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur, 
    int hauteur) {
    this.largeur = largeur;
    this.hauteur = hauteur;
    this.celluleLumineuseAssociee = celluleLumineuseAssociee;
    }
    // Methode g?rant le dessin de la cellule 
    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g); 
    this.setText(celluleLumineuseAssociee.toString());
    }
    
}
