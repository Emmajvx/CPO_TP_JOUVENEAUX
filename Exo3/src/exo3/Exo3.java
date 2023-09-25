/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo3;

import java.util.Scanner;

/**
 *
 * @author emmaj
 */
public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operateur;
        int operande1;
        int operande2;
        int result = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter the operator:\n 1) add \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo");
        operateur=sc.nextInt();
        if (operateur<1 || operateur>5){ 
            System.out.println("\n please enter an operator between 1 and 5"); //ou alors System.exit(0);
            operateur=sc.nextInt(); 
        }
        System.out.println("\n Please enter the first number :");
        operande1=sc.nextInt();
        System.out.println("\n Please enter the second number :");
        operande2=sc.nextInt();
        if (operateur==1){ 
            result= operande1+operande2; 
        }
        if (operateur==2){ 
            result= operande1-operande2; 
        }
        if (operateur==3){ 
            result= operande1*operande2; 
        }
        if (operateur==4){ 
            result= operande1/operande2; 
        }
        if (operateur==5){ 
            result= operande1%operande2; 
        }
       System.out.println("\n The result is : " +result); 
    }
    
}
