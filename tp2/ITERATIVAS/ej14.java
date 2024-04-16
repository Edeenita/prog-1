package tp2.ITERATIVAS;
/* 
Pedir por consola el ingreso de 10 números enteros positivos.
Contar cuántas veces se ingresaron números pares y mostrarlo
por pantalla.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej14 {
    public static void main(String[] args) {
        int num;
        int MAX = 10;
        int contador = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
                for(int i = 0; i < MAX; i++){
                    System.out.println("Ingrese un número entero positivo:");
                    num = Integer.parseInt(entrada.readLine());
                    if (num % 2 == 0 && num >=0) {
                        contador++;
                    }
                }
            System.out.println("Se ingresaron: " + contador + " enteros pares positivos");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
