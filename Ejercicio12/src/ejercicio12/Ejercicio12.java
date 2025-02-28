/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Natalia Osorio
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Suma de N numeros: solicita un numero N y suma los primeros N numeros naturales
        
        int numeroN = 3;
        int suma = 0;
        
        for(int iteracion = 1;iteracion <= numeroN;iteracion++){
        suma += iteracion; 
        
        }
        System.out.println("La suma de los primeros "+numeroN+ " numeros naturales es: "+suma);
    }
    
}
