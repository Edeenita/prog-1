package tp2.SELECTIVAS;
/*
*    Escribir un programa que solicite el ingreso de un número mayor a
*    50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3.
 */

 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 

public class ej3 {
    public static void main(String[] args) {
        int num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un número entero mayor que 50: ");
            num = Integer.valueOf(entrada.readLine());
            if (num > 50 && (num % 2 == 0 || num % 3 == 0)) {
                System.out.println(num + " es mayor que 50 y es multiplo de 2 o de 3");
            } else if (num == 50){
                System.out.println("Tú número ingreso es 50 ingrese otro número.");
            } else{
                System.out.println("Ingrese un número mayor que 50.");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
