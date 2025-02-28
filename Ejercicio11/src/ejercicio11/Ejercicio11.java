/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author Natalia Osorio
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tabla de multiplicar: Pide un número y muestra su tabla de multiplicar del 1 al 10.

        int numero = 2;
        
         System.out.println("Tabla de multiplicar del "+numero);
        for(int iteracion = 1;iteracion <=10; iteracion++){
            int resultado = numero * iteracion;
            System.out.println(numero+" X "+iteracion+ " = "+ resultado);
        }
        
        
    }
    
}
