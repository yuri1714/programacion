/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_6;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        boolean negativo;
        Scanner sc = new Scanner(System.in);
        
        negativo = false;
        
        for (num = 1; num <= 10 ; num++)
        
        {
            System.out.println("escribe los numeros hasta el 10");
            num= sc.nextInt();
            
            if(num<0){
                negativo = true;
            }
           num = num+1;
        
        }
        
        if (negativo == true){
            System.out.println("hay un uno o mas numeros  negativo");
        }
        else  {
            System.out.println("no has puesto ningun negativo");
        }
        
        
        
    }
    
}
