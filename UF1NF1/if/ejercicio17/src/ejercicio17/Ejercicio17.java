/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int hora, min, seg;
        Scanner sc = new Scanner(System.in);
        System.out.println("agrega la hora");
        hora = sc.nextInt();

        System.out.println("agraga el minuto");
        min = sc.nextInt();

        System.out.println("agrega el segundo");
        seg = sc.nextInt();

        seg = seg + 1;

        if (seg >= 60) {
            System.out.println("he pasado 60");
            seg = 0;
            min = min + 1;

            if (min == 60) {
                min = 0;
                hora = hora + 1;

                if (hora == 24) {
                    hora = 0;

                    System.out.println("la hora es " + hora + "h " + min
                            + "min " + seg + "seg ");

                } else //no he pasado 24h
                {
                    System.out.println("la hora es " + hora + "h " + min
                            + "min " + seg + "seg ");
                }
            } else // sino he pasado 60min
            {
                System.out.println("la hora es " + hora + "h " + min + "min " 
                        + seg + "seg ");
            }
        } else // si no he pasado 60seg
        {
            System.out.println("la hora es " + hora + "h " + min + "min " + seg
                    + "seg ");
        }

    }

}
