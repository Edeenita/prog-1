package tp3;

/*
 * Escribir un programa que mientras el usuario ingresa un
 * número de mes (entero) entre 1 y 12 inclusive, muestre por
 * pantalla la cantidad de días del mes ingresado (suponer febrero
 * de 28 días) (Mostrar por pantalla la cantidad de días del mes
 * debería realizarse con un método).
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ej16 {
    public static void main(String[] args) {
        int num_entrada;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un mes [1~12]");
            num_entrada = Integer.valueOf(entrada.readLine());
            while (num_entrada >= 1 && num_entrada <= 12) {
                CalculoMes(num_entrada);
                System.out.println("Ingrese un mes [1~12]");
                num_entrada = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void CalculoMes(int num_entrada){
        switch (num_entrada) {
            case 2:
                System.out.println("Tiene '28' días ");
            break;

            case 4, 6, 9, 11: 
                System.out.println("Tiene '30' días");
            break;
        
            default:
                System.out.println("Tiene '31' días");
            break;
        }
    }
}
