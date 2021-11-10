/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg11;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int n1,n2;    
    Scanner teclado = new Scanner(System.in);
    System.out.println("coloca un valor para n1");
    
    n1 = teclado.nextInt();
    System.out.println("coloca valor para n2");
    
    n2 = teclado.nextInt();
    
    if (n1>n2)
        {
            System.out.println("el mayor es" + n1);
        }    
    else
        {
            System.out.println("es mayor es " + n2);
        }
    
    
    
    }
    
}
