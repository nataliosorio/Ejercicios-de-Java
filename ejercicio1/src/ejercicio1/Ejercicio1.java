/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Natalia Osorio
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         /*
         Ejercicio 1:
         Conversión de temperatura: Escribe un programa que convierta una temperatura
         ingresada en grados Celsius a Fahrenheit y Kelvin.

          */
        
            double gradosC = 15.8;
            var Fahrenheit = gradosC * 1.8 + 32;
            var kelvin = 273.15 + gradosC;
            
            System.out.println("--------------CONVERSION DE TEMPERATURAS--------------");
            System.out.println(gradosC + " Grados Celsius son " + Fahrenheit + " Fahrenheit ");
            System.out.println(gradosC + " Grados Celsius son " + kelvin + " Kelvin ");
                    
                      
        
       
    }
     
}
