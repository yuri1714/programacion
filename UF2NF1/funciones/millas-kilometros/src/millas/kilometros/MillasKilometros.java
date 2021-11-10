/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millas.kilometros;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MillasKilometros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int millas, kilometros;
        int millas_kilo = 160934;
        
        System.out.println("coloca un valor en millas");
        millas = sc.nextInt();
        
        kilometros = (int) millas_a_kilometros(millas, millas_kilo);
        
        
        System.out.println("el numero de millas recorrida: "+ millas
            + " en kilometros es " + kilometros);
        
    }

    public static double millas_a_kilometros(int millas, int millas_kilo) {
        
        int kilo;
        kilo = millas * millas_kilo;
        
        return kilo;
    }
    
}
