/*
Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra cargado, solicite al usuario un número entero
y lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada.
 */
public class ej17 {
    static final int MAX = 10;
    public static void main(String[] args) {
        int [] arrInt = {1,2,3,4,5,6,7,8,9,10};
        int pos = 0;
        corrimiento_derecha(arrInt, pos);
        agregarNumEnPos(arrInt, pos);
        mostrarArray(arrInt);
    }

    public static void agregarNumEnPos(int[]arrInt, int pos){
        System.out.println("Agregue un numero para ingresar en la posicion 0 del arreglo: ");
        int num = Utils.leerInt();
        arrInt[pos] = num;
    }

    public static void corrimiento_derecha(int[] arr, int pos){
        for(int i = MAX-1; i > pos; i-- ){
            arr[i] = arr[i-1];
        }
    }
    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
