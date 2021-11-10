/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones_valores;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Funciones_valores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ValorDoble,ValorTriple;
        System.out.println("pon un valor y lo doblare por 2, luego el resultado lo multiplicare por 3");
        int numero = sc.nextInt();
        ValorDoble = doblarNumero(numero);
        System.out.println("numero "+ numero + " valorDoble "+ ValorDoble);
        //numero = numero *3;
        ValorTriple =triplicarNumero(ValorDoble);
        System.out.println("numero "+ ValorDoble + " valor triple "+ ValorTriple);
        System.out.println("el resultado es "+ ValorTriple);
        
        
    }
    /**
     * esta funcion multiplica el valor pedido a la persona por dos
     * @param valor trendra el numero qe pida en la main
     * @return es el valor que devuelve a la main
     */

    public static int doblarNumero(int valor){
        
        int doble = valor*2;
        return doble;
    }
    
    
    /**
     * esta funcion multiplica el valor pedido a la persona por 3
     * @param valor trendra el numero que pida en la main
     * @return el triple del valor de entrada
     */
    public static int triplicarNumero(int valor){
        
        int triple = valor*3;
        return triple;
    }
    
}
