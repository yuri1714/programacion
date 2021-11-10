/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, n3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("agrega un numero");

        n1 = teclado.nextInt();

        System.out.println("agrega un segundo numero");
        n2 = teclado.nextInt();

        System.out.println("agrega un tercer numero");
        n3 = teclado.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es n1 " + n1);
            } else {
                System.out.println("n3 es el mayor " + n3);
            }
        } else if (n2 > n3) {
            System.out.println("El mayor es n2 " + n2);
        } else //n3 es el mas grande
        {
            System.out.println("el mayor es n3 " + n3);
        }

    }

}
