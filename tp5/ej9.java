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
        boolean esRepetida = letraRepetida(arrChar);
        System.out.println("Existe una letra repetida: " + esRepetida);
    }

    public static boolean letraRepetida(char [] arr){
        boolean esRepetida = false;
        for(int i = 0; i < MAX; i++){
            for(int j= i+1; j < MAX; j++){
                if (arr[i] == arr[j]) {
                    esRepetida = true;
                }
            }
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
