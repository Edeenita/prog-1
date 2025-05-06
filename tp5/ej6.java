/*
Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima.
 */

import java.util.Random;

public class ej6 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        int [] arrInt = new int[MAX];
        cargar_arreglo_aleatorio_int(arrInt);
        mostrarArray(arrInt);
        int cantPares = contarPares(arrInt);
        System.out.println("La cantidad de pares es: " + cantPares);
    }

    public static int contarPares(int[] arrInt){
        int cantPares = 0;
        for(int i = 0; i < MAX; i++){
            if(arrInt[i] % 2 == 0 ){
                cantPares++;
            }
        }
        return cantPares;
    }


    public static void cargar_arreglo_aleatorio_int(int [] arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
        arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
        }
    }

    public static void mostrarArray(int[] arrInt) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arrInt[i] + " ");
        }
        System.out.println(" ");
    }
}
