/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Natalia Osorio
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Año bisiesto: Pide un año y determina si es bisiesto o no.
        
        int año1 = 2024;

        
        
       if ((año1 % 4 == 0 && año1 % 100 != 0) || (año1 % 400 == 0)){
            System.out.println(año1+" es bisiesto");
        }else{
            System.out.println(año1+" no es bisiesto");
        }

    }
    
}
