package tp2.ITERATIVAS;

/* 
*   Escribir un programa que mientras el usuario ingrese un
*   carácter letra minúscula, se quede con la menor y la mayor letra
*   ingresada. Finalmente muestre por pantalla dichas letras.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej12 {
    public static void main(String[] args) {
        char MAX = 'a';
        char MIN = 'z';
        char letra;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("ingrese un caracter minuscula, mostrará por pantalla el más pequeño al finalizar!: ");
            letra = entrada.readLine().charAt(0);
            while (letra >= 'a' && letra <= 'z') {
                    if (letra < MIN) {
                        MIN = letra;
                    }
                    if (letra > MAX) {
                        MAX = letra;
                    }
                System.out.println("ingrese otro un caracter minuscula, si ingresa otro caracter finalizará!: ");
                letra = entrada.readLine().charAt(0);
            }
            System.out.println("La menor letra ingresada es: " + MIN);
            System.out.println("La mayor letra ingresada es: " + MAX);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
