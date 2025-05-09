/*
Hacer un programa que dado un número N ingresado por el
usuario, elimine las secuencias de tamaño N de números distintos
de cero.
 */
public class ej27 {
    static final int MAX = 20, SEPARADOR = 0;
    public static void main(String[] args) {
        int[] arrInt = {0,1,2,3,0,1,2,3,0,1,2,3,0,1,1,0,0,2,2,0};
        mostrarArray(arrInt);
        procesarArray(arrInt);
        mostrarArray(arrInt);
    }
    public static void procesarArray(int[]arrInt){
        int ini = 0, fin = -1, valor = -1, tamanio = 0;
        valor = pedirNumero();
        while (ini < MAX) {
            ini = obtenerInicio(arrInt, fin+1);
            if(ini< MAX){
                fin = obtenerFin(arrInt, ini);
                tamanio = fin - ini + 1;
                if(tamanio == valor){
                    eliminarSecuencia(arrInt, ini, fin);
                    fin -= tamanio;
                }
                
            }
        }
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

    public  static int obtenerInicio(int[]arr, int pos){
        while(pos < MAX && arr[pos] == SEPARADOR){
            pos++;
        }
        return pos;
    }

    public  static int obtenerFin(int[]arr, int pos){
        while(pos < MAX && arr[pos] != SEPARADOR){
            pos++;
        }
        return pos-1;
    }

    public static int pedirNumero(){
        int valor = 0;
        while (valor <= 0) {
            System.out.println("Ingrese un numero entero");
            valor = Utils.leerInt();
        }
        return valor;
    }

    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
