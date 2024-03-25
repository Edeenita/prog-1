package tp1.OPERADORES;

/*
 * Escribir un programa que permita el ingreso de dos números
 * enteros por teclado e imprima:
 * a. si el primero es mayor al segundo.
 * b. si ambos son múltiplos de 2.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio10 {
    public static void main(String[] args) {
        int n1, n2;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingresar el primer numero: ");
            n1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingresar el segundo numero: ");
            n2 = Integer.valueOf(entrada.readLine());
            boolean mayor = n1 > n2;
            boolean multiplo2 = n1 % 2 == 0 && n2 % 2 == 0;
            System.out.println("El primer numero es mayor al segundo: " + mayor);
            System.out.println("Ambos numeros son multiplos de 2: " + multiplo2);
        } catch (Exception e) {
            System.out.println(e);
        }


    }

}
