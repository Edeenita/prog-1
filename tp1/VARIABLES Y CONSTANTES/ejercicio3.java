/*
 * Escribir un programa que declare una constante de tipo int y pida el
 * ingreso de un valor por teclado. Luego muestre el valor ingresado.
 * ¿Qué pasa en este caso? ¿Se puede o surge algún problema?
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejercicio3 {
    public static void main(String[] args) {
        final int entero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero: ");
            entero = Integer.valueOf(entrada.readLine());
            System.out.println("Entero ingreso es: " + entero);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
/*
 * Estamos tratando de asignar un valor a una constante (final int entero;) 
 * después de solicitar la entrada por teclado al usuario
 * Esto causará un error de compilación, ya que las constantes en Java (declaradas con final)
 * deben inicializarse con un valor al momento de su declaración y no pueden ser modificadas posteriormente.
 */