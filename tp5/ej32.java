/*
Se tiene un arreglo de enteros de tamaño 20 de secuencias de
numeros entre 1 y 9, separadas por 0. El arreglo esta precargado,
y ademas empieza y termina con uno o mas separadores 0. Hacer
un programa que permita obtener a traves de metodos la posicion
de inicio y la posicion de fin de la secuencia ubicada a partir de
una posicion entera ingresada por el usuario. Finalmente, si
existen imprima por pantalla ambas posiciones
 */
public class ej32 {
    static final int MAX = 20, SEPARADOR = 0;
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,0,1,2,3,0,1,2,3,4,5,0,1,1,1,0};
        resolverEjercicio(arr);
    }
    public static void resolverEjercicio(int [] arr){
        int ini = 0, fin = -1;
        System.out.println("Ingrese la posicion de inicio");
        ini = pedirNumero();
        fin = ini;
        if(ini < MAX){
            ini = buscarInicio(arr, fin+1);
            if(ini < MAX){
                fin = buscarFin(arr, ini);
                System.out.println(ini);
                System.out.println(fin);
            }
        }
    }
    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }
    public static int pedirNumero() {
        int valor = -1;
        while (valor < 0) {
            valor = Utils.leerInt();
        }
        return valor;
    }
}
