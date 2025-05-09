/*
Hacer un programa que devuelva la posición de inicio y fin de la
primera secuencia de números distinta de ceros.
 */
public class ej23 {
    public static final int MAX = 20, SEPARADOR = 0;
    public static void main(String[] args) {
        int [] arrInt = {0,1,2,3,4,0,0,0,0,0,1,1,1,1,0,0,0,0,2,0};
        procesarArray(arrInt);
    }
    public static void procesarArray(int[] arrInt){
        int ini=0, fin=-1;
        boolean esPrimeraSecuencia = false;
        while (!esPrimeraSecuencia && ini < MAX){
            ini = buscarInicio(arrInt, fin+1);
            if(ini < MAX){
                fin = buscarFin(arrInt, ini);
                System.out.println("La posicion de inicio es: " + ini);
                System.out.println("La posicion del fin es: " + fin);
                esPrimeraSecuencia = true;
            }
        }
    }

    public static int buscarInicio(int[]arr, int pos ){
        while (pos<MAX && arr[pos]== SEPARADOR)
            pos++;
        return pos;
    }
    public static int buscarFin(int[]arr, int pos ){
        while (pos<MAX && arr[pos]!= SEPARADOR)
            pos++;
        return pos-1;
    }
    
}

