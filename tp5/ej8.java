/*
Hacer un programa que determine si los valores almacenados en
un arreglo de enteros se encuentran en orden ascendente.
 */

import java.util.Random;

public class ej8 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        //int [] arrInt = new int[MAX];
        int [] arrInt = {1,2,3,4,5,6,7,8,9,10};
        //cargar_arreglo_aleatorio_int(arrInt);
        mostrarArray(arrInt);
        resolverEjercicio(arrInt);
    }

    public static void resolverEjercicio(int[] arrInt){
        boolean esAscendente = buscar_pos_ordenado(arrInt);
        System.out.println("El arreglo es ascendente: " + esAscendente);
    }

    public static boolean buscar_pos_ordenado(int[] arr){
        int pos = 0;
        while(pos < MAX - 1 && arr[pos] <= arr[pos+1]){
            pos++;
        }
        return pos == MAX - 1;
    }

        public static void mostrarArray(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(" ");
    }

        public static void cargar_arreglo_aleatorio_int(int [] arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
        arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
        }
    }
}
