/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iva_precio;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Iva_precio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precioCompra, total;
        int vueltas = 0;
        
        do{
        
            
        System.out.println("coloca el precio de tu compra");
        precioCompra = sc.nextDouble();

        total = precioConIVA(precioCompra);
        
        System.out.println("el precio con iva es: "+ total);
        
        vueltas = vueltas + 1;
        
        }while(vueltas !=5);
    }

    public static double precioConIVA(double precioCompra) {

        double total;

        total = ((precioCompra * 100) / 21);

        return total;

    }

}
