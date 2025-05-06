package tp1;
/*
 * Escribir un programa que permita ingresar dos números enteros,
 * incremente el primero y decremente el segundo, para luego
 * mostrar por pantalla en ambos casos, el valor original y el
 * modificado.
 */

public class ej12 {
    public static void main(String[] args) {
        int n1, n2;
            System.out.println("El primer numero ingresado será incrementado: ");
            n1 = Utils.leerInt();

            System.out.println("El Segundo numero ingresado sera decremente: ");
            n2 = Utils.leerInt();
            
            System.out.println("Valor original del primer número: " + n1);
            System.out.println("Valor original del segundo número: " + n2);
            n1++;
            n2--;
            System.out.println("El primer número  ha incrementado a: " + n1);
            System.out.println("El segundo número  ha decrecido a: " + n2);
    }
}
