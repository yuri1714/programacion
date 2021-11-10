/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablasm;

/**
 *
 * @author alumne
 */
public class TablasM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int tabla,resultado,num;
        
        for (num = 1; num <= 10; num++) {

            for ( tabla= 0; tabla <= 10; tabla++) {
                
                resultado = num*tabla;
                
                System.out.println(num +"*"+ tabla +"="+ resultado); 
            
            }
            
           
            
        }
       
       
        
        
    }
    
}
