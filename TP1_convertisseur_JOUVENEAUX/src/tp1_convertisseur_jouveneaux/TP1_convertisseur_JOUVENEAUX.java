/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_jouveneaux;

import java.util.Scanner;

/**
 *
 * @author emmaj
 */
public class TP1_convertisseur_JOUVENEAUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            tempfin=CelciusVersKelvin(temp);
            unite1="Celcius";
            unite2="Kelvin";
        }
        if (choix==2){ 
            tempfin=KelvinVersCelcius(temp);
            unite1="Kelvin";
            unite2="Celcius";
        }
        if (choix==3){ 
            tempfin=FarenheitVersCelcius(temp);
            unite1="Farenheit";
            unite2="Celcius";
        }
        if (choix==4){ 
            tempfin=CelciusVersFarenheit(temp);
            unite1="Celcius";
            unite2="Farenheit";
        }
        if (choix==5){ 
            tempfin=KelvinVersFarenheit(temp);
            unite1="Kelvin";
            unite2="Farenheit";
        }
        if (choix==6){ 
            tempfin=FarenheitVersKelvin(temp);
            unite1="Farenheit";
            unite2="Kelvin";
        }
        System.out.println("\n"+temp+ " degre "+unite1+" est egal a "+tempfin+" degre "+unite2);
    }

    public static double CelciusVersKelvin(double tCelcius) {
        double tKelvin = tCelcius + 273.15;
        return tKelvin;

    }

    public static double KelvinVersCelcius(double tKelvin) {
        return (tKelvin-273.15);
    }
    public static double FarenheitVersCelcius(double tFarenheit) {
        return ((tFarenheit-32)*(5.0/9.0));
    }
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius*(9.0/5.0)+32);
    }
    public static double KelvinVersFarenheit(double tKelvin) {
        return (tKelvin*(9.0/5.0)-459.57);
    }
    public static double FarenheitVersKelvin(double tFarenheit) {
        return ((tFarenheit+459.67)+459.57);
    }
    }
    
    
