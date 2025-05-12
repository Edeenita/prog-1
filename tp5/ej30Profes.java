// 30. Hacer un programa que reemplace de un arreglo A todas las
// ocurrencias de una secuencia patrón dada en un arreglo P, por la
// secuencia contenida en el arreglo R de igual tamaño.


public class ej30Profes {
    static final int MAX = 20;
    static final int MAXP = 4;
    static final int SEPARADOR = 0;

    public static void main(String[] args) {
        
        int[] arregloA = {0,1,2,3,0,4,5,6,7,0,3,4,5,6,0,3,4,0,3,0};
        int[] arregloP = {4,5,6,7};
        int[] arregloR =  {10, 11, 12, 13};

        System.out.println("arregloA original :");
        imprimir_arreglo_int(arregloA);
        suplantar_secuencias(arregloA,arregloP, arregloR);

        System.out.println("arregloA suplantado: ");
        imprimir_arreglo_int(arregloA);

    }

    public static void suplantar_secuencias(int[]arrA, int[]arrP , int[]arrR ){
        int inicio = 0, fin = -1;
        int tamanio = 0;
        while(inicio < MAX){
            
            inicio = obtener_inicio(arrA, fin+1);

            if(inicio < MAX){
                fin = obtener_fin(arrA, inicio);
                tamanio = fin - inicio + 1;
                if((tamanio==MAXP) && (esPatron(arrA, inicio, fin, arrP))){
                    System.out.println("entro en el if de es patron con inicio "+inicio + "y fin " +fin);
                    eliminar_secuencia(arrA, inicio, fin);
                    intercambiar_secuencia(arrA, arrR, inicio, fin);

                }
                    
            }

        }

    }

    public static void intercambiar_secuencia(int[] arrA, int[]arrR, int iniA, int finA){
        hacer_lugar(arrA, iniA, finA);

        int j = 0;

        for(int i = iniA; i <= finA; i++){
            arrA[i] = arrR[j];
            j++;
        }

    }

    public static void hacer_lugar(int[]arr, int inicio, int fin){

        for(int i = inicio; i <= fin; i++){
            corrimiento_derecha(arr, inicio);
        }



    }

    public static void eliminar_secuencia(int[] arr, int ini, int fin){

        for(int i = ini; i<=fin; i++){
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

    public static boolean esPatron(int[] arr, int inicio, int fin, int[] arrP){

        int j = 0;
        boolean cumple = true;
        while(inicio <= fin && arr[inicio]==arrP[j] ){
            
            if(arr[inicio] != arrP[j]){
                cumple = false;
             }
            
            j++;
            inicio++;

        }
        return cumple;
        
        /*if(inicio == fin){
            return true;
        }else{
            return false;
        }*/


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
