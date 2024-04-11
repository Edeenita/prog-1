package tp2.ITERATIVAS;

/*
*   Escribir un programa que mientras que el usuario ingrese un
*   número entero distinto de 0, pida ingresar otro número entero y lo
*   imprima.
 */

 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 
 

public class ej8 {
    public static void main(String[] args) {
        int num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un número diferente a 0: ");
            num = Integer.valueOf(entrada.readLine());
            while (num != 0) {
                System.out.println("Su número es: " + num + ", por favor ingrese otro diferente de 0: ");
                num = Integer.valueOf(entrada.readLine());
            }
            System.out.println("El número ingresado fué 0.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
