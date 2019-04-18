/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laboratorio1;

import java.util.Scanner;


/**
 *
 * @author Usuario iTC
 */
public class Laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /* problema 1 
      Se desea realizar un programa que permita calcular el valor mensaual 
      a pagar  a un trabajador; así como también el valor de su descuento 
      al Seguro Social (10% del total a pagar). El sueldo mensual del 
      trabajador se obtiene mediante una multiplicación simple entre el número 
      de horas (100), por el costo hora oficial
    */
    Scanner teclado = new Scanner(System.in); 
    double sueldo;
    double descuento;
    int hora;
    
// Tanto el sueldo como hora son variables que nesito ingresar por teclado
    
    System.out.println("Bienvenido comprobante de sueldo de Andes S.A"
             + "\npor favor ingrese sus la cantidad de horas trabajadas");
    
    sueldo = teclado.nextDouble();
    
        System.out.println("Por favor ingrese el valor monetario por hora");
    
    hora = teclado.nextByte();

//Uso nextByte debido aque la cantidad de meaximas horas trabajadas es de 180 

    sueldo = sueldo*hora;
    descuento = sueldo*0.10; // 
    sueldo = sueldo - descuento;
    
        System.out.printf("estimado usuario su salario mensual es de $ %.2f \n "
                + " su aporte al seguro Social es de $ %.2f", sueldo, descuento);
        
    }
   
}
