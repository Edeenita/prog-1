/*
Hacer un programa que elimine de un arreglo todas las
ocurrencias de una secuencia patrón dada por otro arreglo
 */
public class ej28 {
    static final int MAX = 20, SEPARADOR = 0;
    public static void main(String[] args) {
        int[] arrInt = {0,1,2,3,0,1,2,3,0,1,2,3,0,1,1,0,0,2,2,0};
        int[] arrPatron = {1,2,3};
        procesarArray(arrInt, arrPatron);
        mostrarArray(arrInt);
    }
    public static void procesarArray(int[] arrInt, int[] arrPatron){
        int ini = 0, fin = -1;
        int tamanio = 0;
        while (ini < MAX) {
            ini = obtener_inicio(arrInt, fin+1);
            if(ini < MAX){
                fin = obtener_fin(arrInt, ini);
                tamanio = fin - ini + 1;
                if(esPatron(arrInt, arrPatron, ini, fin, tamanio)){
                    eliminarSecuencia(arrInt, ini, fin);
                    fin -= tamanio;
                }
            }
        }
    }

    public static boolean esPatron(int[] arrInt, int [] arrPatron, int ini, int fin, int tamanio){
        boolean esPatron = false;
        int pos = 0;
        for(int i = ini; i <= fin; i++){
            if (arrPatron[pos] == arrInt[i] ) {
                pos++;
            }
        }
        if(pos==tamanio){
            esPatron = true;
        }
        return esPatron;
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
    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
