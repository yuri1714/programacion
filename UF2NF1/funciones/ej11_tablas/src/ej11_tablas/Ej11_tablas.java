/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11_tablas;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej11_tablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1;
        
        System.out.println("coloca un valor para multiplicar");
        valor1=sc.nextInt();
        
        tabla(valor1);
        
    }
    
    public static void tabla(int valor1)
    {
        int multi;
        for (int i = 1; i <= 10; i++) {
            
            multi = valor1*i;
            
            System.out.println(valor1 + "*" + i + "=" + multi);
        }
        
    }
    
}
