/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_jenkins;
import java.util.Scanner;
/**
 *
 * @author Marco
 */
public class Prueba_Jenkins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner sc = new Scanner(System.in);
       String nombre; 
       int n,celular;
       System.out.println("Ingrese su nombre:");
        nombre=sc.next();
        System.out.println("Ingrese su edad:");
        n=sc.nextInt();
        System.out.println("Ingrese celular");    
        celular=sc.nextInt();
    }
    
}
