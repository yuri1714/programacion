/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13_descuento;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej13_Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double precioNormal, precioDescuento;
        int valorDescuento;
        
        System.out.println("coloca el precio del articulo");
        precioNormal=sc.nextDouble();
        System.out.println("coloca el precio pagado");
        precioDescuento=sc.nextDouble();
        
        valorDescuento=descuento(precioNormal, precioDescuento);
        
        System.out.println("el descuento hecho es de un " +valorDescuento+"%");
        
        
    }

    public static int descuento(double precioNormal, double precioDescuento) {
        
        double total;
        
        total=((precioNormal-precioDescuento)*100)/precioNormal;
        
        return (int) total;
        

    }
    
}
