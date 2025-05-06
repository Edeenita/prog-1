/*
*   Escribir un programa que mientras que el usuario ingrese un
*   carácter dígito o carácter letra minúscula, imprima si es carácter
*   dígito o carácter letra minúscula, y si es letra minúscula imprimir si
*   es vocal o consonante. 
 */


public class ej9 {
    public static void main(String[] args) {
        char caracter;

            System.out.println("Ingrese un caracter dígito o un carácter minúscula");
            caracter = Utils.leerChar();
            while (((caracter >= '0') && (caracter <='9')) || (('a' <= caracter) && (caracter <= 'z'))) {
                switch (caracter) {
                    case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' : System.out.println(caracter + " es dígito"); break;
                    case 'a', 'e', 'i', 'o', 'u' : System.out.println(caracter + " es vocal minuscula"); break; 
                    default: System.out.println( caracter + " es consonante"); break;
                }
                System.out.println("Ingrese un caracter dígito o un carácter minúscula");
                caracter = Utils.leerChar();
            }
            System.out.println("Ingreste un caracter invalido.");
        }
    }

