/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2_ej3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex2_ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        int metros,suma = 0;
        char respuesta;
 
        do{

            System.out.println("Metros cuadrados habitación: ");
            metros = sc.nextInt();
            sc.nextLine();
            System.out.println("Hay más habitaciones (s/n): ");
            respuesta = sc.nextLine().charAt(0);
            
            suma = suma + metros;
            

        }while(respuesta!='n');  
        
        System.out.println("tu casa mide" + suma + " metros cuadrados");
    }
      
    
}
