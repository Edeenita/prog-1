/*
Hacer un programa que devuelva la posición de inicio y fin de la
secuencia de números distintos de ceros cuya suma del contenido
sea mayor.
 */
public class ej24 {
    static final int MAX = 20, SEPARADOR = 0;
    public static void main(String[] args) {
        int [] arrInt = {0,1,2,3,4,0,0,0,0,0,1,31,1,1,0,0,0,0,2,0};
        procesarArray(arrInt);
    }

    public static void procesarArray(int [] arrInt){
        int ini = 0, fin = - 1, suma = 0;
        int  mayorSuma = -1, iniMax = 0, finMax = 0;
        while (ini < MAX) {
            ini = buscarInicio(arrInt, fin+1);
            if(ini < MAX){
                fin = buscarFin(arrInt, ini);
                suma = obtenerSuma(arrInt, ini,fin);
                if(suma > mayorSuma){
                    mayorSuma = suma;
                    iniMax = ini;
                    finMax = fin;
                }
            }
        }
        System.out.println("La mayor suma es: " + mayorSuma + " en el inicio " + iniMax + " y en el fin " + finMax);
    }

    public static int obtenerSuma(int [] arr, int ini, int fin){
        int suma = 0;
        for(int i = ini; i < fin; i++){
            suma = suma + arr[i];
        }
        return suma;
    }

    public static int buscarInicio(int[] arr, int pos){
        while(pos < MAX && arr[pos] == SEPARADOR){
            pos++;
        }
        return pos;
    }
    public static int buscarFin(int[] arr, int pos){
        while(pos < MAX && arr[pos]!= SEPARADOR){
            pos++;
        }
        return pos-1;
    }
}
