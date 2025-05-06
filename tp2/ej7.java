/*
*   Escribir un programa que mientras el usuario ingrese un caracter
*   distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
*   si es carácter vocal minúscula.
*/

public class ej7 {
    public static void main(String[] args) {
        char caracter;
            System.out.println("Ingrese un caracter diferente de '*': ");
            caracter = Utils.leerChar();
            while (caracter != '*') {
                switch (caracter) {
                    case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' : System.out.println(caracter + " es dígito"); break;
                    case 'a', 'e', 'i', 'o', 'u' : System.out.println(caracter + " es vocal minuscula"); break;
                    default: System.out.println(caracter + " no es vocal minúscula o no es dígito"); break;
                }
                System.out.println("Ingrese un caracter diferente de '*': ");
                caracter = Utils.leerChar();
            }
            System.out.println("Caracter valido");
        } 
    }

