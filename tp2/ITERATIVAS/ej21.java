package tp2.ITERATIVAS;


/* 
*   Pedir por consola un número entero e informar si es un número
*   primo. Un número es primo si solo es divisible por 1 y por sí
*   mismo.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej21 {
    public static void main(String[] args) {
        int num;
        int divisor;
        boolean es_primo; 
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un número entero diferente de 0");
            num = Integer.valueOf(entrada.readLine());
            while (num != 0) {
                es_primo = true;
                if (num <= 1 ) {
                    es_primo = false;
                } else{
                    divisor = 2;
                    while (divisor < num && es_primo) {
                        if (num % divisor == 0) {
                            es_primo = false; // Si encuentra un divisor el número no es primo
                        }
                        divisor++;
                    }
                }
                System.out.println(num + "/" + num + " es primo?: " + es_primo);
                System.out.println("Ingrese un número entero diferente de 0");
                num = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
