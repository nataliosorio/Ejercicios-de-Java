/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author Natalia Osorio
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Serie Fibonacci: Imprime los primeros N términos de la serie de Fibonacci.
       

         int numero = 6; 
         int primerTermino = 0;
         int segundoTermino = 1;
         int suma;

        System.out.println("Serie de Fibonacci hasta " + numero + " terminos:");
        
        for (int iteracion = 1; iteracion <= numero; iteracion++) {
            System.out.print(primerTermino + ",");
            suma = primerTermino + segundoTermino;
            primerTermino = segundoTermino;
            segundoTermino = suma;
        }
        
    }
    
}
