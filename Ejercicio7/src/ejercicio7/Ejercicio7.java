/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author Natalia Osorio
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mayor de tres números: Solicita tres números e imprime cuál es el mayor.
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
         if (num1 == num2 && num2 == num3) {
            System.out.println("Todos los numeros son iguales.");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El numero mayor es: " + num2);
        } else {
            System.out.println("El numero mayor es: " + num3);
        }
        
    }
    
}
