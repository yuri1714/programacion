/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int N1,N2;
        int suma,resta,multi;
        double divi;
        Scanner teclado = new Scanner(System.in);
        System.out.println("que dos numeros deseas utilizar");
        
        N1=teclado.nextInt();
        N2=teclado.nextInt();
        
        suma = N1+N2;
        resta = N1-N2;
        multi = N1*N2;
        divi = (double) N1/N2;
        
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicacion es " + multi);
        System.out.println("El resultado de la division es " + divi);
        
    }
    
}
