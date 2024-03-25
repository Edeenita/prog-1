package tp1.OPERADORES;

/*
 * Escribir un programa que permita ingresar dos números enteros,
 * incremente el primero y decremente el segundo, para luego
 * mostrar por pantalla en ambos casos, el valor original y el
 * modificado.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio12 {
    public static void main(String[] args) {
        int n1, n2;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("El primer numero ingresado será incrementado: ");
            n1 = Integer.valueOf(entrada.readLine());
            System.out.println("El Segundo numero ingresado sera decremente: ");
            n2 = Integer.valueOf(entrada.readLine());
            System.out.println("Valor original del primer número: " + n1);
            System.out.println("Valor original del segundo número: " + n2);
            n1++;
            n2--;
            System.out.println("El primer número  ha incrementado a: " + n1);
            System.out.println("El segundo número  ha decrecido a: " + n2);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
/*
 * La diferencia entre i++ y ++i es que i++ primero devuelve el valor actual de i y luego incrementa i en 1,
 * mientras que ++i primero incrementa i en 1 y luego devuelve el valor actualizado de i.
 * int i = 5;
 * int a = i++; // a será igual a 5, luego i será igual a 6
 * 
 * int j = 5;
 * int b = ++j; // j será incrementado a 6 y luego b será igual a 6
 * 
 * int x = 5;
 * int c = x--; // c será igual a 5, luego x será igual a 4
 * 
 * int y = 5;
 * int d = --y; // y será decrementado a 4 y luego d será igual a 4
 */
