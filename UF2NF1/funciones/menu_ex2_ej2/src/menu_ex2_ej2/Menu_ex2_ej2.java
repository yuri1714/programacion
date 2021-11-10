/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu_ex2_ej2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Menu_ex2_ej2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, escribe = 0, pedir1, pedir2, cont = 11, par = 0, mayor, menor;

        do {

            System.out.println("****** MENU ******");
            System.out.println("0-Salir");
            System.out.println("1-Escribir 10 veces");
            System.out.println("2-Cuenta atrás timbre");
            System.out.println("3-Numero pares entre 2 valores");

            opcion = sc.nextInt();

            if (opcion == 1) {

                for (escribe = 1; escribe <= 10; escribe++) {

                    System.out.println(escribe + " A clase se viene a trabajar");

                }

            } else if (opcion == 2) {
                do {
                    cont = cont - 1;
                    System.out.print(cont);
                } while (cont != 0);

                System.out.println(" RIIIIIIIING!!!!");

            } else if (opcion == 3) {

                System.out.println("primer numero");

                pedir1 = sc.nextInt();

                System.out.println("segundo numero");
                pedir2 = sc.nextInt();

                if (pedir1 > pedir2) {
                    mayor = pedir1;
                    menor = pedir2;
                } else {
                    mayor = pedir2;
                    menor = pedir1;
                }

                for (int numero = menor + 1; numero < mayor; numero++) {

                    if (numero % 2 == 0) {

                        System.out.println(numero);

                    }

                }

            } else if (opcion == 0) {
                System.out.println("hasta pronto");
            } else {
                System.out.println("coloca uno de los numeros del menu");
            }
            
            

        } while (opcion != 0);

    }
}
