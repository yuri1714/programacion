/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int copas_obtenidas;
        char carta_escogida;
        Scanner sc = new Scanner(System.in);
        System.out.println("coloca el numero de copas que tienes");
        copas_obtenidas = sc.nextInt();

        sc.nextLine();

        if ((copas_obtenidas < 2000) && (copas_obtenidas >= 0)) {
            System.out.println("escoge entre el mago electrico (m) o el "
                    + "esbirro (e)");
            carta_escogida = sc.nextLine().charAt(0);

            if ((carta_escogida == 'm') || (carta_escogida == 'M')) {
                System.out.println("has escogido el mago electrico");
            } else if ((carta_escogida == 'e') || (carta_escogida == 'E')) {
                System.out.println("Has escogido el mega esbirro");
            } else {
                System.out.println("error a la hora de escoger catar, coloca "
                        + "la letra 'm' o la letra 'e' en minuscula");
            }

        } else if ((copas_obtenidas >= 2000) && (copas_obtenidas < 3000)) {
            System.out.println("escoge entre el caballero (c) o la bandida (b)");
            carta_escogida = sc.nextLine().charAt(0);

            if ((carta_escogida == 'c') || (carta_escogida == 'C')) {
                System.out.println("has escogido al caballero");
            } else if ((carta_escogida == 'b') || (carta_escogida == 'B')) {
                System.out.println("Has escogido la bandida");
            } else {
                System.out.println("error a la hora de escoger catar, coloca "
                        + "la letra 'c' o la letra 'm'");
            }
        } else if (copas_obtenidas >= 3000) {
            System.out.println("escoge entre el ejercito de esqueletos (e)"
                    + " o el gigante noble (g)");
            carta_escogida = sc.nextLine().charAt(0);

            if ((carta_escogida == 'e') || (carta_escogida == 'E')) {
                System.out.println("has escogido al ejercito de esqueletos");
            } else if ((carta_escogida == 'g') || (carta_escogida == 'G')) {
                System.out.println("Has escogido al gigante noble");
            } else {
                System.out.println("error a la hora de escoger catar, coloca "
                        + "la letra 'e' o la letra 'g'");
            }
        } else {
            System.out.println("error a la hora de colocar numero de cofres, "
                    + "porfavor coloque un numero de copas mayor o igual que cero");
        }

    }

}
