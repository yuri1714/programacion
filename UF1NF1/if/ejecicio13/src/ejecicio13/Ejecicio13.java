/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecicio13;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejecicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("agrega variable n1");
        n1 = teclado.nextInt();
        
        System.out.println("agrega variable n2");
        n2 = teclado.nextInt();
        
        if(n1 < n2)
        {
        System.out.println("el orden es " + n1 + " y " + n2);
        }
       
        else 
        {
        System.out.println("el orden es " + n2 + " y " + n1);
        }
    }
    
}
