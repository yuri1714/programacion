/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jasi;

/**
 *
 * @author alumne
 */
public class Jasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pares=0, impar = 0,cont;
        for (cont =100; cont<=200; cont++) {
            //System.out.println("contador es " + cont);
            if (cont%2==0)
            {
                pares = pares + cont;
                
                System.out.println(pares);
            }
            else
            {
                impar = impar + cont;
            }
            
        }
        
        System.out.println("La suma de pares es " + pares);
        System.out.println("La suma de impares es " + impar);
    }
    
}
