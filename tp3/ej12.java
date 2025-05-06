/*
Escribir un programa que simule 1000 lanzamientos de un dado
y muestre por pantalla cuántas veces salió el valor del dado
correspondiente al número entero N ingresado por el usuario.
Considerar que el valor N ingresado se corresponda a un valor
posible para un dado. Usar la sentencia Math.random() que
devuelve un valor aleatorio real entre 0 y 1.
Para asignar un posible valor a la variable dado entero:
dado = (int) (6*Math.random() + 1)

 */
public class ej12 {
    public static final int MAX = 1000;
    public static void main(String[] args) {
        resolverEjercicio();
    }

    public static void resolverEjercicio() {
        int cara = pedirCara();
        int contador = 0;
        int tiradaDado = 0;
        for(int i = 1;  i <= MAX; i++){
            tiradaDado = lanzamientoDado();
            if (esIgual(cara, tiradaDado)) {
                contador++;
            }
        }
        imprimirResultado(cara, contador);
    }

    public static void imprimirResultado(int cara, int contador) {
        System.out.println("La cara " + cara + " ha salido: " + contador + " veces" );
    }

    public static boolean esIgual(int cara, int tiradaDado) {
        return cara == tiradaDado;
    }

    public static int lanzamientoDado() {
        int dado = 0;
        dado = (int) (6*Math.random() + 1);
        return dado;
    }

    public static int pedirCara() {
        int cara_dado = 0;
        while (!(esValido(cara_dado))) {
            System.out.println("Ingrese un numero entre 1 y 6");
            cara_dado = Utils.leerInt();
        }
        return cara_dado;
    }

    public static boolean esValido(int a) {
        return a >= 1 && a <= 6;
    }

}
