/*
Implementar un método que realice un corrimiento a derecha
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición.
 */
public class ej15 {
    static final int MAX = 10;
    public static void main(String[] args) {
        int [] arrInt = {1,2,3,4,5,6,7,8,9,10};
        int pos = 3;
        corrimiento_derecha(arrInt, pos);
        mostrarArray(arrInt);
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
