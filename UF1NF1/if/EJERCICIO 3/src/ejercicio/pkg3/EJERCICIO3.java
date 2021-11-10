/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double lado,area;
        /* Es un tipo scanner
        sirve para recoger datos por teclado
        y lo devuelve*/
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuando mide el lado de tu cuadrado");
        
        
        lado = teclado.nextDouble();
        area = lado*lado;
        
        System.out.println("el lado de un cuadrado vale " + lado);
        System.out.println("el area del cuadrado vale " + area);
        
        
    }
    
}
