/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerrcicio.pkg10;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejerrcicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("que valor tendra n1");
        
        int num1= teclado.nextInt();
        System.out.println("que valor tendra n2 ");
        
        int num2= teclado.nextInt();
        int suma = num1+num2;
        int resta = num1-num2;
        int multi = num1*num2;
        
        
        System.out.println("la suma es " + suma);
        System.out.println("la resta es " + resta);
        System.out.println("la multiplicacion es " + multi);
        
        if ((num1 == 0)||(num2 == 0))
        {
            int divi = num1/num2;
            System.out.println("error a la hora de dividir");
        }
        else
        {
            int divi = num1/num2;
            System.out.println("la division es igual a " + divi);
        }
        
        
        
    }
    
}
