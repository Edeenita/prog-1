package tp3;

/*
 * Escribir un programa que mientras el usuario cargue desde
 * teclado un número entero distinto de 0, imprima por pantalla la
 * suma que se obtiene de invocar un método que calcula la
 * sumatoria de los primeros 200 números naturales (son números
 * enteros entre 1 y 200).
 */

 import java.io.BufferedReader;
 import java.io.InputStreamReader;

public class ej7 {
    public static void main(String[] args) {
        Ingreso();
    }

    public static void Ingreso (){
        int num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un número entero diferente de 0: ");
            num = Integer.valueOf(entrada.readLine());
            while (num != 0) {
                try {
                SumaNaturales();
                System.out.println("Ingrese un número entero diferente de 0: ");
                num = Integer.valueOf(entrada.readLine());
            }
            catch (Exception e) {
                System.out.println(e);
                }
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void SumaNaturales(){
        final int MAX = 200;
        int resultado = 0;
        for (int i = 1; i <= MAX; i++){
            resultado += i;
        }
        System.out.println("La suma de los primeros 200 números naturales es: " + resultado);
    }
}
