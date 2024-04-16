package tp2.ITERATIVAS;

/*
*   Escribir un programa que mientras que el usuario ingrese un
*   número distinto de 0, pida ingresar otros dos números e imprima
*   el resultado de la división entre los dos últimos números
*   ingresados. ¿Existe alguna restricción para la división? 
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej18 {
    public static void main(String[] args) {
        double num, num2, num3;
        double resultado;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un número distinto de 0");
            num = Double.valueOf(entrada.readLine());
                while (num != 0) {
                    
                    System.out.println("Ingrese el primer número para dividir: ");
                    num2 = Double.valueOf(entrada.readLine());
                    System.out.println("Ingrese el segúndo número para dividir: ");
                    num3 = Double.valueOf(entrada.readLine());
                    
                    resultado = num2 / num3;
                    System.out.println("El resultado es: " + resultado);

                    System.out.println("Ingrese un número distinto de 0");
                    num = Double.valueOf(entrada.readLine());
                }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
 * no existe ninguna restricción para la división
 * ya que las variables fueron declaradas como doubles
 * se puede divir entre ellas sin restricciones
 * por ejemplo 2/8 en enteros seria igual a 0
 * pero al ser double 2/8=0.25
 */