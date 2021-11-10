/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      int millas,metros;
        final int Milla_Metro = 1852;
        Scanner teclado = new Scanner(System.in);
        System.out.println("cuanats millas quieres tranformar");    
        
        millas = teclado.nextInt();
        metros = millas * Milla_Metro;
        
        
        System.out.println("metros recorridos es igual a " + metros + "m");
    }
    
}
