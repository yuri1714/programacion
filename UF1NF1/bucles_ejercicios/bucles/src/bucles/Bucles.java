/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        
        for (num = 0; num < 6; num++) {
            System.out.println("numero " + num);
            
        }
        //while
        System.out.println("el del white");
        num = 0;
        while (num <=5)
        {
            System.out.println("numero " + num);
            num = num+1;
        }
        //do while
        System.out.println("el del Do_white");
        num =0;
        do {
            System.out.println("numero " + num);
            num++;
        }while(num<6);
        
        
    }
    
}
