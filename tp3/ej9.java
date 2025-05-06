/*
Escribir un programa que mientras el usuario ingrese un número
entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
ingresado imprima:
a. “letra minúscula” si el carácter es una letra del abecedario en
minúscula;
b. “letra mayúscula” si el carácter es una letra del abecedario
en mayúscula;
c. “dígito” si el carácter corresponde a un número;
d. “otro” para los restantes casos de caracteres
 */
public class ej9 {
    public static void main(String[] args) {
        resolverEjercicio();
    }
    public static void resolverEjercicio(){
        int numero_entero = 1;
        while(esNumeroEnteroValido(numero_entero)) {
            numero_entero = ingresarNumero();
            if(esNumeroEnteroValido(numero_entero)){
                char caracter = ingresarCaracter();
                procesarCaracter(caracter);
            }
        }
    }

    public static int ingresarNumero() {
        int numero_entero = 0;
        System.out.println("Ingrese un numero entre 1 y 10");
        numero_entero = Utils.leerInt();
        return numero_entero;
    }
    public static void procesarCaracter(char caracter) {
        if (esMinuscula(caracter)) {
            System.out.println("letra minuscula");
        } else if (esMayuscula(caracter)){
            System.out.println("letra mayuscula");
        } else if (esDigito(caracter)){
            System.out.println("digito");
        } else{
            System.out.println("otro");
        }
    }

    public static char ingresarCaracter() {
        char caracter;
        System.out.println("Ingrese un caracter: ");
        caracter = Utils.leerChar();
        return caracter;
    }
    public static boolean esNumeroEnteroValido(int numero_entero){
        return numero_entero > 0 && numero_entero <= 10;
    }

    public static boolean esMinuscula(char caracter){
        return caracter >= 'a' && caracter <= 'z';
    }
    
    public static boolean esMayuscula(char caracter){
        return caracter >= 'A' && caracter <= 'Z';
    }
    public static boolean esDigito(char caracter){
        return caracter >= '1' && caracter <= '9';
    }
}
