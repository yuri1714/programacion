/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package random_2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Random_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int ataque = 0;
        int vida = 0;
        int torre;
        int leñador;
        
        System.out.println("de que nivel es tu leñador (solo del 9 al 13)");
        
        leñador = sc.nextInt();
        
        if (leñador == 9){
            
            ataque = 200;
            
        }else if (leñador == 10){
            
            ataque = 220;
            
        }else if (leñador == 11){
            
            ataque = 242;
            
        }else if (leñador == 12){
            
            ataque = 266;
            
        }else if (leñador == 13){
            
            ataque = 292;
            
        }else if (leñador < 9|| leñador > 13){
            
            System.out.println("Error. Coloca un numero del 9 al 13");
            
        }
        
        System.out.println("Tu leñador nivel " + leñador +" tiene un daño de "
        + ataque +" puntos");
        
        System.out.println("de que nivel es la torre enemiga?"
                + "(coloca un numero del 9 al 13)");
        torre = sc.nextInt();
        
        if (torre == 9){
            
            vida = 2534;
            
        }else if (torre == 10){
            
            vida = 2786;
            
        }else if (torre == 11){
            
            vida = 3052;
            
        }else if (torre == 12){
            
            vida = 3346;
            
        }else if (torre == 13){
            
            vida = 3668;
            
        }else if (torre < 9 || torre > 13){
            
            System.out.println("Error. Coloca un numero del 9 al 13");
            
        }
        
        System.out.println("LA torre del rival tiene un total de  "
                + vida +" puntos de vida");
        
        while (vida > 0)
        {
            
            System.out.println("el leñador le pega a la torre");
            vida = vida - ataque;
            
            
            if(vida<0){
                
                vida = 0;
                
            }
            
            System.out.println("la torre tiene una vida de "+ vida +
                    " por el golpe del leñañdor" );
            
            
            Thread.sleep(500);
        }
        
    }
    
}
