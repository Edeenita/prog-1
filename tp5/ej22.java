/*
Hacer un programa que elimine los valores pares en un arreglo
de tamaño MAX=10.
 */

import java.util.Random;

public class ej22 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        int[] arrInt = new int[MAX];
        cargar_arreglo_aleatorio_int(arrInt);
        mostrarArray(arrInt);
        resolverEjercicio(arrInt);
        mostrarArray(arrInt);
    }

    public static void resolverEjercicio(int[]arrInt){
        for(int i = 0; i < MAX; i++){
            if (esPar(arrInt[i])) {
                corriento_izquierda(arrInt, i);
                arrInt[MAX-1] = -1;
                i--;
            }
        }
    }

    public static void corriento_izquierda(int[] arr, int pos){
        for(int i = pos; i < MAX -1; i++ ){
            arr[i] = arr[i+1];
        }
    }

    public static boolean esPar(int n){
        return n % 2 == 0;
    }
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(array[i] + " ");
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
