/*
Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario un número
entero y una posición fila, columna. Con estos datos tendrá que
realizar un corrimiento a derecha (se pierde el último valor en
dicha fila) y colocar el número en la matriz en la posición fila,
columna indicada */
public class ej04 {
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
        resolver(matriz);
        printMatriz(matriz);
    }
    public static void resolver(int[][] matriz) {
        int numero = -1;
        int fila = 2;
        int columna = 6;

        if (fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS) { //mientras lo ingrese dentro de los rangos de la matriz
            corrimientoDerecha(matriz[fila], columna, numero);
        } else {
            System.out.println("Invalid position. Please enter a valid row and column.");
        }
    }
    public static void corrimientoDerecha(int[] fila, int columna, int numero) {
        for (int i = COLUMNAS - 1; i > columna; i--) {
            fila[i] = fila[i - 1];
        }
        fila[columna] = numero;
    }
    public static void printMatriz(int[][] matriz) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println();
        }
    }
}
