/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Natalia Osorio
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
         Ejercicio 2:
         Cálculo del IMC: Pide al usuario su peso (kg) y altura (m), y calcula su Índice de Masa Corporal (IMC).
        
          */
         double peso = 99.95;
         
         double altura = 1.69;
         
         var IMC = peso / (altura* altura);
         
            System.out.println("---------CALCULO DEL IMC--------------");
            
        System.out.println("El IMC del usuario cuyo peso es de "+ peso+ "kg y cuya altura es de "+altura+"m, es de: "+IMC);
    }
    
}
