/*
Dado dos arreglos de numeros enteros: Un arreglo A de tamañoros entre 0 y MAX-1, 
determinar la suma de los elementos del arreglo A cuyas posiciones son indicados
por el arreglo B. Por ejempllo, dado A = {3,6,31,9} max = 3, Y b = {0,2} con MAXB=2
el sistema debera informar 34 (lo cual es el resultado de sumar el 3 de la posicion 0 
y el 31 de la posicion 2 del arreglo A)    
 */
public class ej12 {
    public static final int MAXA = 4;
    public static final int MAXB = 2;
    public static void main(String[] args) {
        int [] arrA = {3,6,31,9};
        int [] arrB = {0,2};
        resolverEjercicio(arrA, arrB);
    }

    public static void resolverEjercicio (int[] arrA, int[] arrB){
        int suma = 0;
        for (int i = 0; i < MAXB; i++){
            suma += arrA[arrB[i]];
        }
        System.out.println("El resultado es " + suma);
    }
}
