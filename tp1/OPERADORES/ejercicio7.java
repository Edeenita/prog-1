package tp1.OPERADORES;
/*
 * Escribir un programa que dado tres números reales ingresados
 * por el usuario, divida el primero por el segundo y al resultado
 * obtenido le reste el tercero. Muestre por pantalla el resultado
 * obtenido. Puede o no usar variables auxiliares para los cálculos.
 * Tenga en cuenta posibles errores en las operaciones.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio7 {
    public static void main(String[] args) {
        double num1, num2, num3;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingresar el primer numero real");
            num1 = Double.valueOf(entrada.readLine());
            System.out.println("Ingresar el segundo numero real");
            num2 = Double.valueOf(entrada.readLine());
            System.out.println("Ingresar el tercer numero real");
            num3 = Double.valueOf(entrada.readLine());
            double resultado = (num1/num2) - num3;
            System.out.println("El resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
/*
 * Se rompe al ingresar un numero invalido (no ingresar un double) o la dividir por 0
 */