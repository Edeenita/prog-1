package tp2.SELECTIVAS;

//e. solicite 3 números e imprima “creciente” si los tres números
//están en orden creciente, “decreciente” si están en orden
//decreciente o “error” si no cumplen ningún orden

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej1_e {
    public static void main(String[] args) {
        int n1, n2, n3;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el primer número entero: ");
            n1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el segundo número entero: ");
            n2 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el tercer número entero: ");
            n3 = Integer.valueOf(entrada.readLine());
            if (n1 < n2 && n2 < n3) {
                System.out.println("La secuencia: " + n1 + " " + n2 + " " + n3 + " es creciente");
            } else if (n1 > n2 && n2 > n3) {
                System.out.println("La secuencia: " + n1 + " " + n2 + " " + n3 + " es decreciente");
            } else {
                System.out.println("Ingrese una secuencia de números enteros valida.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
