
/*
*  Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
*   ‘a’ seguidas que se ingresaron.
 */

public class ej16 {
    public static void main(String[] args) {
        char caracter = ' ';
        int contador = 0, contador_mayor = 0;
        final int MAX = 15;

            for(int i = 0; i <= MAX; i++ ){
                System.out.println("Ingrese caracteres, al final se contaran la cantidad de 'a' ingresadas");
                caracter = Utils.leerChar();
                if (caracter == 'a') {
                    contador++;
                }else if(contador > contador_mayor){
                    contador_mayor = contador;
                    contador = 0;
                }
            }
            System.out.println("Usted ha ingresado: " + contador + " veces 'a' ");
        }
    }
