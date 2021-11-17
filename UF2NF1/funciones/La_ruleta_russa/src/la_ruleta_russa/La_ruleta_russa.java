/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package la_ruleta_russa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class La_ruleta_russa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int num=0,apuesta = 0, dinero_total=1000;
        int numeroApostado,numRuleta,premioCalculo, dineroActualizado;
        boolean resultado, volverJugar;
        dinero_total=miDinero(dinero_total);
        do{
            numRuleta=numRuleta(r);
            numeroApostado=pedirNum(num,sc);
            
            apuesta=dineroApostado(dinero_total, sc);
        
            resultado=Resultados(numeroApostado, numRuleta);
            System.out.println("El numero de la ruleta ha sido el "+numRuleta);
            
            if(resultado==true){
                System.out.println("Felicidades, has ganado");
            }else{
                System.out.println("Lo sentimos, has perdido");
            }
            
            premioCalculo=calcularPremio(numeroApostado, apuesta);
            dineroActualizado=actualizaDinero(dinero_total, premioCalculo, resultado);
            dinero_total=dineroActualizado;
            
            System.out.println("te queda un total de "+dineroActualizado);
        
            volverJugar=seguirJugando(dinero_total);
            
        }while(volverJugar!=false);
    }
    
    public static int numRuleta(Random r){
        int random=r.nextInt(37);
        
        return random;
    }
    
    public static int pedirNum(int num, Scanner sc){
        
        do{
            System.out.println("Coloca un numero del 0 al 38");
            num = sc.nextInt();
                if(num<0 || num>38){
                    System.out.println("Error");
                }
                
                if(num==38){
                    System.out.println("has escogido la casilla par");
                }else if(num==37){
                    System.out.println("has escogido la casilla impar");
                }
            
        }while(num<0 || num>38);
        return num;
    }
    
    public static int miDinero(int dinero_total) {
        return dinero_total=1000;
        
    }
    
    public static int dineroApostado(int dinero_total,Scanner sc){
        
        System.out.println(" El dinero total que tienes es de "+dinero_total+"€");
        int cantidadApostada;
        do{
            System.out.println("Cuanto queires apostar?");
            cantidadApostada=sc.nextInt();
            if(cantidadApostada<=0){
                System.out.println("coloca un valor positivo");
            }else if(cantidadApostada>dinero_total){
                System.out.println("has  pasado el dinero total que tienes");
            }
        }while(cantidadApostada<=0 ||cantidadApostada>dinero_total);
        return cantidadApostada;
    }
    
    public static boolean Resultados(int numApostado, int numRuleta){
        
        boolean ganado=false;
        
        if(numApostado==numRuleta){
            ganado=true;
        }else if(numApostado==38){
            if(numRuleta%2==0) {
                ganado=true;
            }
        }else if(numApostado==37){
            if(numRuleta%2==1){
                ganado=true;
            }
        }
        return ganado;
    } 
    
    public static int calcularPremio(int numeroApostado, int cantidad){
        int premio;
        
        if(numeroApostado==37 || numeroApostado==38){
            premio=cantidad*2;
        }else {
            premio=cantidad * 36;
        }
        
        return premio;
    }
    
    public static int actualizaDinero(int dinero_total, int dinero_premio, boolean ganado){
        if(ganado){
            dinero_total = dinero_total+dinero_premio;
        }
        else {
            dinero_total= dinero_total- dinero_premio;
        }
        
        
        return dinero_total;
    }
    
    public static boolean seguirJugando(int dinero_total){
       char respuesta;
        if(dinero_total<=0){
            return false;
        }else
        {
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("quieres seguir jugando?(S/N)");
                respuesta =sc.nextLine().charAt(0);
            }while(respuesta!='s' && respuesta!='n' && respuesta!='S' && respuesta!='N');
            
            if(respuesta=='s' || respuesta=='S'){
                return true;
            }else{
                return false;
            }
        }
        
    }
    
}
