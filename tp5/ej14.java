/*
Dado un arreglo de caracteres de tamaño MAX, hacer un
programa que implemente métodos tal que devuelva al main: un
arreglo con las posiciones de los caracteres que son letras
vocales y otro con las posiciones que son consonantes.
 */

import java.util.Random;

public class ej14 {
    public static final int MAX = 10;
    public static void main(String[] args) {
        char [] arrChar = new char[MAX];
        cargar_arreglo_aleatorio_char(arrChar);
        mostrarArray(arrChar);

        int [] arrPosVocales = new int[MAX];
        int [] arrPosConsonantes = new int[MAX];

        resolverEjercicio(arrChar,arrPosVocales,arrPosConsonantes);
        mostrarArrayPos(arrPosVocales);
        mostrarArrayPos(arrPosConsonantes);
    }

    public static void resolverEjercicio(char [] arrChar, int[] arrPosVocales, int[]arrPosConsonantes){
        for (int i = 0; i < MAX; i++) {
            if (esVocal(arrChar[i])) {
                arrPosVocales[i] = i+1;
            } else {
                arrPosConsonantes[i] = i+1;
            }
        }
    }

    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    
    public static void mostrarArray(char[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    public static void mostrarArrayPos(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
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
