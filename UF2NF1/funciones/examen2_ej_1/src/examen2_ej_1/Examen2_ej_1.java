/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2_ej_1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Examen2_ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero, total = 0, numeros = 0, suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("coloca numeros del 1 al 20 "
                + "(el programa parara cuando se coloque 3 numero >=10"
                + " y menores o igual a 20)");

        do {

            System.out.println("coloca un numero");
            numero = sc.nextInt();

            total = total + 1;

            if (numero >= 10 && numero <= 20) {

                numeros = numeros + 1;
                suma = suma + numero;

            } else if (numero < 0 || numero > 20) {
                System.out.println("error, coloca solo numeros del 1 al 20");
            }

        } while (numeros != 3);

        System.out.println("has colocado en total de " + total + " numeros");
        System.out.println("la suma de los 3 numeros és " + suma);
    }

}
