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
        int num = -1;
        char letra = ' ';
            System.out.println("Ingresar un entero positivo: ");
            num = Utils.leerInt();

            while (num != 0 && num > 0) {
                System.out.println("Ingresa un caracter o 0 para finalizar: "  ); //solo con 'a' 'b' y 'c'
                letra = Utils.leerChar();
                switch (letra) {
                    case 'a': 
                        System.out.println("Ingrese un texto: ");
                        String texto = Utils.leerString();
                        System.out.println("Su texto es: " + texto);
                    break;

                    case 'b':
                            System.out.println("Ingrese 5 números enteros positivos:");
                            int anterior = 0;
                            int actual = 0;
                            boolean esAscendente = true;
                            final int MAX = 5;

                            anterior = Utils.leerInt();
                            for (int i = 2; i <= MAX; i++) {
                                    actual = Utils.leerInt();

                                    if (actual <= 0) {
                                        System.out.println("Ha ingresado un negativo");
                                        esAscendente = false;
                                    }else if (actual <= anterior) {
                                        esAscendente = false;
                                    }
                                    anterior = actual;
                            }

                            if (esAscendente) {
                                System.out.println("Es ascendente.");
                            } else {
                                System.out.println("No es ascendente.");
                            }
                            break;

                    case 'c': 
                        System.out.println("Ingrese dos un números enteros negativo");
                        int num_c1 = 0;
                        int num_c2 = 0;

                        while (num_c1 >= 0 && num_c2 >= 0 ) {
                            System.out.println("Ingrese el primer caracter negativo");
                            num_c1 =  Utils.leerInt();
                            System.out.println("Ingrese el segundo caracter negativo");
                            num_c2 =  Utils.leerInt();
                        }
                            double resultado_raiz = Math.sqrt(num_c1 * num_c2);
                            System.out.println("El resultado de la raiz cuadrada es: " + resultado_raiz);
                        break;
                    default:

                        if (letra == '0') {
                            num = 0;
                        }else{
                            System.out.println("ERROR");
                        }
                    break;
                }
            }
        } 
    }

