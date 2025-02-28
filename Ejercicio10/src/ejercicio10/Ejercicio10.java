/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Natalia Osorio
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Clasificación de triángulos: Pide los lados de un triángulo e indica si es equilátero, isósceles o escaleno.

        
        int lado1 = 14;
        int lado2 = 14;
        int lado3 = 14;
        
       if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triangulo es equilatero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triangulo es isosceles.");
        } else {
            System.out.println("El triangulo es escaleno.");
        }
    }
    
}
