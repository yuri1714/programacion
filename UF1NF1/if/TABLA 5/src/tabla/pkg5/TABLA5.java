/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabla.pkg5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class TABLA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,tabla,multi;
        Scanner sc = new Scanner (System.in);
        System.out.println("coloca una tabla de multiplicar");
        tabla = sc.nextInt();
        
        for (num = 1; num <= 10; num++) {
                multi = tabla*num;
               System.out.println(tabla +"*"+ num + "=" + multi); 
            }
        
        //white
        System.out.println("el del white");
        num = 1;
        
        while (num <=10)
        {
            multi = tabla*num;
            System.out.println(tabla + "*" + num + "=" + multi);
            num = num+1;
        }
        
        //do while
        System.out.println("el del Do_white");
        num =1;
        do {
            multi = tabla*num;
            System.out.println(tabla + "*" + num + "=" + multi);
            num++;
        }while(num<=10);
            
    }
}
