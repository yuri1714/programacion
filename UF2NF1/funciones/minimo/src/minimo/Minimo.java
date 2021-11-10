/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Minimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int valor1, valor2, menor;
        
        System.out.println("coloca valor1");
        valor1 = sc.nextInt();
        System.out.println("coloca valor2");
        valor2 = sc.nextInt();
        
        menor = minimo(valor1,valor2);
        
        System.out.println("el valor mas pequeño es " + menor);
        
    }

    public static int minimo(int valor1, int valor2) {
        
        int regresar;
        
        if(valor1 > valor2){
             regresar = valor2;
        }else {
            regresar = valor1;
        }
        
        return regresar;
        
    }
    
}
