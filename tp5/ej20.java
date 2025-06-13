/*
Suponer a partir de lo resuelto en el ejercicio anterior (11) que
el elemento a eliminar coincide con el último que hay en el arreglo.
¿Qué pasa en este caso? ¿Cómo daría una solución al problema?
*/

public class ej20 {
    static final int MAX = 10;
    public static void main(String[] args) {
        int [] arrA = {1,2,2,2,2,2,1,1,2,1};
        int [] arrB = {2,2,2,2,2,2,1,1,1,1};
        mostrarArray(arrA);
        mostrarArray(arrB);
        resolverEjercicio(arrA, arrB);
        mostrarArray(arrA);
    }

    public static void resolverEjercicio(int [] arrA, int [] arrB){
        if (todosPresentes(arrA, arrB)) {
            int i = 0;
            while(i < MAX){   
                if(arrA[i] == arrB[i]){
                    corrimento_izquierda(arrA, i);
                    arrA[MAX-1] = 0; //basicamente hay que poner que en el MAX-1 se ponga algo como 0 o -1 para que no quede repetido el ultimo valor
                } else {
                    i++;
                }
            }
        }
    }
    

    public static void corrimento_izquierda(int[] arr, int pos){
        for(int i = pos; i < MAX -1; i++ ){
            arr[i] = arr[i+1];
        }
    }


    public static boolean todosPresentes(int [] arrA, int [] arrB){
        for(int i = 0; i < MAX; i++){
            int j = 0;
            boolean encontrado = false;
            while(j < MAX && !encontrado){
                if(arrA[i] == arrB[j]){
                    encontrado = true;
                }
                j++;
            }
            if(!encontrado){
                return false;
            }
        }
        return true;
    }
    

    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(" ");
    }

}


