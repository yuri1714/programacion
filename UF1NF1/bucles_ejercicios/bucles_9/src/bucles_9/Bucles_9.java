/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_9;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int suma10 = 0,Producto10=1;
        Scanner sc = new Scanner(System.in);

        for ( num = 1; num <=2; num++) {
           
            System.out.println(suma10 + "+" + num);
            suma10 = suma10 + num;
            System.out.println(Producto10 + "*" + num);
            Producto10 = Producto10 * num;
            System.out.println("Fin de la vuelta");
            
        }
        
        
        System.out.println("la suma total es "+ suma10);
        System.out.println("el producto total es " + Producto10);
        
        
        
    }
    
}
