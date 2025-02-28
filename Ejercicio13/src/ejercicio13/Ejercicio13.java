/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author Natalia Osorio
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Contador de dígitos: Pide un número entero y cuenta cuántos dígitos tiene.

        
         int numero = 245;
         int num = numero;
         int cantidadDigitos = 0;
        
        
         int numeroDigitos = Math.abs(numero);
         if (numeroDigitos == 0) {
            cantidadDigitos = 1;
         } else {
            while (numeroDigitos > 0) {
                numeroDigitos /= 10;
                cantidadDigitos++;
            }
         }
      
         System.out.println("El numero " + num + " tiene " + cantidadDigitos + " digitos.");
        
        
        
    }
    
}
