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
public class VerificarNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Decalarar e inicializar variables
        int cont, n, num, sumPar, sumImpar, sumNeg, sumPos;
        cont = 1; n = 1; num = 0; sumPar = 0; sumImpar = 0; sumNeg = 0; sumPos = 0;
        
        //Ingresar los datos de entrada: límite
        System.out.println("Ingrese el límite de números a verificar");
        n = leer.nextInt();
        
        //Crear el ciclo para verificar los numeros
        while (cont <= n){
            System.out.println("\nIngrese el número a verificar");
            num = leer.nextInt();
            
            if (num % 2 == 0){  //Verificar si es par o impar
                sumPar = sumPar + num;  //Suma los pares
            } 
            else {
                sumImpar = sumImpar + num;  //Suma los impares
            }
            if (num > 0){ //Verificar si es positivo o negativo
                sumPos = sumPos + num;  //Suma los positivos
            }
            else{
                sumNeg = sumNeg + num; //Suma los negativos
            }
            cont = cont + 1;
            System.out.println("La suma de los pares: "+sumPar);
            System.out.println("La suma de los impares: "+sumImpar);
            System.out.println("La suma de los positivos: "+sumPos);
            System.out.println("La suma de los negativos: "+sumNeg);

        }
        System.out.println("\nSumas totales\n");
        System.out.println("La suma de los pares: "+sumPar);
        System.out.println("La suma de los impares: "+sumImpar);
        System.out.println("La suma de los positivos: "+sumPos);
        System.out.println("La suma de los negativos: "+sumNeg);
    }
}
