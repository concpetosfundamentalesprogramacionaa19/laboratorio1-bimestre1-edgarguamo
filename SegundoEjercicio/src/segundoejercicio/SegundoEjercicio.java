/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoejercicio;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class SegundoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Ingresar por teclado las variables: x,y,z (solo se puede usar 
        nextLine())
        */
        // TODO code application logic here
    // Variables que serán llenadas por teclado
    String x;
    String y;
    String z;
    
    // Variables para convertir de cadena a double 
    
    double x1;
    double y1;
    double z1;
    double m;
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Bienvenido al precesador de ejercicio estatico");
        System.out.println("Por favor ingre la variable x");
        x = teclado.nextLine();
        x1 = Double.parseDouble(x);
        System.out.println("Por favor ingrese la variable y");
        y = teclado.nextLine();
        y1 = Double.parseDouble(y);
        System.out.println("Por favor ingrese la variable z");
        z = teclado.nextLine();
        z1 = Double.parseDouble(z);
       
        //Formula 
        m = (x1 + (y1/z1))/(x1-(y1/z1));
        
        System.out.printf(""
                + "el valor de m, en base a las variables: \n= %.2f "
                + "\n\ty = %.2f \n\t\tz = %.2f \n da como resultado "
                + "\n\t\t\tm = %.2f\n", x1, y1, z1, m);
        
        
        
    }
    
}
