package tp3.modularizacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Escribir un programa que mientras el usuario ingrese un
 * número entero entre 1 y 9 realice:
 * 
 * a. Si el numero ingresado es múltiplo de 3 pida ingresar un
 * caracter y para el caracter ingresado imprima a qué tipo de
 * carácter está asociado:
 * i. “letra minúscula” si el carácter es una letra del
 * abecedario en minúscula;
 * ii. “letra mayúscula” si el carácter es una letra del
 * abecedario en mayúscula;
 * iii. “dígito” si el carácter corresponde a un número;
 * iv. “otro” para los restantes casos de caracteres.
 * 
 * b. Si el número ingresado es múltiplo de 5 imprima la tabla de
 * multiplicar del número ingresado.
 * 
 */

public class ej10 {
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
                if (MultiploTres(num_ingreso)) {
                    CaracterAsociado();
                } else if (MultiploCinco(num_ingreso)){
                    TablaMultiplicar(num_ingreso);
                }
                else{
                    System.out.println("No cumple las caracteristicas de multiplo de 3 o 5.");
                }
                System.out.println("Ingrese un número entre 1 y 10");
                num_ingreso = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static boolean MultiploTres(int num){
        return num % 3 == 0;
    }

    public static boolean MultiploCinco(int num){
        return num % 5 == 0;    
    }


    public static void CaracterAsociado (){
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

    public static void TablaMultiplicar (int num_ingreso){
        final int MAX = 10;
        for(int i = 1; i <= MAX; i++){
            System.out.println("Tabla de multiplicar de " + num_ingreso + " : " + (num_ingreso * i));
        }
    }
}
