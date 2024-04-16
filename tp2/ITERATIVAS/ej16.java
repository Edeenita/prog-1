package tp2.ITERATIVAS;

/*
*  Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
*   ‘a’ seguidas que se ingresaron.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ej16 {
    public static void main(String[] args) {
        char letra;
        int contador = 0;
        int MAX = 15;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for(int i = 0; i <= MAX; i++ ){
                System.out.println("Ingrese caracteres, al final se contaran la cantidad de 'a' ingresadas");
                letra = entrada.readLine().charAt(0);
                if (letra == 'a' && letra != 'A') {
                    contador++;
                }
            }
            System.out.println("Usted ha ingresado: " + contador + " veces 'a' ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
