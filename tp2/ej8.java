/*
*   Escribir un programa que mientras que el usuario ingrese un
*   número entero distinto de 0, pida ingresar otro número entero y lo
*   imprima.
 */

public class ej8 {
    public static void main(String[] args) {
        int num;
        System.out.println("Ingrese un número diferente a 0: ");
        num = Utils.leerInt();
        while (num != 0) {
                System.out.println("Su número es: " + num + ", por favor ingrese otro diferente de 0: ");
                num = Utils.leerInt();
            }
            System.out.println("El número ingresado fué 0.");
        } 
    }

