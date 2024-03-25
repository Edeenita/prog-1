package tp1.OPERADORES;
/*
 * Escribir un programa que permita el ingreso de un número entero
 * por teclado e imprima el cociente de la división de dicho número
 * por 2, 3, y 4. En base a los resultados obtenidos analice cada
 * caso si es correcto o no.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio9 {
    public static void main(String[] args) {
        int n1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero para obtener su cociende por 2, 3 y 4: ");
            n1 = Integer.valueOf(entrada.readLine());
            System.out.println("El cociente por 2 es: " + (n1/2));
            System.out.println("El cociente por 3 es: " + (n1/3));
            System.out.println("El cociente por 4 es: " + (n1/4));
            
            System.out.println("Ejemplo con double: ");
            double n2 = n1;
            System.out.println("El cociente por 2 es: " + (n2/2)+ "\nEl cociente por 3 es: " + (n2/3) + "\nEl cociente por 4 es: " + (n2/4));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
/*
 * División por 2: La división por 2 es correcta si el número ingresado es par,
 *  ya que un número par se puede dividir de manera exacta por 2 sin dejar resto. 
 * Si el número ingresado es impar, el cociente será un número decimal
 *  y habrá que utilizar double en vez de int.
 * 
 * División por 3: El resultado de la división de un número entero por 3 puede ser decimal, 
 * incluso si el número es divisible por 3. Por ejemplo, si el número ingresado es 6, 
 * el cociente es 2, pero si es 7, el cociente sería 2.3333... Así que, en este caso, 
 * el resultado puede ser correcto o incorrecto dependiendo del número ingresado.
 * 
 * División por 4: La división por 4 es correcta si el número ingresado es divisible exactamente por 4, 
 * es decir, si es un número par y divisible por 2. 
 * Si el número ingresado no es divisible por 4, el cociente será un número decimal
 */