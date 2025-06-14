/*
Se tiene una matriz de enteros de tamaño 4*20 de secuencias de
números entre 1 y 9 (por cada fila), separadas por 0. La matriz
está precargada, y además cada fila empieza y termina con uno o
más separadores 0. Además, se tiene una matriz de caracteres de
tamaño 4*20 de secuencias de caracteres letras minúsculas entre
‘a’ y ‘z’ (por cada fila), separadas por ‘ ’ (espacios). La matriz está
precargada, y además cada fila empieza y termina con uno o más
separadores ‘ ’. Considere para los siguientes ejercicios estos dos
tipos de matriz.

11. Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada permita encontrar por cada fila la
posición de inicio y fin de la secuencia cuya suma de valores sea
mayor
 */
public class ej11 {
    final static int FILAS = 4;
    final static int COLUMNAS = 20;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[][] matriz = {
            {0, 1, 2, 0, 3, 4, 0, 53, 6, 0, 7, 8, 0},
            {0, 1, 2, 0, 3, 44, 0, 5, 6, 0, 7, 8, 0},
            {0, 1, 22, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0},
            {0, 10, 2, 0, 3, 4, 0, 5, 6, 0, 0, 0, 0}
        };
        
        encontrarSecuenciaMayor(matriz);
    }
    public static void encontrarSecuenciaMayor(int[][] matriz) {
        for (int i = 0; i < FILAS; i++) {
            int ini = -1;
            int fin = -1;
            int sumMax = 0;
            int sumActual = 0;
            int iniActual = -1;

            for (int j = 0; j < COLUMNAS; j++) { // recorremos las columnas de la fila actual
                if (matriz[i][j] != SEPARADOR) { // si encontramos un número distinto del separador 
                    if (iniActual == -1) { // y si no estamos en una secuencia
                        iniActual = j; // Inicio de la secuencia
                    }
                    sumActual += matriz[i][j]; // sumamos el valor actual
                } else { // cuando encontramos un separador
                    if (iniActual != -1) { // si estabamos en una secuencia
                        if (sumActual > sumMax) { // verificamos si es la mayor
                            sumMax = sumActual;
                            ini = iniActual;
                            fin = j - 1;
                        }
                        sumActual = 0; // reiniciamos la suma
                        iniActual = -1; // reiniciamos el inicio actual
                    }
                }
            }
            if (iniActual != -1 && sumActual > sumMax) { // verificamos si la última secuencia es la mayor
                ini = iniActual;
                fin = COLUMNAS - 1;
            }

            System.out.println("Fila " + i + ": Inicio: " + ini + ", Fin: " + fin + ", Suma: " + sumMax);
        }
    }
}
