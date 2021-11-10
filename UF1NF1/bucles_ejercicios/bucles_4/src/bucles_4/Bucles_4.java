/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num,cont;
        Scanner sc=new Scanner(System.in);
        System.out.println("coloca el numero donde finalizara el programa");
        cont = sc.nextInt();
        
        if(cont>=0){
            for (num = 0; num <= cont ; num++) {
                    System.out.println("numero " + num);
            }
        }
        else {
            System.out.println("coloca un numero postivo porfavor");
        }

        
    }
    
}
