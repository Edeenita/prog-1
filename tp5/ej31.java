/*
Hacer un programa que invierta el orden de la ultima secuencia del arreglo
 */
public class ej31 {
    static final int MAX = 20;
    static final int SEPARADOR = 0;
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,0,3,2,1,0,1,2,0,3,2,1,0,1,2,3,0}; //{0,1,2,3,0,3,2,1,0,1,2,0,3,2,1,0,3,2,1,0}
        mostrarArray(arr);
        resolverEjercicio(arr);
        mostrarArray(arr);
    }

    public static void resolverEjercicio(int[]arr){
        int ini = 0, fin = - 1;
        int ultIni = -1, ultFin = -1;
        while(ini < MAX){
            ini = obtener_inicio(arr, fin+1);
            if(ini < MAX){
                fin = obtener_fin(arr, ini);
                ultFin = fin;
                ultIni = ini;
            }
        }
        invertirUltSecuencia(arr, ultFin, ultIni);
    }

    

    public static void invertirUltSecuencia(int[] arr, int ultFin, int ultIni) {
        int tamanio = ultFin - ultIni + 1;
        int [] arrAux = new int[tamanio];
        for (int i = 0; i < tamanio; i++){
            arrAux[i] = arr[ultIni+i];
        }
        for(int j = 0; j < tamanio; j++){
            arr[ultIni + j] = arrAux[tamanio - 1 - j ];
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
    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
