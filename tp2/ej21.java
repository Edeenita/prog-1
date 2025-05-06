/* 
*   Pedir por consola un número entero e informar si es un número
*   primo. Un número es primo si solo es divisible por 1 y por sí
*   mismo.
*/
public class ej21 {
    public static void main(String[] args) {
        int num = 0;
        int contador = 0;
        System.out.println("Ingrese un número entero:");
        num = Utils.leerInt();
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println(num + " es un número primo.");
            } else {
                System.out.println(num + " no es un número primo.");
            }
        } else {
            System.out.println("El número debe ser mayor que 1.");
        }
    }   
}

