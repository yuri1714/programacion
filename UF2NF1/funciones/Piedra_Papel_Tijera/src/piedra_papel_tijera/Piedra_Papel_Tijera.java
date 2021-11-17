/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedra_papel_tijera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Piedra_Papel_Tijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int num=0, eleccionOrdenador,eleccionUsuario,resultado, contador;
       boolean seguir;
               
       eleccionOrdenador=maquina(r);
       
       menu();
       eleccionUsuario=jugador(num,sc);
      
       resultado=resultado(eleccionUsuario, eleccionOrdenador);
       
        contador= contador(5);
        
        mostrarJugada(eleccionOrdenador,eleccionUsuario,resultado);
       
       
//        seguir=segirJugando();
 
        
        
    }
    
    public static void menu() {
        
        System.out.println("Escoje entre las siguientes opciones:");
        System.out.println("PIEDRA(1)");
        System.out.println("PAPEL(2)");
        System.out.println("TIJERA(3)");
    
}
    
    public static int maquina(Random r) {
        int tiradaOrdenador;
        tiradaOrdenador=r.nextInt(3)+1;
        
        switch (tiradaOrdenador){
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 3;
    
            }
        }
    
    public static int jugador(int tiradaUsuario, Scanner sc) {
        do {  
            tiradaUsuario=sc.nextInt();
            if(tiradaUsuario<1 && tiradaUsuario>3)
                {
                    System.out.println("Error. Coloca un valor del 1 al 3");
                }

        } while (tiradaUsuario>1 && tiradaUsuario<3 && tiradaUsuario!=2);
        
        return tiradaUsuario; 
    }
    
    public static int resultado(int jugador, int maquina) {
        
        if((maquina == 1 && jugador ==3) || (maquina==2 && jugador==1)||(maquina==3 && jugador==2))
        {
            return -1;
            
        }else if((maquina == 1 && jugador ==2) || (maquina==2 && jugador==3)||(maquina==3 && jugador==1))
        {
            return 1;
        }else{
            return 0;
        }
    }
    
    public static int contador(int cont) {
        cont =cont +1;
        
        return cont;
    }
    
    public static void mostrarJugada(int eleccionUsuario, int eleccionOrdenador, int resultado){
        
        switch (eleccionOrdenador) {
            case 1:
                System.out.println("la maquina saco PIEDRA");
                break;
            case 2:
                System.out.println("la maquina saco PAPEL");
                break;
            case 3:
                System.out.println("la maquina saco TIJERA");
                break;
            default:
                break;
        }
        
        switch (eleccionUsuario) {
            case 1:
                System.out.println("has escogido PIEDRA");
                break;
            case 2:
                System.out.println("Has escogido PAPEL");
                break;
            case 3:
                System.out.println("Has escogido TIJERA");
                break;
            default:
                System.out.println("Error. Coloca un numero entre 1 y 3");
                break;
        }
               
        switch (resultado) {
            case -1:
                System.out.println("El ganador es la maquina");
                break;
            case 0:
                System.out.println("Empate tecnico :v");
                break;
            case 1:
                System.out.println("El ganador es la maquina");
                break;
            default:
                break;
        }
        
    }
    
    public static boolean segirJugando(int contM, int contJ){
        boolean jugar=true;
        
        if(contM>=5)
        {
            jugar =false;
        }else if(contJ>=5)
        {
            jugar=false;
        }
        
        return jugar;
    }
    
}
