/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_7.pkg8;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles_78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        int Nmenos = 0,Nmas = 0;
        boolean negativo;
        Scanner sc = new Scanner(System.in);
        
        negativo = false;
        
        do {
            System.out.println("escribe los numeros hasta el 10");
            num= sc.nextInt();
            
            if(num<0){
                negativo = true;
                Nmenos = Nmenos + 1;
            }
            else if (num>0) {
               Nmas=Nmas + 1; 
            }
        }while(num!=0);
        
            System.out.println("has puesto un total de "
            + Nmenos + " numeros negativos");
            
            System.out.println("has puesto un total de "
            + Nmas + " numeros positivos");
        
        if (negativo == true){
            System.out.println("hay un uno o mas numeros  negativo");
        }

        
        
        
        
    }
    
}
