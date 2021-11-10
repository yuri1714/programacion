/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_descuento;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double precioR, precioD, Descuento;
        Scanner teclado = new Scanner(System.in);
        System.out.println("el precio real del articulo es ");
        precioR = teclado.nextDouble();
        System.out.println("el precio en descuento del articulo es ");
        precioD = teclado.nextDouble();

        Descuento = (double) ((precioR - precioD) * 100 / precioR);

        System.out.println("el descuento que ha hecho la tienda es de "
                + Descuento + "%");

    }

}
