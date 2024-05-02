package tp3;

/*
 * Escribir un programa que mientras el usuario ingrese un número
 * entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
 * ingresado imprima:
 * 
 * a. “letra minúscula” si el carácter es una letra del abecedario en
 * minúscula;
 * 
 * b. “letra mayúscula” si el carácter es una letra del abecedario
 * en mayúscula;
 * 
 * c. “dígito” si el carácter corresponde a un número;
 * 
 * d. “otro” para los restantes casos de caracteres.
 */

 import java.io.BufferedReader;
 import java.io.InputStreamReader;

public class ej9 {
    public static void main(String[] args) {
        try {
            Ingreso();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void  Ingreso (){
        int num_ingreso;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un número entre 1 y 10");
            num_ingreso = Integer.valueOf(entrada.readLine());
            while (num_ingreso >= 1 && num_ingreso <= 10) {
                Verficiacion();
                System.out.println("Ingrese un número entre 1 y 10");
                num_ingreso = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void Verficiacion (){
        char letra;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un caracter: ");
                letra = entrada.readLine().charAt(0);
                if (letra >= 'a' && letra <= 'z') {
                    System.out.println(letra + " es minuscula.");
                } else if (letra >= 'A' && letra <= 'Z') {
                    System.out.println(letra + " es mayus.");
                } else if (letra >= 0 && letra <= 9) {
                    System.out.println(letra + " es digito.");
                } else {
                    System.out.println(letra + " es otro caracter o ha ingresado más de un digito.");
                }
        } catch (Exception e) {
            System.out.println(e);
        }
                
    }
}
