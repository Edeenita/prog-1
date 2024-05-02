package tp3.modularizacion;

/*
 * Escribir un programa que imprima por pantalla los números
 * perfectos que existen entre 2 y 10000. Un número perfecto es
 * aquel cuya suma de sus divisores (excepto sí mismo) es igual al
 * propio número. Ejemplo: 6 es un número perfecto dado que sus
 * divisores (excepto sí mismo) son 1, 2 y 3 cuya suma da 6. En
 * cambio 12, no es un número perfecto dado que sus divisores
 * (excepto sí mismo) 1, 2, 3, 4 y 6 cuya suma es 16.
 */

public class ej18 {
    public static void main(String[] args) {
        try {
            busquedaNumPerfecto();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void busquedaNumPerfecto (){
        final int MAX = 10000;
        System.out.println("Números perfectos entre 2 y 10000:");
        for (int i = 2; i <= MAX; i++){
            if (esNumeroPerfecto(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean esNumeroPerfecto(int num) {
        int sumaDivisores = 1; 
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sumaDivisores += i;
                if (i != num / i) { 
                    sumaDivisores += num / i;
                }
            }
        }
        return sumaDivisores == num;
    }
}
