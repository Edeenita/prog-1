/*
Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición).
 */

import java.util.Random;

public class ej18 {
    static final int MAX = 10;
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
        int num = 0;
        boolean esPrimerOcurrencia = false;
        num = pedirNumero();
        for(int pos = 0; pos < MAX; pos++ ){
            if(!esPrimerOcurrencia && arrInt[pos] == num){
                corriento_izquierda(arrInt, pos);
                esPrimerOcurrencia = true;
            }
        }
    }

    public static void corriento_izquierda(int[] arr, int pos){
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
