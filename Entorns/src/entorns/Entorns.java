/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entorns;

import java.util.Scanner;

/**
 *
 * @author jde7989
 */
public class Entorns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int tipo_entrada= sc.nextInt();
       int edad = sc.nextInt();
       boolean hola = true;
       
       
    }

    /**
     *
     * @param tipo_entrada
     * @param edad
     * @return
     */
    public double calculateTicketPrice(int tipo_entrada, int edad) {
       double precio = 0;
       if(tipo_entrada==1){
           if(edad<=4){
               precio=0;
           }
           else if(edad>=4 && edad<=12){
               double descuento = 0.25*60;
                precio=60-descuento;
            }
            else if(edad>=12 && edad<=60){
                precio = 60;
            } 
       } 
       
       return precio;
    }
    
}
