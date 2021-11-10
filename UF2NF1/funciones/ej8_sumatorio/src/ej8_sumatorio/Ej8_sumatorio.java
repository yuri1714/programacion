/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8_sumatorio;

/**
 *
 * @author alumne
 */
public class Ej8_sumatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero_maximo = 10;
        int resultado = sumalaN(numero_maximo);
        System.out.println("la suma de todos los numeros es " + resultado);
        resultado = productodelaN(numero_maximo);
        System.out.println("el producto de todos los numeros es "+ resultado);
        resultado = (int) intermediolaN(numero_maximo);
        System.out.println("el intermedio de todos los numero es  "+ resultado);
        
        
    }
    
    public static int sumalaN(int n)
    {
        int acumulado=0;
        for (int i = 1; i <= n; i++) {
            
            acumulado = acumulado+ i;
        }
        return acumulado;
    }
    
    public static int productodelaN(int numero_maximo)
    {
        int acumulado=1;
        for (int i = 1; i <= numero_maximo; i++) {
            
            acumulado = acumulado * i;
        }
        return acumulado;
    }
    
    public static double intermediolaN(int numero_maximo)
    {
        double mitad;
        mitad = numero_maximo/2;
        return mitad;
    }
}
