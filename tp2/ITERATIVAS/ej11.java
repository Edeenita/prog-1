package tp2.ITERATIVAS;
/* 
*   Escribir un programa que mientras el usuario ingrese un
*   caracter letra minúscula, acumule la cantidad de vocales que
*   ingresó. Finalmente muestre por pantalla dicha cantidad.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej11 {
    public static void main(String[] args) {
        char caracter = ' ';
        int sumador = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un caracter vocales para saber cuantas ingreso");
            caracter = entrada.readLine().charAt(0);
            while (caracter >= 'a' && caracter <= 'z') {
                    if ( (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')) {
                        sumador++;
                    }
                    System.out.println("Ingrese un caracter vocales para saber cuantas ingreso");
                    caracter = entrada.readLine().charAt(0);
            }
            System.out.println("El resultado final es: " + sumador + " vocales.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

