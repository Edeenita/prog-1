package tp2.SELECTIVAS;
//b. solicite un número e imprima “grande” si es mayor a 100 y
//“chico “ si es menor.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej1_b {
    public static void main(String[] args) {
        int num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero entero: ");
            num = Integer.valueOf(entrada.readLine());
            if (num >= 100) {
                System.out.println(num + " es un numero grande.");
            }else{
                System.out.println(num + " es un numero chico.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
