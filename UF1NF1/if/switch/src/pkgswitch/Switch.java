/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion;
        final int jugar_nueva_partida = 1; 
        final int Cargar_partida = 2;
        final int Ver_Records= 3;
        final int salir = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1-nueva partida");
        System.out.println("2-cargar partida");
        System.out.println("3-records");
        System.out.println("0-salir");
        System.out.println("escoje una opcion entre 1,2,3,0");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Comenzando nueva partida");
                break;
            case 2:
                System.out.println(" Cargando ultima partida");
                break;
            case 3:
                System.out.println("Cargando records");
                break;
            case 0:
                System.out.println("Ha escogido salir del juego");
                break;
            default:
                System.out.println("error a la hora de escoger opcion. Intentelo"
                        + " de nuevo :/");
                break;
        }
        
    }
    
}
