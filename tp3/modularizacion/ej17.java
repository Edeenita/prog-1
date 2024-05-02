package tp3.modularizacion;

/*
 * Escribir un programa que mientras que el usuario ingrese un
 * carácter letra minúscula, pida ingresar un número entero. Si el
 * número ingresado está entre 1 y 5 inclusive deberá imprimir la
 * tabla de multiplicar de dicho número.
 */

 import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ej17 {
    public static void main(String[] args) {
        char letra_ingreso;
        int num_ingreso;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un caracter letra minuscula");
            letra_ingreso = entrada.readLine().charAt(0);
            while (letra_ingreso >= 'a' && letra_ingreso <= 'z') {
                try {
                    System.out.println("Ingrese un caracter número entero: ");
                    num_ingreso = Integer.valueOf(entrada.readLine());
                    tablaMultiplicar(num_ingreso);
                    System.out.println("Ingrese un caracter letra minuscula");
                    letra_ingreso = entrada.readLine().charAt(0);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            
        }
    }
    public static void tablaMultiplicar (int num_ingreso){
        if (num_ingreso >= 1 && num_ingreso <= 5) {
            final int MAX = 10;
            System.out.println("Tabla de multiplicar de: " + num_ingreso);
            for (int i = 0; i <= MAX; i++){
                System.out.println(num_ingreso + " * " + i + " = " + (num_ingreso * i));
            } 
        } else {
            System.out.println(num_ingreso + " no es valido.");
        }
    }
}
