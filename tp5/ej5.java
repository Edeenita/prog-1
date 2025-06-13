/*
Hacer un programa que dado un arreglo de caracteres de tamaño
MAX que se encuentra cargado, invierta el orden del contenido.
 */

import java.util.Random;

public class ej5 {
    public static final int MAX = 10;
    public static void main(String[] args) {
        char [] arrCaracter = new char[MAX];
        cargar_arreglo_aleatorio_char(arrCaracter);
        //Muestro el array antes
        mostrarArray(arrCaracter);
        invertirArray(arrCaracter);
        mostrarArray(arrCaracter);

    }


    public static void invertirArray(char[] arrCaracter) {
        int inicio = 0;
        int fin = MAX - 1;
        while (inicio < fin) {
            char temp = arrCaracter[inicio];
            arrCaracter[inicio] = arrCaracter[fin];
            arrCaracter[fin] = temp;
            inicio++;
            fin--;
        }
    }


    public static void mostrarArray(char[] arrCaracter) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arrCaracter[i] + " ");
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
