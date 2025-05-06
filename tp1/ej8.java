package tp1;
/*
 * Escribir un programa que imprima por pantalla la tabla de verdad
 * para los operadores lógicos or y and (por separado) para dos
 * valores booleanos. Utilizar los operadores para calcular el
 * resultado. Por ejemplo, imprimir el siguiente caso para el operador
 * or:
 * false or true es: true
 * y se genera con:
 * System.out.println(“ false or true es: ” + (false || true));
 */

public class ej8 {
    public static void main(String[] args) {
        boolean verdadero = true;
        boolean falso = false;
        boolean verdadero2 = true;
        boolean falso2 = false; 
        System.out.println("True or true: " + (verdadero || verdadero2));
        System.out.println("True or false: " + (verdadero || falso));
        System.out.println("false or true: " + (falso || verdadero));
        System.out.println("false or false: " + (falso || falso2));
        System.out.println("\nTrue and true: "+ (verdadero && verdadero2));
        System.out.println("True and false: " + (verdadero && falso));
        System.out.println("false and true: " + (falso && verdadero));
        System.out.println("false and false: " + (falso && falso2));
    }
    
}
