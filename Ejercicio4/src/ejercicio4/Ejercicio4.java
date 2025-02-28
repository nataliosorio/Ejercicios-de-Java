/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Natalia Osorio
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          /*
         Ejercicio 2:
           Operaciones con dos números: Pide dos números al usuario y muestra la suma, resta, multiplicación, división y módulo.

         */
        
         int numero1 = 20;
         int numero2 = 10;
        
        int suma;
        int resta;
        double division;
        int multi;
        int modulo;
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        division = numero1 /numero2;
        multi = numero1 * numero2;
        modulo = numero1 % numero2;
        
        System.out.println("------------Operaciones------------");
        System.out.println("La suma entre "+ numero1 + " y "+ numero2 + " es: "+ suma);
        System.out.println("La resta entre "+ numero1 + " y "+ numero2 + " es: "+ resta);
        System.out.println("La multiplicacion entre "+ numero1 + " y "+ numero2 + " es: "+ multi);
        System.out.println("La Division entre "+ numero1 + " y "+ numero2 + " es: "+ division);
        System.out.println("El modulo es: "+modulo);
      

        
        
    }
    
}
