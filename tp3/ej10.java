/*
Escribir un programa que mientras el usuario ingrese un
número entero entre 1 y 10 realice:
a. Si el numero ingresado es múltiplo de 3 pida ingresar un
caracter y para el caracter ingresado imprima a qué tipo de
carácter está asociado:
i. “letra minúscula” si el carácter es una letra del
abecedario en minúscula;
ii. “letra mayúscula” si el carácter es una letra del
abecedario en mayúscula;
iii. “dígito” si el carácter corresponde a un número;
iv. “otro” para los restantes casos de caracteres.
b. Si el número ingresado es múltiplo de 5 imprima la tabla de
multiplicar del número ingresado
 */
public class ej10 {
    public static final int MAX = 10;
    public static void main(String[] args) {
        resolverEjercicio();
    }
    public static void resolverEjercicio(){
        int numero_entero = 1;
        while(esNumeroEnteroValido(numero_entero)) {
                numero_entero = ingresarNumero();
                if (esMultiploDe3(numero_entero) && esNumeroEnteroValido(numero_entero)) {
                    char caracter = ingresarCaracter();
                    procesarCaracter(caracter);
                } else if (esMultiploDe5(numero_entero) && esNumeroEnteroValido(numero_entero)){
                        imprimirTabla(numero_entero);
                    }
                }
            }

    public static void imprimirTabla (int numero_entero){
            System.out.println("Tabla del " + numero_entero);
            for (int i = 1; i <= MAX; i++ ){
                int multiplicar = i*numero_entero;
                System.out.println(i+"*"+numero_entero+"=" + multiplicar );
            }
        }
    public static int ingresarNumero() {
        int numero_entero = 0;
        System.out.println("Ingrese un numero entre 1 y 10");
        numero_entero = Utils.leerInt();
        return numero_entero;
    }
    public static boolean esNumeroEnteroValido(int numero_entero){
        return numero_entero > 0 && numero_entero <= 10;
    }

    public static char ingresarCaracter() {
        char caracter;
        System.out.println("Ingrese un caracter: ");
        caracter = Utils.leerChar();
        return caracter;
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
    public static boolean esMultiploDe5(int numero_entero) {
        return numero_entero % 5 == 0;
    }
    public static boolean esMultiploDe3(int numero_entero) {
        return numero_entero % 3 == 0;
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
