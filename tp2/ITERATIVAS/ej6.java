package tp2.ITERATIVAS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
*   Escribir un programa que mientras el usuario ingrese un número
*   entero menor que 100 y mayor a 1, muestre por pantalla si el
*   número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
*   valores mencionados en el enunciado deberían ser constantes?.
*   De a poco habría que definirlos como constantes).
*/
public class ej6 {
    public static void main(String[] args) {
        final int max = 100;
        final int min = 1;
        int num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingresa un número menor que 100 y mayor que 1");
            num = Integer.valueOf(entrada.readLine());
            while (num >= min && num <= max) {
                if (num % 2 == 0 && num % 3 == 0) {
                    System.out.println(num + " es múltiplo de 2 y de 3 simultaneamenter");
                }else{
                    System.out.println(num + " no es múltiplo de 2 y de 3 simultaneamenter" );
                }
                System.out.println("Ingresa un número menor que 100 y mayor que 1");
                num = Integer.valueOf(entrada.readLine());
            }
            System.out.println("Numero invalido.");
        } catch (Exception e) {
                System.out.println(e);
        }
    }
}
