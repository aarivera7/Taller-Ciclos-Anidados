/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosrepetitivos;
import java.util.Scanner;
/**
 *
 * @author adria
 */
public class CiclosRepetitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int cont, limite, suma;
        cont = 1; limite = 0; suma = 0;
        
        //Pedir que se ingrese el limite de los numeros
        System.out.println("Ingrese la cantidad de numeros que quiere que se imprima.");
        limite = leer.nextInt();System.out.println("");
        
        //Iniciamos el ciclo repetitivo While 
        while (cont <= limite){
            System.out.println(cont);
            suma = suma + cont;
            cont = cont + 1;
        }
        System.out.println("\nLa suma de los números es: "+suma);
    }
    
}
