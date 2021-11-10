/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_10;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nota,contnota=0,media=0,Mfinal;
        boolean hubo10=false;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("coloca la nota de tus alumnos "
                    + "(coloca -1 para finalizar el priograma)");
            nota = sc.nextInt();
            
            if (nota==10){
                hubo10=true;
            }
            
            if((nota >=0)&&(nota<=10)){
                contnota =contnota + 1;  
            }
            
            if (nota>10){
                break;
            }
            
            if (nota!=-1 && nota<=10){
                media=media +nota;
            }
            
        }while(nota!=-1);
        
        System.out.println("hubo un total de "+ contnota+" notas");
        
        if(hubo10==true){
            System.out.println("hubo una o mas notas con valor 10");
        }else {
            System.out.println("no hubo notas con valor 10 ");
        }
        if (nota>10){
            System.out.println("el programacion finalizo porque "
                    + "existe un numero mayor a 10");
        }
        
        Mfinal= media/contnota;
        
        System.out.println("la nota media es " + Mfinal );
        
        
        
    }
    
}
