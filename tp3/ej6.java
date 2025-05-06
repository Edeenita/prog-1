/*
Escribir un programa que mientras el usuario cargue desde
teclado un carácter letra minúscula, llame a un método que
imprime por pantalla la tabla de multiplicar del 9.
 */

public class ej6 {
    public static final int MAX = 10;
    public static void main(String[] args) {
        resolverEjercicio();
    }

    public static void resolverEjercicio (){
        char caracter = 'a';
        while (esMinuscula(caracter)) {
            caracter = ingresarCaracter();
            tablaDel9();
        }
        
    }
    public static void tablaDel9 (){
        System.out.println("Tabla del 9: ");
        for (int i = 1; i <= MAX; i++){
            int multiplicación = 9*i;
            System.out.println("9*"+ i + " = " + multiplicación);
        }
    }
    public static char ingresarCaracter() {
        char caracter;
        System.out.println("Ingrese un caracter: ");
        caracter = Utils.leerChar();
        return caracter;
    }
    public static boolean esMinuscula(char caracter){
        return caracter >= 'a' && caracter <= 'z';
    }
}
