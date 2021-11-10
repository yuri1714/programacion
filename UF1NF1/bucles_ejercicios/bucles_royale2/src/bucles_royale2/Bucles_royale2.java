/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_royale2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles_royale2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
   Scanner sc = new Scanner(System.in);
        int ataqueL = 0, vidaL = 0;
        int vidaT = 0, ataqueT = 0;
        int torre;
        int leñador;
        
        System.out.println("de que nivel es tu leñador (solo del 9 al 13)");
        
        leñador = sc.nextInt();
        
        if (leñador == 9){
            
            ataqueL = 200;
            vidaL = 1060;
            
        }else if (leñador == 10){
            
            ataqueL = 220;
            vidaL = 1166;
            
        }else if (leñador == 11){
            
            ataqueL = 242;
            vidaL = 1282;
            
        }else if (leñador == 12){
            
            ataqueL = 266;
            vidaL = 1409;
            
        }else if (leñador == 13){
            
            ataqueL = 292;
            vidaL = 1547;
            
        }else if (leñador < 9|| leñador > 13){
            
            System.out.println("Error. Coloca un numero del 9 al 13");
            
        }
        
        System.out.println("Tu leñador nivel " + leñador +" tiene un daño de "
        + ataqueL +" puntos y una vida de "+ vidaL +" puntos de vida");
        
        System.out.println("de que nivel es la torre enemiga?"
                + "(coloca un numero del 9 al 13)");
        torre = sc.nextInt();
        
        if (torre == 9){
            
            vidaT = 2534;
            ataqueT = 90;
            
        }else if (torre == 10){
            
            vidaT = 2786;
            ataqueT = 99;
            
        }else if (torre == 11){
            
            vidaT = 3052;
            ataqueT = 109;
            
        }else if (torre == 12){
            
            vidaT = 3346;
            ataqueT = 119;
            
        }else if (torre == 13){
            
            vidaT = 3668;
            ataqueT = 131;
            
        }else if (torre < 9 || torre > 13){
            
            System.out.println("Error. Coloca un numero del 9 al 13");
            
        }
        
        System.out.println("LA torre del rival tiene un total de  "
                + vidaT +" puntos de vida y un ataque de"+ ataqueT 
                +" puntos");
        
        while (vidaT > 0 && vidaL > 0)
        {
            
            System.out.println("el leñador le pega a la torre");
            vidaT = vidaT - ataqueL;
            System.out.println("la torre le pega al leñador");
            vidaL = vidaL - ataqueT*2;
            
            
            if(vidaT< 0 || vidaL < 0){
                
                vidaT = 0;
                vidaL = 0;
            }
            System.out.println("la torre tiene una vida de "+ vidaT +
                    " por el golpe del leñador" );
            
            System.out.println("elleñador tiene una vida de "+ vidaL +
                    " por el golpe del la torre" );
            
            
            Thread.sleep(500);
        }
        
        if (vidaT <= 0 && vidaL >= 0){
            
            System.out.println("el ganador es el leñador, con "
            + vidaL + " de vida");  
        }else if (vidaL <= 0 && vidaT >= 0){
            
            System.out.println("el ganador es el leñador, con "
            + vidaL + " de vida"); 
        }else {
            
            System.out.println("empate");
            
        }
        
    }
    
}
