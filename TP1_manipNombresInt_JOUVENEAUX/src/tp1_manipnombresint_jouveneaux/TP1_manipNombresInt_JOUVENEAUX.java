/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_jouveneaux;

import java.util.Scanner;

/**
 *
 * @author emmaj
 */
public class TP1_manipNombresInt_JOUVENEAUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nb1;
        double nb2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Veuillez entrer un premier nombre");
        nb1=sc.nextInt();
        System.out.println("\n Veuillez entrer un second nombre");
        nb2=sc.nextInt();
        System.out.println("\n voici vos nombre:\n"+ nb1+"\n"+nb2);
        System.out.println("\n voici dans l'ordre la somme, la difference, le produit, le quotient et le reste de la division euclidienne de vos deux nombres: ");
        System.out.println("\n"+(nb1+nb2)+"\n"+(nb1-nb2)+"\n"+(nb1*nb2)+"\n"+(nb1/nb2)+"\n"+(nb1%nb2));
    }
    
}
