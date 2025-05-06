package tp1;
/*
 * Escribir un programa que permita el ingreso de dos números
 * enteros por teclado e imprima:
 * a. si el primero es mayor al segundo.
 * b. si ambos son múltiplos de 2.
 */

public class ej10 {
    public static void main(String[] args) {
        int n1, n2;

            System.out.println("Ingresar el primer numero: ");
            n1 = Utils.leerInt();

            System.out.println("Ingresar el segundo numero: ");
            n2 = Utils.leerInt();

            boolean mayor = n1 > n2;
            boolean multiplo2 = n1 % 2 == 0 && n2 % 2 == 0;
            
            System.out.println("El primer numero es mayor al segundo: " + mayor);   
            System.out.println("Ambos numeros son multiplos de 2: " + multiplo2);
    }
}

