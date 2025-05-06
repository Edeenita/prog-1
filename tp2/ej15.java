/*
 * Pedir por consola el ingreso de números enteros. Cuando se
 * ingrese un 0 se debe terminar el programa informando el
 * promedio de los números ingresados, cuál fue el mayor número y
 * cuál fue el menor número.
 */


public class ej15 {
    public static void main(String[] args) {
        int num = 0; 
        int total = 0;
        int contador = 0;
        int promedio;
        int MAX = 2147483647; //valor maximo que toma un int
        int MIN = 0;

            while (num != 0) {
                if (num != 0) {
                    total = num + total;
                    contador++;
                        if (num > MIN) {
                            MIN = num;
                        }
                        if (num < MAX) {
                            MAX = num;
                        }
                    System.out.println("Ingrese números para realizar un promedio, inserte 0 para salir.");
                    num = Utils.leerInt();
                } 
            }
            
            if (contador > 0) {
                promedio = total / contador;
                System.out.println("El promedio es: " + promedio);
                System.out.println("El mayor número ingresado es: " + MAX);
                System.out.println("El menor número ingresado es: " + MIN);
            }
        } 
}
