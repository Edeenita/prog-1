/*
Hacer un programa que dada una matriz de enteros de tamaño
4*5 que se encuentra precargada, solicite al usuario el ingreso de
una fila y dos números enteros (columnas de la matriz), y ordene
de forma creciente la matriz en la fila indicada entre las dos
posiciones columnas ingresadas
 */
public class ej09 {
    final static int FILAS = 4;
    final static int COLUMNAS = 5;
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 2, 3, 4, 1},
            {10, 7, 8, 9, 6},
            {15, 12, 13, 14, 11},
            {20, 17, 18, 19, 16}
        };

        ordenarFila(matriz);
        printMatriz(matriz);
    }
    public static void ordenarFila(int[][] matriz) {
        int fila = 0; 
        int colInicio = 0; 
        int colFin = 4; 

        if (fila >= 0 && fila < FILAS && colInicio >= 0 && colFin < COLUMNAS && colInicio < colFin) {
            ordenar(matriz[fila], colInicio, colFin);
        } else {
            System.out.println("Invalid input. Please enter valid row and column indices.");
        }
    }
    public static void ordenar(int[] fila, int colInicio, int colFin) {
        for (int i = colInicio; i < colFin; i++) {
            for (int j = i + 1; j <= colFin; j++) {
                if (fila[i] > fila[j]) {
                    int temp = fila[i];
                    fila[i] = fila[j];
                    fila[j] = temp;
                }
            }
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
