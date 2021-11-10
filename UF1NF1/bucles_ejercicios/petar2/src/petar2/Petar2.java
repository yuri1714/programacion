/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petar2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Petar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        Random r =new Random ();
        Scanner sc = new Scanner(System.in);
        int cohete1, cohete2, cohete3, eleccion;
        
        cohete1 = r.nextInt(21);
        cohete2 = r.nextInt(21);
        cohete3 = r.nextInt(21);
        
        System.out.println("Escoge un cohete (1, 2, 3)");
        
        eleccion = sc.nextInt();
        
        int lineaPintada = 0;
        
        System.out.println("P1   P2   P3   ");
        
        while(lineaPintada<cohete1 || lineaPintada<cohete2 
                || lineaPintada<cohete3)
        {
            if (lineaPintada<cohete1)
            {
                System.out.print("*   ");
            }
            else
            {
                System.out.print("    ");
            }
            if (lineaPintada<cohete2)
            {
                System.out.print("*   ");
            }
            else
            {
                System.out.print("    ");
            }
            if (lineaPintada<cohete3)
            {
                System.out.println("*   ");
            }
            else
            {
                System.out.println("    ");
            }
            
          
            Thread.sleep(1000);
            lineaPintada++;
        }
        

        
        if(cohete1 > cohete2 && cohete1 > cohete3){
            
            if(eleccion == 1)
            {
                System.out.println("eres el ganador");
            }else 
            {    
                System.out.println("has perdido");   
            }
            
        }else if (cohete2 > cohete1 && cohete2 > cohete3) {
            
            if (eleccion == 2)
            {
                System.out.println("has ganado");
            }else
            {
                System.out.println("has perdido");
            }
            
        }else 
        {
            
            if(eleccion ==3)
            {
                System.out.println("has ganado");
            }else
            {
                System.out.println("has perdido");
            }
            
        }
        
        System.out.println("Distancia del cohete1: "+ cohete1);
        System.out.println("Distancia del cohete2: "+ cohete2);
        System.out.println("Distancia del cohete3: "+ cohete3);
        
    }
    
}
