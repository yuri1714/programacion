/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horas_extras;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Horas_extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int horas_extra;
        double sueldo,dinero_extra = 0, dinero_total;
        int categoria;
        final int Preu_hora_categoria1 = 30;
        final int Preu_hora_categoria2 = 35;
        final int Preu_hora_categoria3= 40;
        final int Preu_hora_categoria4 = 0;
                
                
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu sueldo base");
        sueldo = sc.nextDouble();
        System.out.println("Cuantas horas extras has hecho");
        horas_extra = sc.nextInt();
        System.out.println("enq ue categoria estas");
        categoria = sc.nextInt();
        
        switch (categoria) {
            case 1:
                dinero_extra = horas_extra*Preu_hora_categoria1;
                break;
            case 2:
                dinero_extra = horas_extra*Preu_hora_categoria2;
                break;
            case 3:
                dinero_extra = horas_extra*Preu_hora_categoria3;
                break;
            case 4:
                dinero_extra = horas_extra*Preu_hora_categoria4;
                break;
            default:
                break;
        }
        
        dinero_total = (sueldo + dinero_extra);
        System.out.println("El sueldo que ganaras sera de " + dinero_total +"€");
        
        
    }
    
}
