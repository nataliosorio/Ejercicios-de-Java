/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author Natalia Osorio
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculadora simple: Pide dos números y una operación (+, -, *, /) e imprime el resultado.
        
        int numero1 = 10;
        int numero2 = 3;
        String operacion = "suma";  
        double resultado;

        switch (operacion.toLowerCase()) {
            case "suma":
                resultado = numero1 + numero2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case "resta":
                resultado = numero1 - numero2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case "multiplicacion":
                resultado = numero1 * numero2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case "division":
                if (numero2 != 0) {
                    resultado = (double) numero1 / numero2;
                    System.out.println("Resultado de la división: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
        

    }
    
}
