/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_jouveneaux;

/**
 *
 * @author emmaj
 */
public class Convertisseur {
    
    int nbConversions;
    public Convertisseur () {
        nbConversions = 0 ;
    }

    public double CelciusVersKelvin(double tCelcius) {
        double tKelvin = tCelcius + 273.15;
        return tKelvin;
    }
    public double KelvinVersCelcius(double tKelvin) {
        return (tKelvin-273.15);
    }
    public double FarenheitVersCelcius(double tFarenheit) {
        return ((tFarenheit-32)*(5.0/9.0));
    }
    public double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius*(9.0/5.0)+32);
    }
    public double KelvinVersFarenheit(double tKelvin) {
        return (tKelvin*(9.0/5.0)-459.57);
    }
    public double FarenheitVersKelvin(double tFarenheit) {
        return ((tFarenheit+459.67)+459.57);
    }
    @Override
    public String toString() {
    return "nb de conversions"+ nbConversions;
    }
    
}
