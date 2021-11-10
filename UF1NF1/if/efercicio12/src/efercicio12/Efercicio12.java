/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package efercicio12;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Efercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n1;    
        Scanner teclado = new Scanner(System.in);
    System.out.println("coloca un valor para n1");
    
    n1 = teclado.nextInt();

    
    if (n1 >= 0)
        {
            System.out.println("el valor es positivo");
        }    
    else
        {
            System.out.println("el valor es negativo");
        }    
    }
    
}
