package tp3;

/*
 * Escribir un diseño de programa que mientras que el usuario
 * ingrese un número distinto de 0, pida ingresar otro número y lo
 * imprima.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej1 {
    public static void main(String[] args) {
        try {
            ImprimirNum();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public static void ImprimirNum () {
        int num = -1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (num != 0){
            try {
                System.out.println("Ingrese un númmero diferente de 0");
                num = Integer.valueOf(entrada.readLine());
                if (num !=0 ) {
                    System.out.println("Tú número es: " + num);
                }
            } catch (Exception e) {
                System.out.println("Error intente nuevamente. " + e);
            }
        }
        System.out.println("Ha salido del programa");
    }
}
