/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumayresta;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class SumaYresta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        double resultadod = 0;
        int resultado = 0; //operacion 
        int opcion;
        valor1 = intruducirPositivo(sc);
        valor2 = intruducirPositivo(sc);

        mostrarMenu();
        opcion = validarOpcion(sc);

        if (opcion == 1) {
            resultado = suma(valor1, valor2);
        } else if (opcion == 2) {
            resultado = resta(valor1, valor2);
        } else if (opcion == 3) {
            resultado = multi(valor1, valor2);
        } else if (opcion == 4) {
            resultadod = divi(valor1, valor2);
        }

        System.out.println("El resultado de la operación elegida es " + resultado);

    }

    public static int suma(int valor1, int valor2) {

        int total;

        total = valor1 + valor2;

        return total;

    }

    public static int resta(int valor1, int valor2) {

        int total;

        total = valor1 - valor2;

        return total;

    }

    public static int multi(int valor1, int valor2) {

        int total;

        total = valor1 * valor2;

        return total;

    }

    public static double divi(int valor1, int valor2) {

        double total;

        total = valor1 / valor2;

        return total;

    }

    private static void mostrarMenu() {

        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Divicion");

    }

    private static int validarOpcion(Scanner sc) {

        int opcion;

        do {
            System.out.print("pon opcion menu (1-4)");
            opcion = sc.nextInt();
            mostrarMenu();

        } while (opcion < 1 || opcion > 4);

        return opcion;
    }

    private static int intruducirPositivo(Scanner sc) {
        
        int valor;
        
        do{
            System.out.println("Pon un valor positivo");
        valor = sc.nextInt();
            if(valor <=0){
                System.out.println("opcion incorrecta. Coloca un numero postivo");
            }
        }while(valor<=0);

        return valor;
    }

}
