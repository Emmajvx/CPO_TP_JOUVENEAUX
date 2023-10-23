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
public class Baton extends Arme{
    int age;
    
    public Baton(String Nom, int niveau, int ag) {
        super(Nom, niveau);
        ag = age;
        if (age>100){
        age=100;
    }
    
    }
}
