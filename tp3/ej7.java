/*
Escribir un programa que mientras el usuario cargue desde
teclado un número entero distinto de 0, imprima por pantalla la
suma que se obtiene de invocar un método que calcula la
sumatoria de los primeros 200 números naturales (son números
enteros entre 1 y 200).

class
    main
    mientras que el usuario ingrese un numero != 0
        -> Suma de 200 numeros naturales
 */
public class ej7 {
    public static final int MAX = 200;
    public static void main(String[] args) {
        verificarRangos();
    }

    public static void verificarRangos(){
        int numero_entero = 1;
        while (numero_entero > 0) {
            System.out.println("Ingrese un numero entero"); //modularizable
            numero_entero = Utils.leerInt();

            if (esValido(numero_entero)) {
                sumatoria200Naturales();
            }else{
                System.out.println("No ha ingresado un numero valido");
                numero_entero = 1;
            }
        }
    }

    public static void sumatoria200Naturales (){
        int sumatoria = 0;
        for(int i = 1; i<= MAX; i++){
            sumatoria+=i;
        }
        imprimirResultado(sumatoria);
    }
    
    public static void imprimirResultado(int sumatoria){
        System.out.println("El resultado es: " + sumatoria);
    }

    public static boolean esValido(int numero_entero){
        return numero_entero > 0;
    }
}
