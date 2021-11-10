/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_num_diferent;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_Num_diferent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int num, acumuladoSuma=0;
        
        boolean finalbucle = false;
        
//        do {
//           System.out.println("Indtroduce numeros (pon -1  para terminar ): ");
//            num=sc.nextInt(); 
//            if (num!=-1) //para que entre y lo sume
//            {
//                acumuladoSuma = acumuladoSuma + num;
//                System.out.println("el acumulado es " + acumuladoSuma);
//            }
//            else {
//                finalbucle=true;
//                
//            }
//        }
//        while (!finalbucle);
//        
//        System.out.println("El total de la suma es " + acumuladoSuma);
//        
        

//ejerciico sume numeros, hasta pasar 100
 do {
           System.out.println("Introduce numeros (Cuando acumulado sume 100"
                   + " parara ): ");
            num=sc.nextInt();
            if (num>0)
            {
              acumuladoSuma = acumuladoSuma + num;  
            }
            else{
                System.out.println("Numero negativo o 0, no suma");
            }
            
            
            System.out.println("el acumulado es " + acumuladoSuma);
            
            if (acumuladoSuma >=100) //para que entre y lo sume
            {
               finalbucle=true; 
            }
                
        }
        while (!finalbucle);
        
        System.out.println("El total de la suma es " + acumuladoSuma);
    }
    
}
