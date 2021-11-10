/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9_elevado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej9_elevado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valor1, valor2, valor3, mayor;
        
        System.out.println("coloca un primer valor");
        valor1 = sc.nextInt();
        System.out.println("coloca un segundo valor");
        valor2 = sc.nextInt();
        System.out.println("coloca un tercer valor");
        valor3 = sc.nextInt();
        
        mayor=elevadoValores(valor1, valor2);
        
        mayor=elevadoValores(mayor, valor3);
        
        System.out.println("el numero mayor es " + mayor);
        
        
        
    }
    
    public static int elevadoValores(int valor1, int valor2)
    {
        
        
        if(valor1>valor2){
         
            return valor1;
            
        }else{
            return valor2;
        }
   
    }

    
}
