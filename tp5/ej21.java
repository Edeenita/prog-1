/*
Hacer un programa que inserte un elemento en un arreglo
(ordenado decrecientemente) de tamaño MAX=10.
 */

public class ej21 {
    public static final int MAX = 10;
    public static void main(String[] args) {
        int[] arrInt = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        resolverEjercicio(arrInt);
        mostrarArray(arrInt);
    }
    public static void resolverEjercicio(int[]arrInt){
        int num = 0;
        num = pedirNumero();
        boolean seInterto = false;
        for(int i = 0; i < MAX; i++){
            if(!seInterto && num > arrInt[i]){
                corrimiento_derecha(arrInt, i);
                arrInt[i] = num;
                seInterto = true;
            }
        }
    }

    public static void corrimiento_derecha(int[] arr, int pos){
        for(int i = MAX-1; i > pos; i-- ){
            arr[i] = arr[i-1];
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
    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print("[" + arr[i] + "] ");
        }
        System.out.println(" ");
    }
}
