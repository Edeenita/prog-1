
/* 
*   Escribir un programa que mientras el usuario ingrese un
*   caracter letra minúscula, acumule la cantidad de vocales que
*   ingresó. Finalmente muestre por pantalla dicha cantidad.
*/
public class ej11 {
    public static void main(String[] args) {
        char caracter = ' ';
        int sumador = 0;
            System.out.println("Ingrese un caracter vocales para saber cuantas ingreso");
            caracter = Utils.leerChar();
            while (caracter >= 'a' && caracter <= 'z') {
                    if ( (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')) {
                        sumador++;
                    }
                    System.out.println("Ingrese un caracter vocales para saber cuantas ingreso");
                    caracter = Utils.leerChar();
            }
            System.out.println("El resultado final es: " + sumador + " vocales.");
        }
    }
    

