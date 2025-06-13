/*
Dado un arreglo de caracteres, determinar si en el arreglo existe al
menos una letra repetida.
 */

import java.util.Random;

public class ej9 {
    public static final int MAX = 10;
    public static void main(String[] args) {
        char [] arrChar = new char[MAX];
        cargar_arreglo_aleatorio_char(arrChar);
        mostrarArray(arrChar);
        resolverEjercicio(arrChar);
    }

    public static void resolverEjercicio(char [] arrChar){
        boolean tieneRepetida = tieneLetraRepetida(arrChar);
        System.out.println("Existe una letra repetida: " + tieneRepetida);
    }

    public static boolean tieneLetraRepetida(char[] arr) {
        int i = 0;
        boolean esRepetida = false;

        while (i < MAX - 1 && !esRepetida) {
            int j = i + 1;
            while (j < MAX && !esRepetida) {
                if (arr[i] == arr[j]) {
                        esRepetida = true;
                    }
                j++;
            }
            i++;
        }

        return esRepetida;
    }

    public static void mostrarArray(char[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(" ");
    }

    public static void cargar_arreglo_aleatorio_char(char [] arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
            arr[pos]=(char)(r.nextInt(26) + 'a');
        }
    }

}
