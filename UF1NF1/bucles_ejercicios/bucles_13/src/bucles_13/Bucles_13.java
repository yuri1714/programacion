/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_13;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int min=1,max=100,numAdivina;
        char respuesta;
        do{
            
        numAdivina = (min+max)/2;
        
        System.out.println(" tu numero es Mayor (M), inFerior(F) o Igual(I)a " 
                + numAdivina + "???");
        
        respuesta = sc.nextLine().charAt(0);

            if (respuesta == 'M' || respuesta == 'm'){
            
                min = numAdivina;
                
                System.out.println("el min cambia a " + numAdivina);
            
            } else if(respuesta == 'F' || respuesta == 'f'){
            
            max = numAdivina;
            System.out.println("el max cambia a " + numAdivina);
            
        }
            
            
        }while(respuesta!='I'&& respuesta!='i');
        
        System.out.println("tu numero es " + numAdivina);
        

      
      
        
    }
    
}
