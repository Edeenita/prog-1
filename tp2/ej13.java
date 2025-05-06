/* 
*   Escribir un programa que mientras que el usuario ingrese un
*   caracter letra minúscula, pida ingresar un número entero. Si el
*   número ingresado está entre 1 y 5 inclusive deberá imprimir la
*   tabla de multiplicar de dicho número.
*/

public class ej13 {
    public static void main(String[] args) {
        char letra;
        int num;
        int MAX = 10;
        int MIN = 1;
        int resultado;


            System.out.println("Ingrese un caracter minúscula: ");
            letra = Utils.leerChar();
            while (letra >= 'a' && letra <= 'z') {
                System.out.println("Ingresar un número entero entre 1 y 5 para ver si tabla de multiplicar.");
                num = Utils.leerInt();
                if (num >= 1 && num <= 5) {
                    for(int i = MIN; i <= MAX; i++){
                        resultado = num * i;
                        System.out.println(num + " * " + i + " = " + resultado );
                    }
                }
            }
            System.out.println("Caracter invalido.");
        } 
    }
