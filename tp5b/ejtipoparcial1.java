/*
Un dispositivo que toma imágenes de un fenómeno natural está corriendo sobre una plataforma tecnológica
con recursos limitados. Cada imagen (representada por una matriz de NxM) está compuesta por píxeles con
valores entre 0 y 255. Se desea implementar un algoritmo de compresión que comprima aquellas porciones
de la imagen distintas del color negro (0 en la escala de valores del pixel). Se debe implementar la solución
para un arreglo (luego dicha solución se reutilizará en un futuro para cada fila de la matriz). Para ello, se pide
realizar un programa en JAVA que, dado un arreglo de tamaño M, para cada secuencia delimitada por uno o
mas pixeles de color negro (valor 0) con más de X repeticiones de un valor de píxel (todos los elementos de la
secuencia deben ser iguales), comprima la secuencia poniendo en la primera posición el valor negado de la
cantidad de ocurrencias y a continuación el valor del pixel que se repite. El arreglo empieza y termina con un
separador 0 (color negro). Implementar usando las buenas prácticas de programación estructurada vistas en
la cátedra.
Ejemplo:
Arreglo que tiene una fila de la imagen:
0 67 67 67 67 67 67 67 67 0 14 0 33 33 33 33 0 5 98 0
El arreglo quedaría de la siguiente forma, para un X=3:
0 -8 67 0 14 0 -4 33 0 5 98 0 0 0 0 0 0 0 0 0
 */
public class ejtipoparcial1 {
    final static int MAX = 20, SEPARADOR = 0, X = 3; // x como constante

    public static void main(String[] args) {
        int[] arr = { 0, 67, 67, 67, 67, 67, 67, 67, 67, 0, 14, 0, 33, 33, 33, 33, 0, 5, 98, 0 };
        resolverEjParcial(arr);

        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void resolverEjParcial(int[] arr) {
        int ini = 0, fin = -1;
        while (ini < MAX) {
            ini = buscarInicio(arr, fin + 1);
            if (ini < MAX) {
                fin = buscarFin(arr, ini);
                if (sonTodosIguales(arr, ini, fin)) {
                    comprimirSecuencia(arr, ini, fin);
                    fin = ini + 2;
                }
            }
        }
    }

    public static boolean sonTodosIguales(int[] arr, int ini, int fin) {
        if (fin - ini + 1 < X) {
            return false;
        }

        while (ini < fin && arr[ini] == arr[ini + 1]) {
            ini++;
        }
        return ini == fin;
    }

    public static void comprimirSecuencia(int[] arr, int ini, int fin) {
        int cant_elementos = 2; //  empieza en 2
        for (int i = ini; i < fin - 1; i++) {
            corrimiento_izquierda(arr, ini);
            cant_elementos++;
        }
        arr[ini] = cant_elementos * -1;
    }

    public static void corrimiento_izquierda(int[] arr, int pos) {
        for (int i = pos; i < MAX - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }
}