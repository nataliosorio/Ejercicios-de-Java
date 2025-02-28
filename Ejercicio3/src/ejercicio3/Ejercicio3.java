/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Natalia Osorio
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      /*
         Ejercicio 2:
         Área y perímetro de un triángulo: Solicita la base y la altura de un triángulo y calcula su área y perímetro.

         */
         int baseTri = 15;
         int alturaTri = 10;
         var area = (baseTri * alturaTri) / 2;
        
          var hipo = (alturaTri * alturaTri) + (baseTri * baseTri);
          
         double hipotenusa = Math.sqrt(hipo);
         
         var peri = baseTri + alturaTri + hipotenusa;
          
        
        System.out.println("------------Area y perimetro del triangulo------------");
        
          System.out.println("El area del triangulo es "+area+ "cm cuadrados");
          System.out.println("El Perimetro del triangulo es "+peri+ "cm");
       
    }
    
}
