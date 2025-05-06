/*
Con el mismo arreglo del ejercicio anterior informe por pantalla
cuantos elementos del mismo están por encima del promedio
calculado
 */
public class ej3 {
    public static final int MAX = 10;

    public static void main(String[] args) {
        int[] array = { 5, 4, 10, 9, 2, 1, 7, 44, 45, 40 };
        int promedio = calcularPromedio(array);
        System.out.println("El promedio del array es: " + promedio);
        int elementosMayores = contarMayoresAlPromedio(promedio, array);
        System.out.println("Hay " + elementosMayores + " numeros mayores a " + promedio);
    }

    public static int contarMayoresAlPromedio(int promedio, int[] array) {
        int contador = 0;
        for (int i = 0; i < MAX; i++) {
            if (array[i] > promedio) {
                contador++;
            }
        }
        return contador;
    }

    public static int calcularPromedio(int[] array) {
        int promedio = 0;
        for (int i = 0; i < MAX; i++) {
            promedio = promedio + array[i];
        }
        return promedio / MAX;
    }
}
