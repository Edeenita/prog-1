/*
Escribir un método que retorne el mayor de dos números. Usar
ese método para calcular el máximo de una serie de números
ingresados por el usuario (20 números en total).
 */
public class ej11 {
    public static int MAX = 20;
    public static void main(String[] args) {
        resolverEjercicio();
    }
    public static void resolverEjercicio(){
        int numero = 0;
        int mayor = 0;

        for(int i = 1; i <= MAX; i++){
            numero = ingresarNumero();
            if(esMayor(numero, mayor)){
                mayor = numero;
            }
        }
        System.out.println("El numero mayor es: " + mayor);

    }
    public static boolean esMayor(int a, int b){
        return a > b;
    }

    public static int ingresarNumero() {
        int numero_entero = 0;
        while (!(esValido(numero_entero))) {
            System.out.println("Ingrese un numero entre 1 y 10");
            numero_entero = Utils.leerInt();
        }
        return numero_entero;
    }
    public static boolean esValido(int a) {
        return a >= 1 && a <= 10;
    }
}
