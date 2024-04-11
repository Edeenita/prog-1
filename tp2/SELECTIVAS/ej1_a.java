package tp2.SELECTIVAS;

// 1. Escribir un programa completo (declaración de constantes y
// variables, carga de datos, procesamiento e impresión de
// resultados) para cada caso o ítem que:
// a. solicite un número e indique si es positivo o negativo.
import java.io.BufferedReader;
import java.io.InputStreamReader;

class ej1_a {
    public static void main(String[] args) {
        int num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero entero: ");
            num = Integer.valueOf(entrada.readLine());
            if (num > 0) {
                System.out.println(num + " es un numero positivo.");
            }else if (num < 0) {
                        System.out.println(num + " es un numero negativo");
            }else{
                    System.out.println(num + " no es ni positivo ni negativo");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
