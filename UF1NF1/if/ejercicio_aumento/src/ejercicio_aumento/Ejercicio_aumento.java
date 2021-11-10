/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_aumento;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_aumento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int sueldo_actual, sueldo_aumentado =0, sueldoTotal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("coloca el sueldo que ganas actualmente");
        sueldo_actual = sc.nextInt();

        if ((sueldo_actual < 18000) && (sueldo_actual >= 0)) {
            sueldo_aumentado = sueldo_actual * 12 / 100;
        } else if (sueldo_actual < 30000) {
            sueldo_aumentado = sueldo_actual * 10 / 100;
        } else if (sueldo_actual < 45000) {
            sueldo_aumentado = sueldo_actual * 8 / 100;
        } else if (sueldo_actual > 45000) {
            sueldo_aumentado = sueldo_actual * 6 / 100;
        } else {
            System.out.println("coloca un valor mayor a 0");
        }
         sueldoTotal = sueldo_actual + sueldo_aumentado;
        System.out.println("tu sueldo pasaria de " + sueldo_actual + "€ a "
                + sueldoTotal + "€");

    }

}
