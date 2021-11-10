/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajitaslol;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yuri147
 */
public class CajitasLOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int cajita, cajitaO = 0, opcion, resultado, game, abrir;
        int premio;
        do {
            System.out.println("Que quieres hacer:   1.jugar   2.abrir cajas   3.salir del juego");
            opcion = sc.nextInt();

            if (opcion == 1) {
                do {
                    System.out.println("quiere batallar en la grieta del invocador? "
                            + "si(1) no (2)");
                    game = sc.nextInt();

                    if (game == 1) {
                        resultado = r.nextInt(10) + 1;
                        if (resultado >= 5) {
                            System.out.println("¡¡¡VICTORIA!!!");
                            cajita = r.nextInt(10) + 1;
                            if (cajita > 5 && cajita <= 10) {
                                System.out.println("has ganado una caja");
                                cajitaO = cajitaO + 1;
                            } else if (cajita >= 0 && cajita <= 5) {
                                System.out.println("no obtuviste una caja :(");
                            }
                        } else if (resultado <= 5) {
                            System.out.println("derrota");
                        }
                    } else if (game > 2 || game < 1) {
                        System.out.println("coloca un numero entre el 1 y el 2");
                    }

                    System.out.println("tienes " + cajitaO + " cajitas");
                } while (game != 2);

            } else if (opcion == 2) {
                System.out.println("bienvenido a tu inventario, tienes un total de "
                        + cajitaO + " cajitas");
                do {
                    System.out.println(" quieres abrir una cajita ? si(1) no(2)");
                    abrir = sc.nextInt();

                    premio = r.nextInt(100) + 1;
                    if (abrir == 1 && cajitaO >= 1) {

                        if (premio >= 1 && premio < 25) {
                            System.out.println("has ganado un fragmento de campeon");
                        } else if (premio >= 25 && premio < 35) {
                            System.out.println("has ganado un emote permanente");
                        } else if (premio >= 35 && premio < 46) {
                            System.out.println("has ganado una skin de Ward");
                        } else if (premio >= 46 && premio < 50) {
                            System.out.println("has ganado un icono");
                        } else if (premio >= 50 && premio < 75) {
                            System.out.println("ganaste una skin de campeon normal");
                        } else if (premio >= 75 && premio < 85) {
                            System.out.println("ganaste una skin de campeon epica");
                        } else if (premio >= 85 && premio < 95) {
                            System.out.println("ganaste una skin de campeon legendaria");
                        } else if (premio >= 95 && premio < 100) {
                            System.out.println("ganaste una skin de campeon mitica");
                        }

                        cajitaO = cajitaO - 1;
                        System.out.println("numero " + premio);
                        System.out.println("tienes " + cajitaO + " cajitas");
                    } else if (abrir == 1 && cajitaO == 0) {
                        System.out.println("lo siento pero no tienes ninguna cajita :(");
                    }

                } while (abrir != 2);
            }

        } while (opcion != 3);

        System.out.println("gracias por jugar, que tenga un buen dia :D");
    }

}
