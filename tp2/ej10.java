
/*
*   Escribir un programa que mientras que el usuario ingrese un
*   número entero entre 1 y 10 inclusive, lleve la suma de los
*   números ingresados. Finalmente, cuando sale del ciclo muestre
*   por pantalla el resultado de la suma. ¿En qué casos termina?
 */
public class ej10 {
    public static void main(String[] args) {
        int num = 0;
        int sumador;

            System.out.println("Ingrese un número entre 1 y 10 para ir sumando.");
            sumador = Utils.leerInt();
            while (sumador >= 1 && sumador <=10) {
                num += sumador;
                System.out.println("Su numero es: "+ num + " Ingrese un número entre 1 y 10 para seguir sumando.");
                sumador = Utils.leerInt();
            }
            System.out.println("El resultado final es: " + num);
        } 
    }
/*
 * los casos en los que termina son cuando se ingresa un número
 * diferente de 1 [...] 10, tal como el 0 o el 11
 */
