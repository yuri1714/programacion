/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("coloca tu edad");
    int edad;
    
    edad = teclado.nextInt();
    
        if (edad >=18)
        {
            System.out.println("eres mayor de edad");
        }
        else 
        {
            System.out.println("eres menor de edad");
        }
    }
    
}
