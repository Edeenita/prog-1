package tp3;

/*
 * Escribir un programa que mientras que el usuario ingrese un
 * número entero natural, llame a un método que calcule la
 * sumatoria desde 1 a dicho número (Ej: si n= 5 sumatoria =
 * 1+2+3+4+5=15) y retorne el resultado.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ej15 {
    public static void main(String[] args) {
        int num_entrada;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un número natural.");
            num_entrada = Integer.valueOf(entrada.readLine());

            while (num_entrada > 0) {
                int resultadofinal = Sumatoria(num_entrada);
                System.out.println("El resultado de la sumatoria es: " + resultadofinal);
                System.out.println("Ingrese un número natural.");
                num_entrada = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static int Sumatoria (int num_entrada){
        int resultado = 0;
        for (int i = 0; i <= num_entrada; i++){
            resultado = resultado + i;
        }
        return resultado;
    }
}
