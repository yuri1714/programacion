/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area_perimetro;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Area_perimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double ancho, alto, area, perimetro;
        
        System.out.println("coloca el alto del rectangulo");
        alto = sc.nextDouble();
        System.out.println("coloca el ancho del rectangulo");
        ancho = sc.nextDouble();
        
        area = areaRectangulo(alto, ancho);
        
        System.out.println("El area del rectangulo es: "+ area);
        
        perimetro = perimetroRectangulo(alto, ancho);
        
        System.out.println("el perimetro del rectangulo es: "+ perimetro);
        
    }

    public static double areaRectangulo(double alto, double ancho) {
        
        double total;
        
        total = alto * ancho;
        
        return total;
    }

    public static double perimetroRectangulo(double alto, double ancho) {
        
        
        double total;
        
        total = alto + ancho;
        
        return total;
        
    }
    
}
