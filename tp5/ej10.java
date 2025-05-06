/*
Hacer un programa que verifique en un arreglo si tiene al
menos N números primos. N debe ser ingresado por el usuario.
Reutilizar los métodos ya desarrollados
 */

import java.util.Random;

public class ej10 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        int [] arrInt = new int[MAX];
        cargar_arreglo_aleatorio_int(arrInt);
        mostrarArray(arrInt);
        resolverEjercicio(arrInt);
    }

    public static void resolverEjercicio(int [] arrInt){
        int cant_primos = pedirNumero();
        boolean contadorPrimos = buscarPrimos(arrInt, cant_primos);
        System.out.println("Hay " + cant_primos + " numeros primos: " + contadorPrimos );
    }
    public static boolean buscarPrimos(int [] arr, int cant_primos){
        boolean contadorPrimos = false;
        int contador = 0;
        for(int i = 0; i < MAX; i++){
            if(esPrimo(arr, i)){
                contador++;
                if (contador == cant_primos) {
                    contadorPrimos = true;
                }
            }
        }
        return contadorPrimos;
    }

    public static boolean esPrimo(int[] arr, int pos) {
        boolean esPrimo = true;
        int i = 2;
        while (i * i <= arr[pos] && esPrimo) {
            if (arr[pos] % i == 0) {
                esPrimo = false;
            }
            i++;
        }
        return esPrimo;
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

    public static int pedirNumero() {
        int valor = -1;
        while (valor <= 0) {
            System.out.println("Ingrese cuantos números primos a buscar");
            valor = Utils.leerInt();
        }
        return valor;
    }
}
