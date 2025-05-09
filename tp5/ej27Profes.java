

// 27. Hacer un programa que dado un número N ingresado por el
// usuario, elimine las secuencias de tamaño N de números distintos
// de cero.


public class ej27Profes {

    static final int MAX= 20;
    static final int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arreglo = {0,1,2,3,0,4,5,6,7,0,3,4,5,6,0,3,4,0,3,0};
        int n = 0;

        System.out.println(("Arreglo original: "));
        imprimir_arreglo_int(arreglo);

        System.out.println("Ingrese un numero");
        n= Utils.leerInt();

        eliminar_secuencias_tam_N(arreglo, n);
        System.out.println("Arreglo con secuencia eliminada");
        imprimir_arreglo_int(arreglo);

    }

    public static void eliminar_secuencias_tam_N(int[]arr, int n){

        int inicio = 0, fin = -1;
        int tamanio = 0;
        while(inicio < MAX){
            inicio = obtener_inicio(arr, fin+1);
            if(inicio<MAX){
                fin = obtener_fin(arr, inicio);
                tamanio = fin - inicio + 1;

                if(tamanio == n){
                    eliminar_secuencia(arr, inicio, fin);
                    fin -= tamanio;
                }

            }

        }

    }

    public static void eliminar_secuencia(int[] arr, int ini, int fin){

        for(int i = ini; i <=fin; i++){
            corriento_izquierda(arr, ini);
        }

    }

    public static void corriento_izquierda(int[] arr, int pos){ //eliminar posicion

        for(int i = pos; i < MAX -1; i++ ){
            arr[i] = arr[i+1];
        }

    }

    public static void corrimiento_derecha(int[] arr, int pos){
        
        
        for(int i = MAX-1; i > pos; i-- ){
            arr[i] = arr[i-1];
        }


    }



    

    public static int obtener_inicio(int[] arr, int pos){

        while(pos < MAX && arr[pos] == SEPARADOR){
            pos++;
        }

        return pos;

    }

    public static int obtener_fin(int[] arr, int pos){

        while(pos < MAX && arr[pos] != SEPARADOR){
            pos++;
        }
        return pos-1;

    }
    public static void imprimir_arreglo_int(int[] arr) {
        String cadena = "";
        for(int i = 0; i < MAX; i++){
            cadena+= "["+arr[i] + "] ";
        }
        System.out.println(cadena);
    }

}