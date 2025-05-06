/*
Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también.
 */

import java.util.Random;

public class ej4 {
    public static final int MAX = 10;

    public static void main(String[] args) {
        char [] arrCaracter = new char[MAX];
        cargar_arreglo_aleatorio_char(arrCaracter);
        //Muestro el array antes
        mostrarArray(arrCaracter);
        char caracter = pedirCaracter();;
        buscarCaracter(arrCaracter, caracter);
    }

    public static void mostrarArray(char[] arrCaracter) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arrCaracter[i] + ", ");
        }
        System.out.println(" ");
    }

    public static void buscarCaracter(char [] arrCaracter, char caracter){
        for(int i = 0; i < MAX; i++){
            if(arrCaracter[i] == caracter){
                System.out.println(caracter + " está en la posición " + i );
            }else{
                System.out.println("El caracter no esta en la posición: " + i);
            }
        }
    }

    public static char pedirCaracter(){
        char caracter = ' ';
        while (!(esCaracterValido(caracter))) {
            System.out.println("Ingrese un caracter minuscula");
            caracter = Utils.leerChar();
        }
        return caracter;
    }
    
    public static boolean esCaracterValido(char caracter) {
        return caracter >= 'a' && caracter <= 'z';
    }

    public static void cargar_arreglo_aleatorio_char(char [] arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
        arr[pos]=(char)(r.nextInt(26) + 'a');
        }
    }

}
