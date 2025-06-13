/*
Hacer un programa que reemplace de un arreglo A todas las
ocurrencias de una secuencia patrón dada en un arreglo P, por la
secuencia contenida en el arreglo R de igual tamaño.
 */
public class ej30 {
    static final int MAXA = 20;
    static final int MAXP = 3;
    static final int MAXR = 3;
    static final int SEPARADOR = 0;
    public static void main(String[] args) {
        int [] arrA = {0,1,2,3,0,3,2,1,0,1,2,0,3,2,1,0,1,2,3,0};
        int [] arrP = {1,2,3};
        int [] arrR = {4,9,17};
        mostrarArray(arrA);
        resolverEjercicio(arrA,arrP,arrR);
        mostrarArray(arrA);
    }

    public static void resolverEjercicio(int[]arrA, int[]arrP, int[]arrR){
        int ini = 0, fin = -1, tamanio = 0;
        while(ini < MAXA){
            ini = obtener_inicio(arrA, fin+1);
            if(ini < MAXA){
                fin = obtener_fin(arrA, ini);
                tamanio = fin - ini + 1;
                if(tamanio == MAXP && esPatron(arrA,arrP,ini, fin, tamanio)){
                    eliminarSecuencia(arrA, ini, fin);
                    aniadirSecuencia(arrA,arrR, ini, fin);
                }
            }
        }
    }
    public static void aniadirSecuencia(int[] arrA, int[]arrR, int iniA, int finA){
        moverSecuencia(arrA, iniA, finA);
        int j = 0;
        for(int i = iniA; i <= finA; i++){
            arrA[i] = arrR[j];
            j++;
        }

    }
    
    public static void moverSecuencia(int[]arr, int ini, int fin){
        for(int i = ini; i <= fin; i++){
            corrimiento_derecha(arr, ini);
        }
    }
    public static void corrimiento_derecha(int[] arr, int pos){
        for(int i = MAXA-1; i > pos; i-- ){
            arr[i] = arr[i-1];
        }
    }

    public static boolean esPatron(int[]arrA, int[]arrP, int ini, int fin, int tamanio){

        int pos = 0;
        while (ini <= fin && arrA[ini] == arrP[pos]) {
            ini++;
            pos++;
        }
        if(ini > fin){
            return true;
        }
        return false;
    } 

    public static void eliminarSecuencia(int[]arr, int ini, int fin){
        for(int i = ini; i <= fin; i++){
            corriento_izquierda(arr, ini);
        }
    }
    public static void corriento_izquierda(int[] arr, int pos){
        for(int i = pos; i < MAXA -1; i++ ){
            arr[i] = arr[i+1];
        }
    }
    
    public static int obtener_inicio(int[] arr, int pos){
        while(pos < MAXA && arr[pos] == SEPARADOR){
            pos++;
        }
        return pos;
    }
    public static int obtener_fin(int[] arr, int pos){
        while(pos < MAXA && arr[pos] != SEPARADOR){
            pos++;
        }
        return pos-1;

    }
    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < MAXA; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

}
