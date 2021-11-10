/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_descuento_if;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_descuento_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double DIneroGastado, descuento = 0, gastoFinal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("coloca el sueldo que ganas actualmente");
        DIneroGastado = sc.nextDouble();

        if ((DIneroGastado < 800) && (DIneroGastado >= 0)) {
            descuento = DIneroGastado * 0 / 100;
        } else if ((DIneroGastado >=800)&&(DIneroGastado < 1500)) {
            descuento = DIneroGastado * 6 / 100;
        } else if ((DIneroGastado >=1500)&&(DIneroGastado < 3000)) {
            descuento = DIneroGastado * 8 / 100;
        } else if (DIneroGastado >= 3000) {
            descuento = DIneroGastado * 10 / 100;
        } else {
            System.out.println("coloca un valor mayor a 0");
        }
        gastoFinal = DIneroGastado - descuento;
        System.out.println("tu sueldo pasaria de " + DIneroGastado + "€ a " 
                + gastoFinal + "€");
        
    }
    
}
