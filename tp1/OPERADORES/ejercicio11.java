package tp1.OPERADORES;

/*
 * Escribir un programa que permita el ingreso de un número entero
 * por teclado e imprima el resultado de determinar:
 * a. si es múltiplo de 6 y de 7,
 * b. si es mayor a 30 y múltiplo de 2, o es menor igual a 30,
 * c. si el cociente de la división de dicho número por 5 es mayor que 10.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio11 {
    public static void main(String[] args) {
        int num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingresar un numero");
            num = Integer.valueOf(entrada.readLine());
            if(num % 6 == 0 && num % 7 == 0){
                System.out.println(num+" es multiplo de 6 y 7");
            }else if (num > 30 && num % 2 == 0 || num <= 30) { 
                System.out.println(num + (" es mayor que 30 y multiplo de 2 o es menor o igual que 30")); 
            }else if (num / 5 > 10){ //siempre será falsa si previamente se ha comprobado que num es mayor que 30 o menor o igual que 30
                System.out.println(num + ( "%5 es mayor que 10"));
            }else {
                System.out.println("No cumple ninguna de las condiciones");
            }
            System.out.println("Otra forma de hacerlo:");
            boolean rta_a = num % 6 == 0 && num % 7 == 0;
            boolean rta_b = num > 30 && num % 2 == 0 || num <= 30;
            boolean rta_c = num / 5 > 10;
            System.out.println(num + " es múltiplo de 6 y de 7: " + rta_a);
            System.out.println(num + " es mayor a 30 y múltiplo de 2, o es menor igual a 30: " + rta_b);
            System.out.println( "el cociente de la división de dicho numero (" + num + ") por 5 es mayor que 10: " + rta_c) ;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
