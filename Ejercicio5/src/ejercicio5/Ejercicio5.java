/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Natalia Osorio
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         /*
         Ejercicio 2:
           Intercambio de valores: Solicita dos valores y los intercambia sin usar una variable auxiliar.

         */
         
         int numA = 5;
         int  numB = 3;
         
         numA = numA + numB;
        
         numB = numA - numB;
         
         numA = numA - numB;
        
          System.out.println("------------Intercambio de valores------------");
        
        
        System.out.println(numA);
        System.out.println(numB);
        
    }
    
}
