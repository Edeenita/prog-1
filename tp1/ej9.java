package tp1;
/*
 * Escribir un programa que permita el ingreso de un número entero
 * por teclado e imprima el cociente de la división de dicho número
 * por 2, 3, y 4. En base a los resultados obtenidos analice cada
 * caso si es correcto o no.
 */

public class ej9 {
    public static void main(String[] args) {
        int n1;
            System.out.println("Ingrese un numero para obtener su cociende por 2, 3 y 4: ");
            n1 = Utils.leerInt();
            System.out.println("El cociente por 2 es: " + (double) n1/2 );
            System.out.println("El cociente por 3 es: " + (double) n1/3 );
            System.out.println("El cociente por 4 es: " + (double) n1/4 );
    }    
}