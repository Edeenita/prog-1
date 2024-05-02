package tp3.modularizacion;

/*
 * Hacer un método que dado un número entero con valor inicial 1,
 * haga una iteración incrementando el número de a uno hasta un
 * valor MAX = 4 (constante). Mientras itera deberá imprimir el
 * número. Luego invocarlo desde el programa principal y cuando
 * termina, imprimir por pantalla “terminó”.
 */

public class ej5 {
    public static void main(String[] args) {
        try {
            iteracion();
            System.out.println("Terminó.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void iteracion(){
        final int MAX = 4;
        for(int valor_inicial = 1; valor_inicial <= MAX; valor_inicial++){
            System.out.println(valor_inicial);
        }
    }
}
