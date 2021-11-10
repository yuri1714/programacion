/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recoger_letra_x_teclado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Recoger_letra_X_teclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eres mayor de edad?(s/n)");
        char mayorEdad;
        int dinero;
        //recoge la frase que pongas pero devuelve la
        //letra que esta en la primera posicion
        
        
        mayorEdad = teclado.nextLine().charAt(0);
        System.out.println("Has escogido " + mayorEdad);
        System.out.println("Cuanto dinero tienes, pon solo euros sin centimos");
        dinero = teclado.nextInt();
        // OR es || (Alt gr + 1)
        // AND es && (Mayus + 6)
                
           
        if(((mayorEdad=='s') || (mayorEdad== 'S')) && (dinero>= 10))
        {
        System.out.println("porque el tomate no toma cafe");
        System.out.println("porque toma te :D");  
        }
        else if((mayorEdad=='n') || (mayorEdad== 'N'))
        {
        System.out.println("Que hace un piojo en la cabeza de un calvo");
        System.out.println("patinar sobre hielo :D"); 
        }
        else 
        {
        System.out.println("Animal, tienes que colocar s/n"
        + " y tener mas de 10 >:V");
        }
    }
    
}
