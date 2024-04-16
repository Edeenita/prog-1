package tp2.ITERATIVAS;
/* 
*   Escribir un programa que mientras que el usuario ingrese un
*   caracter letra minúscula, pida ingresar un número entero. Si el
*   número ingresado está entre 1 y 5 inclusive deberá imprimir la
*   tabla de multiplicar de dicho número.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class ej13 {
    public static void main(String[] args) {
        char letra;
        int num;
        int MAX = 10;
        int MIN = 1;
        int resultado;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un caracter minúscula: ");
            letra = entrada.readLine().charAt(0);
            while (letra >= 'a' && letra <= 'z') {
                System.out.println("Ingresar un número entero entre 1 y 5 para ver si tabla de multiplicar.");
                num = Integer.valueOf(entrada.readLine());
                if (num >= 1 && num <= 5) {
                    for(int i = MIN; i <= MAX; i++){
                        resultado = num * i;
                        System.out.println(num + " * " + i + " = " + resultado );
                    }
                }
                System.out.println("Ingrese un caracter minúscula: ");
                letra = entrada.readLine().charAt(0);
            }
            System.out.println("Caracter invalido.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
