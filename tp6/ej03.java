/*
Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario una posición
fila, columna y realice un corrimiento a izquierda.
 */
public class ej03 {
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

        //hardcoded fila y columna
        // 0 ganas de usar Utils y de modularizar el código ⬇
        int fila = 2;
        int columna = 5;
        
        if (fila <= FILAS || columna <= COLUMNAS) {
            corrimientoIzquierda(matriz[fila], columna);
            printMatriz(matriz);
        } else {
            System.out.println("Invalid position. Please enter a valid row and column.");
        }
    }
    public static void corrimientoIzquierda(int[] fila, int columna) {
        for (int i = columna; i < COLUMNAS - 1; i++) {
            fila[i] = fila[i + 1];
        }
        fila[COLUMNAS - 1] = -1;
    }

    public static void printMatriz(int[][] matriz) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println();
        }
    }
    public static void printMatriz(int[] fila) {
        for (int j = 0; j < COLUMNAS; j++) {
            System.out.print("|" + fila[j] + "|");
        }
        System.out.println();
    }
}
