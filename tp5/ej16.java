/*
Implementar un método que realice un corrimiento a izquierda
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición.
 */
public class ej16 {
    static final int MAX = 10;
    public static void main(String[] args) {
        int [] arrInt = {1,2,3,4,5,6,7,8,9,10};
        int pos = 3;
        corriento_izquierda(arrInt, pos);
        mostrarArray(arrInt);
    }
    public static void corriento_izquierda(int[] arr, int pos){ 
        for(int i = pos; i < MAX -1; i++ ){
            arr[i] = arr[i+1];
        }
    }
    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
