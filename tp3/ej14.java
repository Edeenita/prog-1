/*
Escribir un programa que mientras el usuario ingresa un
carácter distinto del carácter ‘*’, invoque a un método que imprima
si es carácter dígito o carácter letra minúscula, y si es letra
minúscula imprimir si es vocal o consonante.
 */
public class ej14 {
    public static void main(String[] args) {
        resolverEjercicio();
    }
    public static void resolverEjercicio(){
        char caracter = ' ';
        while (esCaracterValido(caracter)) {
            caracter = pedirCaracter();
            procesarCaracter(caracter);
        }
    }
    public static void procesarCaracter(char caracter) {
        if (esDigito(caracter)) {
            System.out.println("Es dígito");
        } else if (esMinuscula(caracter)) {
            if (esVocal(caracter)) {
                System.out.println("Es vocal minúscula");
            } else {
                System.out.println("Es consonante minúscula");
            }
        } else {
            System.out.println("No ha ingresado un digito o minuscula");
        }
    }
    public static boolean esCaracterValido(char caracter){
        return caracter != '*';
    }

    public static char pedirCaracter() {
        char caracter = ' ';
            System.out.println("Ingrese un caracter diferente de *, digito o minuscula");
            caracter = Utils.leerChar();
        return caracter;
    }
    public static boolean esDigito(char caracter) {
        return caracter >= '0' && caracter <= '9';
    }

    public static boolean esMinuscula(char caracter) {
        return caracter >= 'a' && caracter <= 'z';
    }

    public static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}
