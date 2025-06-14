/*
Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario un número
entero y elimine todas las ocurrencia de número en la matriz si
existe. Mientras exista (en cada iteración tiene que buscar la
posición fila y columna) tendrá que usar dicha posición para
realizar un corrimiento a izquierda (quedarán tantas copias de la
última posición de cada fila como cantidad de ocurrencias del
número). Tener en cuenta, como se hizo en arreglos, si el
elemento a eliminar es el último de alguna fila de la matriz.
 */
public class ej06 {
    final static int FILAS = 5;
    final static int COLUMNAS = 10;
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5, 22, 7, 8, 9, 10},
            {11, 22, 13, 14, 15, 16, 17, 18, 22, 20},
            {21, 22, 23, 24, 25, 26, 27, 22, 22, 30},
            {31, 32, 33, 34, 35, 36, 22, 22, 22, 22},
            {22, 22, 22, 22, 22, 46, 47, 48, 49, 50}
        };
        
        eliminarNumero(matriz);
        printMatriz(matriz);
    }
    public static void eliminarNumero(int[][] matriz) {
        int numero = 22; 
        boolean eliminado = false;
        while (!eliminado) {
            eliminado = true; // suponemos que no hay 22 en la secuencia
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS; j++) {
                    if (matriz[i][j] == numero) {
                        corrimientoIzquierda(matriz[i], j);
                        eliminado = false; // si se encontro un 22 volvemos a buscar
                    }
                }
            }
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
}
