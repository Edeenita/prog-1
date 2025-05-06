/*
Dado dos arreglos de números enteros A y B determinar 
si todos los números almacenados en el arreglo A están presentes
en el arreglo B.
 */

import java.util.Random;

public class ej11 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        int [] arrA = new int[MAX];
        int [] arrB = new int[MAX];
        //int [] arrB = arrA; para checkear
        cargar_arreglo_aleatorio_int(arrA);
        cargar_arreglo_aleatorio_int(arrB);
        mostrarArray(arrA);
        /* dar vuelta el array para verificar tambien
        for(int i = 0; i < MAX; i++){
            arrB[i] = arrA[MAX - 1 - i];
        }
        */
        mostrarArray(arrB);
        resolverEjercicio(arrA, arrB);
    }

    public static void resolverEjercicio(int [] arrA, int [] arrB){
        boolean todosEstan = todosPresentes(arrA, arrB);
        System.out.println("Todos los numeros de A estan en B: " + todosEstan);
    }
    

    public static boolean todosPresentes(int [] arrA, int [] arrB){
        boolean estanTodos = true;
        int i = 0;
        while (i < MAX && estanTodos){
            boolean encontrado = false;
            int j = 0;
            while (j < MAX && !encontrado){
                if (arrA[i] == arrB[j]){
                    encontrado = true;
                }
                j++;
            }
            if (!encontrado){
                estanTodos = false;
            }
            i++;
        }
        return estanTodos;
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
}
