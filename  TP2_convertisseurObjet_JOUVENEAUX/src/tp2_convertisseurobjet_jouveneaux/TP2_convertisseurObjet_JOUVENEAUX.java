/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_jouveneaux;

import java.util.Scanner;

/**
 *
 * @author emmaj
 */
public class TP2_convertisseurObjet_JOUVENEAUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur convertisseur = new Convertisseur();
        
        double temp;
        int choix;
        String unite1="Celcius";
        double tempfin=0;
        String unite2="Celcius";
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Bonjour, saisissez une valeur :");
        temp = sc.nextDouble();
        System.out.println("\nSaisissez la conversion que vous souhaiter effectuer :\n 1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius \n 3) De Farenheit vers Celcius \n 4) De Celcius vers Farenheit \n 5) De Kelvin vers Farenheit \n 6) De Farenheit vers Kelvin");
        choix = sc.nextInt();
        if (choix==1){ 
            tempfin=convertisseur.CelciusVersKelvin(temp);
            unite1="Celcius";
            unite2="Kelvin";
        }
        if (choix==2){ 
            tempfin=convertisseur.KelvinVersCelcius(temp);
            unite1="Kelvin";
            unite2="Celcius";
        }
        if (choix==3){ 
            tempfin=convertisseur.FarenheitVersCelcius(temp);
            unite1="Farenheit";
            unite2="Celcius";
        }
        if (choix==4){ 
            tempfin=convertisseur.CelciusVersFarenheit(temp);
            unite1="Celcius";
            unite2="Farenheit";
        }
        if (choix==5){ 
            tempfin=convertisseur.KelvinVersFarenheit(temp);
            unite1="Kelvin";
            unite2="Farenheit";
        }
        if (choix==6){ 
            tempfin=convertisseur.FarenheitVersKelvin(temp);
            unite1="Farenheit";
            unite2="Kelvin";
        }
        System.out.println("\n"+temp+ " degre "+unite1+" est egal a "+tempfin+" degre "+unite2);
        System.out.println(convertisseur.toString()+1);

    }
    
}
