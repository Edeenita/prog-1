
/* 
*   Escribir un programa que mientras el usuario ingrese un
*   carácter letra minúscula, se quede con la menor y la mayor letra
*   ingresada. Finalmente muestre por pantalla dichas letras.
*/

public class ej12 {
    public static void main(String[] args) {
        char MAX = ' ';
        char MIN = ' ';
        char letra;

        try {
            System.out.println("ingrese un caracter minuscula, mostrará por pantalla el más pequeño al finalizar!: ");
            letra = Utils.leerChar();
            while (letra >= 'a' && letra <= 'z') {
                    if (letra < MIN) {
                        MIN = letra;
                    }
                    if (letra > MAX) {
                        MAX = letra;
                    }
            }
            System.out.println("La menor letra ingresada es: " + MIN);
            System.out.println("La mayor letra ingresada es: " + MAX);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
