/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Natalia Osorio
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Números primos en un rango: Solicita un número límite y muestra todos los primos hasta ese número.
        
        
        int numeroLimite = 15;

        
        
         if(numeroLimite <=1){
                  System.out.println("No hay numeros primos en este rango");
         }else{
                  System.out.println("Numeros primos hasta " + numeroLimite + ":");
                  
                  for (int numero = 2; numero <= numeroLimite; numero++) { 
                           boolean esPrimo = true;

                           for (int divisor = 2; divisor < numero; divisor++) { 
                                    if (numero % divisor == 0) {
                                             esPrimo = false; 
                                             break; 
                                    }
                           }
                           
                           if (esPrimo) {
                                    System.out.print(numero + ",");
                           }
                  }
        
         }

        
        
    }
    
}
