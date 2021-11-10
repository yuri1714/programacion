/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg16;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("agrega la nota que tienes");

        nota = sc.nextDouble();

        if ((nota >= 0) && (nota < 3)) 
        {
            System.out.println("tu notas es DEFICIENTE :'/");
        }
        else if ((nota >= 3) && (nota < 5))
        {
            System.out.println("tu notas es INSUFICIENTE :/");
        }
        else if ((nota >= 5) && (nota < 6)) 
        {
            System.out.println("tu notas esta BIEN :)");
        }
        else if ((nota >= 6) && (nota < 9)) 
        {
            System.out.println("tu notas es NOTABLE :D");
        }
        else if ((nota >= 9) && (nota <= 10))
        {
            System.out.println("tu notas es EXELENTE  :O");
        }
        else
        {
            System.out.println("coloca una opcion del 0.0 al 10 >:V");
        }
    }

}
