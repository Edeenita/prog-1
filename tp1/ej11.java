package tp1;
/*
 * Escribir un programa que permita el ingreso de un número entero
 * por teclado e imprima el resultado de determinar:
 * a. si es múltiplo de 6 y de 7,
 * b. si es mayor a 30 y múltiplo de 2, o es menor igual a 30,
 * c. si el cociente de la división de dicho número por 5 es mayor que 10.
 */

public class ej11 {
    public static void main(String[] args) {
        int num;
            System.out.println("Ingresar un numero");
            num = Utils.leerInt();
            boolean rta_a = num % 6 == 0 && num % 7 == 0;
            boolean rta_b = num > 30 && num % 2 == 0 || num <= 30;
            boolean rta_c = num / 5 > 10;
            System.out.println(num + " es múltiplo de 6 y de 7: " + rta_a);
            System.out.println(num + " es mayor a 30 y múltiplo de 2, o es menor igual a 30: " + rta_b);
            System.out.println( "el cociente de la división de dicho numero (" + num + ") por 5 es mayor que 10: " + rta_c) ;
    }
}
