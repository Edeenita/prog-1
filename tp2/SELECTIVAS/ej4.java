package tp2.SELECTIVAS;

/*
*   Escribir un programa donde el usuario ingrese un número entre 0
*   y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
*   tiene 3 dígitos debe informar qué número es.
 */

 import java.io.BufferedReader;
 import java.io.InputStreamReader;

public class ej4 {
    public static void main(String[] args) {
        int num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un número entero entre 0 y 999: ");
            num = Integer.valueOf(entrada.readLine());
            if (num >= 0 && num <= 999) {
                if (num >= 0 && num <= 9) {
                    System.out.println("Un digito.");
                }  else if (num >= 10 && num <= 99){
                    System.out.println("Dos digitos.");
                }   else if (num >= 100 && num <= 999) {
                    System.out.println("Tres digitos, sú número es: " + num);
                } else{
                    System.out.println("Ha ocurrido un error.");
                }
            }else{
                System.out.println("Ingrese un número valido.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        }
}
