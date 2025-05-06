/*
Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola.
*/

public class ej2 {
    public static final int MAX = 10;

    public static void main(String[] args) {
        int[] array = { 5, 4, 10, 9, 2, 1, 7, 44, 45, 40 };
        int promedio = calcularPromedio(array);
        System.out.println("El promedio del array es: " + promedio);
    }

    public static int calcularPromedio(int[] array) {
        int promedio = 0;
        for (int i = 0; i < MAX; i++) {
            promedio = promedio + array[i];
        }
        return promedio / MAX;
    }
}
