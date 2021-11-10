/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayoredadfunt;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MayorEdadFunt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int edad;
        
        edad = edadPositivo(sc);
    
        boolean MayorEdad;
        
        MayorEdad = mayorEdad(edad);
    
        if (MayorEdad == true)
        {
            System.out.println("eres mayor de edad");
        }
        else 
        {
            System.out.println("eres menor de edad");
        }
        
        
        
        
    }
    
    private static int edadPositivo(Scanner sc) {
        
        int valor;
        
        do{
            System.out.println("Pon tu edad (solo nuemeros postivos)");
        valor = sc.nextInt();
            if(valor <=0){
                System.out.println("opcion incorrecta. Coloca un numero postivo");
            }
        }while(valor<0);

        return valor;
    }
    
     private static boolean mayorEdad(int edad) {
         
         if(edad >=18){
             
             return true;
             
         }else {
             
             return false;
             
         }
         
        
         
     }
    
}
