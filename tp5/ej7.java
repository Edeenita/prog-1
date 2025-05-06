/*
Hacer un programa que dado un arreglo de enteros y un núemero N
genere un arreglo con las posiciones donde se encuentre dicho número
A continuación, multiplicar por un numero M todas las ocurrencias del
número N en el arreglo original
 */

import java.util.Random;

class ej7 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        int[] arrEnteros = new int[MAX];
        cargar_arreglo_aleatorio_int(arrEnteros);
        mostrarArray(arrEnteros);
        resolverEjercicio(arrEnteros);
        mostrarArray(arrEnteros);

    }

    public static void resolverEjercicio(int[] arrEnteros) {
        int n = 0;
        int m = 0;
        System.err.println("Ingrese un número entero a buscar en el array");
        n = pedirNumero();
        System.out.println("Ingese un número entero para mutiplicar su número");
        m = pedirNumero();
        multiplicarPos(arrEnteros, n, m);
    }

    public static void multiplicarPos(int[] arrEnteros, int num, int mult) {
        for (int i = 0; i < MAX; i++) {
            if (arrEnteros[i] == num) {
                arrEnteros[i] *= mult;
            }
        }
    }

    public static int pedirNumero() {
        int valor = -1;
        while (valor <= 0) {
            valor = Utils.leerInt();
        }
        return valor;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(array[i] + ", ");
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