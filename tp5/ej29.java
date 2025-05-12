/*
Hacer un programa que elimine de un arreglo todas las
secuencias que tienen orden descendente entre sus elementos
 */
public class ej29 {
    static final int MAX = 20, SEPARADOR = 0;
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,0,3,2,1,0,1,2,3,0,3,2,1,0,44,40,0};
        mostrarArray(arr);
        procesarArray(arr);
        mostrarArray(arr);
    }
    public static void procesarArray(int[]arr){
        int ini = 0, fin = -1;
        int tamanio = 0;
        while (ini < MAX) {
            ini = obtener_inicio(arr, fin+1);
            if (ini < MAX) {
                fin = obtener_fin(arr, ini);
                tamanio = fin - ini + 1;
                if(esDescendente(arr, ini, fin, tamanio)){
                    eliminarSecuencia(arr, ini, fin);
                    fin -= tamanio;
                }
            }
        }
    }

    public static boolean esDescendente(int[]arr, int ini, int fin, int tamanio){
        boolean esDescendente = false;
        int pos = 0;
        for(int i = ini; i <= fin; i++){
            if(arr[i] > arr[i+1]){
                pos++;
            }
        }
        if (pos == tamanio) {
            esDescendente = true;
        }
        return esDescendente;
    }

    public static int obtener_inicio(int[] arr, int pos){
        while(pos < MAX && arr[pos] == SEPARADOR){
            pos++;
        }
        return pos;
    }

    public static void eliminarSecuencia(int[]arr, int ini, int fin){
        for(int i = ini; i <= fin; i++){
            corriento_izquierda(arr, ini);
        }
    }
    public static void corriento_izquierda(int[] arr, int pos){
        for(int i = pos; i < MAX -1; i++ ){
            arr[i] = arr[i+1];
        }
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
    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
