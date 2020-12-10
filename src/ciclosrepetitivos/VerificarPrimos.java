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
public class VerificarPrimos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaración e inialización de variables
        int n, num, cont, divisor, i;
        n = 0; num = 0; cont = 1; divisor = 0; i = 1;
        
        //Entrada de datos
        System.out.println("Ingrese el límite de números a verificar:");
        n = leer.nextInt();
        
        //Crear el ciclo para verificar los numeros
        while(cont <= n){
            System.out.println("Ingrese el valor para verificar si es prímo");
            num = leer.nextInt();
            while(i <= num){
                if(num % i == 0){
                    divisor = divisor + 1;
                }
                i = i + 1;
            }
            if(divisor == 2){
                System.out.println("El numero : "+num+" es primo");
                System.out.println("------------");
            }
            else{
                System.out.println("El numero : "+num+" no es primo");
                System.out.println("------------");
            }
            //Termina de verificar y reinicia contadores
            cont = cont + 1;
            divisor = 0;
            i = 1;
        }
    }
}
