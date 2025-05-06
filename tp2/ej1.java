/*
1. Escribir un programa completo (declaración de constantes y
variables, carga de datos, procesamiento e impresión de
resultados) para cada caso o ítem que:
a. solicite un número e indique si es positivo o negativo.
b. solicite un número e imprima “grande” si es mayor a 100 y
“chico “ si es menor.
c. solicite un número del 1 al 7 e imprima el día de la semana.
d. solicite una letra e imprima si es vocal o consonante.
e. solicite 3 números e imprima “creciente” si los tres números
están en orden creciente, “decreciente” si están en orden
decreciente o “error” si no cumplen ningún orden
 */

public class ej1 {
    public static void main(String[] args) {
        int numero_a, numero_b, numero_c, numerod1, numerod2, numerod3;
        char letra_d;
        /*a. solicite un número e indique si es positivo o negativo. */
        System.out.println("A. Ingrese un número: ");
        numero_a = Utils.leerInt();
        if (numero_a > 0) {
            System.out.println(numero_a + " es un positivo");
        } else if (numero_a < 0){
            System.out.println(numero_a + " es negativo");
        } else {
            System.out.println("¿" + numero_a + " es positivo o negativo?");
        }

        /* b. solicite un número e imprima “grande” si es mayor a 100 y
            “chico “ si es menor.*/
        System.out.println("B. Ingrese número");
        numero_b = Utils.leerInt();
        if (numero_b > 100) {
            System.out.println(numero_b + "es mayor que 100");
        } else {
            System.out.println(numero_b + "es menor que 100");
        }

        /*c. solicite un número del 1 al 7 e imprima el día de la semana. */
        System.out.println("Ingrese un número del 1 al 7 para seleccionar un día de la semana: ");
        numero_c = Utils.leerInt();
        switch (numero_c) {
            case 1:
                System.out.println("Hoy es Lunes");
                break;

            case 2:
                System.out.println("Hoy es Martes");
                break;

            case 3:
                System.out.println("Hoy es Miercoles");
                break;

            case 4:
                System.out.println("Hoy es Jueves");
                break;

            case 5:
                System.out.println("Hoy es Viernes");
                break;

            case 6:
                System.out.println("Hoy es Sabado");
                break;

            case 7:
                System.out.println("Hoy es Domingo");
                break;

            default:
                System.out.println("No ha ingreso un formato valido");
                break;
        }
        /*d. solicite una letra e imprima si es vocal o consonante.
        */
        System.out.println("Ingrese un caracter LETRA");
        letra_d = Utils.leerChar();
        switch (letra_d) {
            case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u':
                System.out.println(letra_d + " es una vocal");
                break;
        
            default: System.out.println(letra_d + " es una consonante");
                break;
        }
        

        /*e. solicite 3 números e imprima “creciente” si los tres números
            están en orden creciente, “decreciente” si están en orden
            decreciente o “error” si no cumplen ningún orden */
        System.out.println("Ingrese tres números: ");
        numerod1 = Utils.leerInt();
        numerod2 = Utils.leerInt();
        numerod3 = Utils.leerInt();
        if (numerod1 < numerod2 && numerod2 < numerod3) {
            System.out.println("La secuencia es creciente");
        } else if(numerod1 > numerod2 && numerod2 > numerod3 ){
            System.out.println("La secuencia es decreciente");
        } else {
            System.out.println("No cumple un orden");
        }
    }
}