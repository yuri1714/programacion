/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivo_negativo_cero;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Positivo_negativo_cero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor1, resultado;
        
        System.out.println("coloca un numero (el resultado dara -1 si es negativo,"
                + " 0 si es igual a 0 y 1 si es positivo)");
        valor1 = sc.nextInt();
        
        resultado = dimeSigno(valor1);
        
        System.out.println("el resultado es " + resultado);
        
        
    }

    private static int dimeSigno(int valor1) {
        
        int resultado;
        
        if(valor1>0){
            
            resultado = 1;
            
        }else if(valor1 == 0) {
            resultado = 0;
        }else {
            resultado = -1;
        }
        
        return resultado;
    }
    
}
