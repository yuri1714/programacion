/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double radio, PI;
        double longi, area, volumen;

        Scanner teclado = new Scanner(System.in);
        System.out.println("que numero deseas utilizar");

        radio = teclado.nextDouble();
        PI = 3.14;

        longi = 2 * PI * radio;
        area = PI * radio * radio;
        volumen = (4 / 3) * PI * radio * radio * radio;

        System.out.println("La longitud de un ccirculo es " + longi);
        System.out.println("El area de un circulo es " + area);
        System.out.println("El volumen de un circulo es " + volumen);

    }

}
