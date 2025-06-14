/*
Hacer un programa que dada una matriz de enteros ordenada
creciente por filas de tamaño 4*5 que se encuentra precargada,
solicite al usuario un número entero y una fila, y luego inserte el
número en la matriz en la fila indicada manteniendo su orden.
 */
public class ej07 {
    final static int FILAS = 4;
    final static int COLUMNAS = 5;
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };

        insertarNumero(matriz);
        printMatriz(matriz);
    }
    public static void insertarNumero(int[][] matriz) {
        int numero = 13;
        int fila = 2; 

        if (fila >= 0 && fila < FILAS) {
            int[] filaSeleccionada = matriz[fila];
            int posicion = encontrarPosicion(filaSeleccionada, numero);
            corrimientoDerecha(filaSeleccionada, posicion);
            filaSeleccionada[posicion] = numero;
        } else {
            System.out.println("Fila inválida. Por favor, ingrese una fila válida.");
        }
    }
        public static int encontrarPosicion(int[] fila, int numero) {
        int posicion = COLUMNAS - 1;
        for (int i = 0; i < COLUMNAS; i++) {
            if (fila[i] > numero && posicion == COLUMNAS - 1) {
                posicion = i;
            }
        }
        return posicion;
    }
    public static void corrimientoDerecha(int[] fila, int posicion) {
        for (int i = COLUMNAS - 1; i > posicion; i--) {
            fila[i] = fila[i - 1];
        }
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
