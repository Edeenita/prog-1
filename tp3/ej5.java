/*
Hacer un método que dado un número entero con valor inicial 1,
haga una iteración incrementando el número de a uno hasta un
valor MAX = 4 (constante). Mientras itera deberá imprimir el
número. Luego invocarlo desde el programa principal y cuando
termina, imprimir por pantalla “terminó”.

class
    public static final int MAX = 4;
    main
    declarar variables
        -> numero_entero = 1;
    iterar numero incrementandolo
        -> dentro del ciclo imprimir numeros
    imprimir terminó


 */
public class ej5 {
    public static final int MAX = 4;
    public static void main(String[] args) {
        incrementarNumero();
    }
    public static void incrementarNumero(){
        int numero_entero = 1;
        for(int i = numero_entero; i <= MAX; i++){
            mostrarNumeroEntero(i);
        }
        System.out.println("Terminó");
    }

    public static void mostrarNumeroEntero (int numero_entero){
        System.out.println(numero_entero);
    }
}
