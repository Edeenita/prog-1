/*
Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, obtenga la cantidad de
números pares que tiene y la imprima.
 */
public class ej02 {
    final static int FILAS = 5;
    final static int COLUMNAS = 10;
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 45, 46, 47, 48, 49, 50}
        };

        int cantPares = contarPares(matriz);
        System.out.println("Cantidad de números pares: " + cantPares);
    }
    public static int contarPares(int[][] m) {
        int contador = 0;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (m[i][j] % 2 == 0) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
