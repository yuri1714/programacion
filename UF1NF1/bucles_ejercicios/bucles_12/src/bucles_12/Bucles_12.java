/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_12;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num,elevado=0,cont,resultado=1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("agrega un numero para multiplicarlo:");
        num = sc.nextInt();
        System.out.println("agrega el numero de veces que se multiplicara:");
        elevado = sc.nextInt();  
        
        for ( cont=0; elevado!= cont ;cont++) {
            
          System.out.println("el resultado es "+ resultado );
          
           resultado=resultado * num;
            
        }
        
        System.out.println("el resultado es "+ resultado);
        
    }
    
}
