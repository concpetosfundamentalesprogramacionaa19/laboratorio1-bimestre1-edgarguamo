/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecerejercicio;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class TecerEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Dadas tres notas de un estudiante (ingresar por teclado las notas,
         solo puede usar nextLine()), determinar el pase de año del mismo en 
        base al promedio de sus notas; si su promedio es mayor a 14, pasa el 
        año. use la forma expresionLogica / expresion_1 : expresion_2)
        */
        String nota1;
        double nota11;
        String nota2;
        double nota22;
        String nota3;
        double nota33;
        double promedio;
        String condicional;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido al sistema de notas del Colegio "
                + "a Salle\nPor favor ingrese la primera nota:");
        
        nota1 = teclado.nextLine();
        nota11 = Double.parseDouble(nota1); // Forma de transformar string a int
        
        System.out.println("Por favor ingrese la segunda nota:");
        nota2 = teclado.nextLine();
        nota22 = Double.parseDouble(nota2); // Forma de transformar string a int
        
        System.out.println("Por favor ingrese la tercera nota:");
        nota3 = teclado.nextLine();
        nota33 = Double.parseDouble(nota3); // Forma de transformar string a int
        
        promedio = (nota11+nota22+ nota33)/3;
        
        //Expresión lógica para determinar si el estudiante paso el año
        
        condicional = promedio > 14 ?"El estudiante aprobo":
                "El estudiante reprobo";
        
        System.out.printf("El promedio del estudiante es: %.2f por lo que %s\n",
                promedio, condicional);
        
        
        
    }
    
}
