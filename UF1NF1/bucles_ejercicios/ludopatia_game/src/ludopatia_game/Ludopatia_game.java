/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ludopatia_game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ludopatia_game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r =new Random();
        Scanner sc = new Scanner (System.in);
        int numAleatorio = r.nextInt(20)+1, num, intentos = 0 ;
        
        do{
        
            System.out.println("que numero crees que estoy pensando del 1 al 10???");
        
            num = sc.nextInt();
            intentos++;        
                if (num < numAleatorio){
            
                    System.out.println("Mi numero es Mayor");
            
                }else if(num > numAleatorio){
            
                    System.out.println("Mi numero es Menor");
            
                }

        }while(num != numAleatorio && intentos <= 8);
        
        if (numAleatorio == num){
            System.out.println("Ese es mi numero!!!");
        }
        
        
        
    }
    
}
