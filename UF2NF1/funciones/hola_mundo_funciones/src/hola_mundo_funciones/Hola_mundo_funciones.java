/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola_mundo_funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Hola_mundo_funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 

        //Scanner sc = new Scanner(System.in);
        //sc.
        helloWord();
        String nombre = "alejandro López";
        helloWordNombre(nombre);
        int valor = 5;
        System.out.println("valor no clonado antes de la funcion valor= "+ valor);
        aumnetaEnDos(valor);
        System.out.println("valor no clonado despues de la funcion -> "+ valor);

    }

    /**
     * Fucion que muestra por pantalla HelloWord void no devuelve ningun valor
     * al main
     */
    public static void helloWord() {

        System.out.println("Hello word in funtions");

    }// Final helloWord

    /**
     * Escribira hello word acompañado del nombre
     *
     * @param nom es la variable que contiene el nombre
     */
    public static void helloWordNombre(String nom) {

        System.out.println("helloWord " + nom + ", how are you");

    }//final string nom
    
    /**
     * aumentara el valor pasado en dos
     * @param valor tendra el numero que me pasa desde el main
     */

    private static void aumnetaEnDos(int valor) {
        System.out.println("valor clonado antes de ningun cambio  valor="+ valor);
        valor =valor +2;
        System.out.println("valor clonado "+ valor);
        valor = valor*2;
        System.out.println("valor clonado multiplicado por dos valor= " + valor);
    }

}
