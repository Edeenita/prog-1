/*
Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine todas las ocurrencia de número en el arreglo.
Mientras exista (en cada iteración tiene que buscar la posición
dentro del arreglo) tendrá que usar la posición para realizar un
corrimiento a izquierda (quedarán tantas copias de la última
posición del arreglo como cantidad de ocurrencias del número).
 */

import java.util.Random;

public class ej19 {
    static final int MAX = 10;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;

    public static void main(String[] args) {
        int[] arrInt = new int[MAX];
        cargar_arreglo_aleatorio_int(arrInt);
        mostrarArray(arrInt);
        resolverEjercicio(arrInt);
        mostrarArray(arrInt);
    }

    public static void resolverEjercicio(int[] arrInt){
        int num = 0;
        num = pedirNumero();
        int pos = 0;
        while (pos < MAX) {
            if (arrInt[pos] == num) {
                corrimento_izquierda(arrInt, pos);
            }
            else {
                pos++;
            }
        }
    }

    public static void corrimento_izquierda(int[] arr, int pos){
        for(int i = pos; i < MAX -1; i++ ){
            arr[i] = arr[i+1];
        }
    }

    public static int pedirNumero(){
        int valor = 0;
        while (valor <= 0) {
            System.out.println("Ingrese un numero entero: ");
            valor = Utils.leerInt();
        }
        return valor;
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
