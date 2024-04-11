package tp2.ITERATIVAS;
/*
*   Escribir un programa que mientras el usuario ingrese un caracter
*   distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
*   si es carácter vocal minúscula.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej7 {
    public static void main(String[] args) {
        char caracter;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un caracter diferente de '*': ");
            caracter = entrada.readLine().charAt(0);
            while (caracter != '*') {
                switch (caracter) {
                    case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' : System.out.println(caracter + " es dígito"); break;
                    case 'a', 'e', 'i', 'o', 'u' : System.out.println(caracter + " es vocal minuscula"); break;
                    default: System.out.println(caracter + " no es vocal minúscula o no es dígito"); break;
                }
                System.out.println("Ingrese un caracter diferente de '*': ");
                caracter = entrada.readLine().charAt(0);
            }
            System.out.println("No ingresaste un caracter valido");
        } catch (Exception e) {
            System.out.println(e);
        }
        }
}
