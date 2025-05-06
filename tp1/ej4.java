package tp1;
/*
 * Escribir un programa que permita ingresar 5 números de a uno por
 * vez y que los muestre por pantalla en orden inverso:
 * Ejemplo: Ingreso: 23, 4, 2, 100, 3
 * Se debe mostrar: 3, 100, 2, 4, 23
 */

public class ej4 {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;

            System.out.println("La serie de 5 numeros enteros que ingrese será invertido");

            System.out.println("Ingrese el primer numero: ");
            num1 = Utils.leerInt();

            System.out.println("Ingrese el segundo numero: ");
            num2 = Utils.leerInt();

            System.out.println("Ingrese el tercer numero: ");
            num3 = Utils.leerInt();

            System.out.println("Ingrese el cuatro numero: ");
            num4 = Utils.leerInt();

            System.out.println("Ingrese el quinto numero: ");
            num5 = Utils.leerInt();
            
            System.out.println("Tu secuencia de numeros invertida es: " + num5 + " " + num4 + " " + num3 + " " + num2 + " " + num1);
    }
}