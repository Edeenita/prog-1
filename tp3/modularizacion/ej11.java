package tp3.modularizacion;

/*
 * Escribir un método que retorne el mayor de dos números. Usar
 * ese método para calcular el máximo de una serie de números
 * ingresados por el usuario (20 números en total).
 */

 import java.io.BufferedReader;
 import java.io.InputStreamReader;

 
public class ej11 {
    public static void main(String[] args) {
        Ingreso();
    }

    public static void Ingreso (){
        final int MAX = 20;
        int numIngreso;
        int numMAX = 0;
        int numMIN = 999999999;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 1; i <= MAX; i++){
                System.out.println("Ingrese un número");
                numIngreso = Integer.valueOf(entrada.readLine());
                if (numIngreso < numMIN) {
                    numMIN = numIngreso;
                }
                if (numIngreso > numMAX) {
                    numMAX = numIngreso;
                }
            }
            System.out.println("El menor número ingresado es: " + numMIN);
            System.out.println("La mayor número ingresado es: " + numMAX);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
