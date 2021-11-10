/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej17_primos;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej17_primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1;
        boolean resultado;

        do {

            System.out.println("coloca un valor para saber si es primo o no");
            valor1 = sc.nextInt();

            resultado = noesPrimo(valor1);
            if(valor1!=0)
            {
                
                if (resultado == true) {
                    System.out.println("el numero " + valor1 + " no es un numero primo");
                } else {
                    System.out.println("el numero " + valor1 + " es un numero primo");
                }
            
            }

        } while (valor1 != 0);
        System.out.println("hasta luego");
        
    }

    public static boolean noesPrimo(int valor1) {

        boolean total = false;

        for (int i = 2; i <= valor1-1; i++) {
            
            if (valor1 % i == 0) {
                return true;
            }
        }

        return false;
    }

}
