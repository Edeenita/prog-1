/*
Se tiene una matriz de enteros de tamaño 4*20 de secuencias de
números entre 1 y 9 (por cada fila), separadas por 0. La matriz
está precargada, y además cada fila empieza y termina con uno o
más separadores 0. Además, se tiene una matriz de caracteres de
tamaño 4*20 de secuencias de caracteres letras minúsculas entre
‘a’ y ‘z’ (por cada fila), separadas por ‘ ’ (espacios). La matriz está
precargada, y además cada fila empieza y termina con uno o más
separadores ‘ ’. Considere para los siguientes ejercicios estos dos
tipos de matriz
10. Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada, permita obtener a través de
métodos la posición de inicio y la posición de fin de la secuencia
ubicada a partir de una posición entera y una fila, ambas
ingresadas por el usuario. Finalmente, si existen imprima por
pantalla ambas posiciones obtenidas.
 */
public class ej10 {
    final static int FILAS = 4;
    final static int COLUMNAS = 20; 
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[][] matriz = {
            {0, 1, 2, 0, 3, 4, 0, 5, 6, 0, 7, 8, 0},
            {0, 1, 2, 0, 3, 4, 0, 5, 6, 0},
            {0, 1, 2, 0},
            {0, 1}
        };
        
        resolver(matriz);
    }

    public static void resolver(int[][] matriz) {
        int fila = 0; // Fila ingresada por el usuario
        int posicion = 3; // Posición ingresada por el usuario

        if (fila >= 0 && fila < FILAS && posicion >= 0 && posicion < COLUMNAS) {
            int inicio = buscarInicio(matriz[fila], posicion);
            int fin = buscarFin(matriz[fila], inicio);

            System.out.println("Inicio: " + inicio + ", Fin: " + fin);
        }
    }
    public static int buscarInicio(int[] arr, int pos) {
        while (pos < COLUMNAS && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < COLUMNAS && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }
}
