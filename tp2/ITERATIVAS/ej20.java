package tp2.ITERATIVAS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
*   Pedir números enteros positivos por teclado. En cada iteración
*   el usuario puede ingresar 0 para salir del programa. Si ingresa un
*   número distinto de 0 se debe pedir el ingreso de un carácter.
*
*   a. Si es ‘a’ se debe permitir al usuario escribir un texto libre e
*   imprimirlo por pantalla.
*
*   b. Si es ‘b’ se deben pedir 5 números positivos e informar si
*   fueron ingresados en orden ascendente.
*
*   c. Si es ‘c’ se deben pedir dos números enteros negativos e
*   imprimir la raíz cuadrada de su multiplicación. La raíz
*   cuadrada de un número se calcula con la sentencia:
*   Math.sqrt(numero).
*
*   d. Ante cualquier otro carácter ingresado se debe informar un
*   error y pedir nuevamente el carácter.
*/

public class ej20 {
    public static void main(String[] args) {
        int num;
        char letra;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingresar un entero positivo: ");
            num = Integer.valueOf(entrada.readLine());

            while (num != 0 && num > 0) {
                System.out.println("Ingresa un caracter: "  ); //solo con 'a' 'b' y 'c' funciona la magia
                letra = entrada.readLine().charAt(0);
                switch (letra) {
                    case 'a': 
                        System.out.println("Ingrese un texto: ");
                        String texto = String.valueOf(entrada.readLine());
                        System.out.println("Su texto es: " + texto);
                    break;

                    case 'b':
                        System.out.println("Ingrese 5 números enteros positivos");    
                        int num_b1 = Integer.valueOf(entrada.readLine());
                        int num_b2 = Integer.valueOf(entrada.readLine());
                        int num_b3 = Integer.valueOf(entrada.readLine());
                        int num_b4 = Integer.valueOf(entrada.readLine());
                        int num_b5 = Integer.valueOf(entrada.readLine());
                        if (num_b1 > 0 && num_b2 > 0 && num_b3 > 0 && num_b5 > 0) {
                            if (num_b1 < num_b2 && num_b2 < num_b3 && num_b3 < num_b4 && num_b4 < num_b5) {
                                System.out.println("La secuencia de: " + num_b1 + " " + num_b2 + " " + num_b3 + " " + num_b4 + " " + num_b5 + " es ascendente");
                            }else{
                                System.out.println("La secuencia de: " + num_b1 + " " + num_b2 + " " + num_b3 + " " + num_b4 + " " + num_b5 + " no es ascendente");
                            }
                        } else{
                            System.out.println("No ha ingresado un entero positivo.");
                        }
                        
                    break;

                    case 'c': 
                        System.out.println("Ingrese dos un números enteros negativo");
                        int num_c1 = Integer.valueOf(entrada.readLine());
                        int num_c2 = Integer.valueOf(entrada.readLine());
                        if (num_c1 < 0 && num_c2 < 0) {
                            double resultado_raiz = Math.sqrt(num_c1 * num_c2);
                            System.out.println("El resultado de la raiz cuadrada de la multiplicación de ambos numeros es: " + resultado_raiz);
                        } else{
                            System.out.println("No ha ingresado un número negativo.");
                        }
                    break;
                    default: 
                        System.out.println("ERROR");
                    break;
                }
                System.out.println("Ingresar un entero positivo nuvamente o inserte 0 para salir: ");
                num = Integer.valueOf(entrada.readLine());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
