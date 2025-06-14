/*
Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, invierta el orden del contenido
por fila. Este intercambio no se debe realizar de manera explícita,
hay que hacer un método que incluya una iteración de
intercambio
 */
public class ej01 {
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

        printMatriz(matriz);
        invertirFilas(matriz);
        System.out.println("--------------------");
        printMatriz(matriz);
    }

    public static void invertirFilas(int[][] m) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS / 2; j++) {
                int temp = m[i][j];
                m[i][j] = m[i][COLUMNAS - 1 - j];
                m[i][COLUMNAS - 1 - j] = temp;
                
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