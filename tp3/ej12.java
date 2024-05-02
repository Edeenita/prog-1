package tp3;

/*
 * Escribir un programa que simule 1000 lanzamientos de un dado
 * y muestre por pantalla cuántas veces salió el valor del dado
 * correspondiente al número entero N ingresado por el usuario.
 * Considerar que el valor N ingresado se corresponda a un valor
 * posible para un dado. Usar la sentencia Math.random() que
 * devuelve un valor aleatorio real entre 0 y 1.
 * Para asignar un posible valor a la variable dado entero:
 * dado = (int) (6*Math.random() + 1)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej12 {
    public static void main(String[] args) {
        Ingreso();
    }

    public static void Ingreso(){
        int numIngreso;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un número entre [1 y 6]: ");
            numIngreso = Integer.valueOf(entrada.readLine());
            if (numIngreso >=1 && numIngreso <= 6) {
                LanzamientoDado(numIngreso);
            } else{
                System.out.println("No ha ingresado un número valido. ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void LanzamientoDado(int numIngreso){
        final int MAX = 1000;
        int dado;
        int contador = 0;
        for (int i = 1; i <= MAX; i++){
            dado = (int) (6*Math.random() + 1);
            if (dado == numIngreso) {
                contador++;
            }
        }
        System.out.println("el numero " + numIngreso + " ha salido: " + contador + " veces.");
    }
}
