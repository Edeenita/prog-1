/*
Hacer un programa que devuelva la posición de inicio y de fin
de la secuencia de mayor tamaño.
 */
public class ej26 {
    static final int MAX = 20, SEPARADOR = 0;
    public static void main(String[] args) {
        int[] arrInt = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0, 1, 31, 1, 1, 1 ,1, 0, 2, 1, 0};
        procesarArray(arrInt);
    }
    public static void procesarArray(int[] arrInt){
        int ini = 0, fin = -1, 
            iniMayor = -1, finMayor = -1, 
            tamanio = 1, tamanioMayor = -1;
        
        while(ini < MAX){
            ini = obtenerInicio(arrInt, fin+1);
                if(ini < MAX){  
                    fin = obtenerFin(arrInt, ini);
                    tamanio = fin - ini + 1;
                    if(tamanio > tamanioMayor){
                        tamanioMayor = tamanio;
                        iniMayor = ini;
                        finMayor = fin;
                    }
                }
            }
            System.out.println("La secuencia de mayor tamanio es de: " + tamanioMayor + " inicio en pos " + iniMayor + " y el fin en " + finMayor);
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
            return pos -1;
        }
}
    

    
