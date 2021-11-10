/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10_meses;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej10_meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mes, dia, año;
        
        boolean respuesta = false;
        
        System.out.println("coloca un mes (entre 1 y 12)");
        mes = sc.nextInt();
        System.out.println("coloca un dia (entre 1 y 30)");
        dia = sc.nextInt();
        System.out.println("coloca un año (mayor que 1900)");
        año = sc.nextInt();
        
        respuesta=fechaCorrecta(mes, dia, año, respuesta);
        
        System.out.println("la fecha es " + respuesta);
        
    }
    
    public static boolean fechaCorrecta(int mes, int dia, int año, boolean si)
    {
        boolean correcto = true;
        
        if(dia >30 || dia<1){
            
            correcto = false;
            
        }else if(mes >12 || mes<1){
            
            correcto = false;
            
        }else if( año < 1900){
            correcto = false;
        }
        
        return correcto;
    }
    
}
