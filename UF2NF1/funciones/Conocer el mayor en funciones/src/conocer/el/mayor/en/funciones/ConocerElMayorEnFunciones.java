/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conocer.el.mayor.en.funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ConocerElMayorEnFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1,valor2;
        int mayor;
        System.out.println("pon un valor");
        valor1 = sc.nextInt();
        
        System.out.println("pon un segundo valor");
        valor2 = sc.nextInt();
        
        mayor = numeroMasGrande(valor1,valor2);
        
        System.out.println("El numero mayor es " + mayor);
        System.out.println("La vida es una caca :D");
  
    
    }  /**
     *
     * @param valor
     * @return
     */
    public static int numeroMasGrande(int valor1, int valor2){
        
        int mas = 0;
        
        if(valor1>valor2){
            
            mas = valor1;
            
        }else{
            mas =valor2;
        }
        return mas;
    }
        
        
        
    
}
