/*
6. Productos de regalo
Un reconocido supermercado de venta online ha decidido regalar productos a modo de promoción en todos
sus pedidos. Cada producto está identificado con un valor numérico mayor a 0. Los pedidos recibidos se
almacenan en un arreglo P de tamaño MAXP que comienza y finaliza con uno o más 0. Cada pedido está
compuesto por una serie de productos y separados entre sí también por uno o más 0. Dentro de cada pedido,
los productos están ordenados de forma ascendente. A modo de ejemplo, en el siguiente arreglo P, el primer
pedido está compuesto por los productos 9, 12 y 18. En total hay 4 pedidos.
0 0 9 12 18 0 1 5 43 73 88 0 8 9 52 0 1 10 90 0 0 0 0 0 0 0 0 0
Se pide realizar un programa en Java que permita incorporar a cada pedido los productos promocionados
que están almacenados en un arreglo R de tamaño MAXR. La incorporación de los productos se deberá
realizar respetando el orden ascendente de los productos de cada pedido. Se pide además informar la
cantidad de productos regalados en total.
Continuando con el ejemplo, dado un arreglo R = {44, 6} con MAXR = 2 el arreglo resultante será:
0 0 6 9 12 18 44 0 1 5 6 43 44 73 88 0 6 8 9 44 52 0 1 6 10 44 90 0
En el ejemplo, la cantidad total de productos regalados fue 8.
 */
public class ejtipoparcial6 {
    final static int MAXP = 30;
    final static int MAXR = 2;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[] arrP = {0,0,9,12,18,0,1,5,43,73,88,0,8,9,52,0,1,10,90,0,0,0,0,0,0,0,0,0,0,0};
        int[] arrR = {44,6};

        mostrarArreglo(arrP,MAXP);
        System.out.println("Productos promocionados:");
        mostrarArreglo(arrR,MAXR);
        procesarSecuencia(arrP, arrR);
        System.out.println("Promociones aplicadas en cada compra:");
        mostrarArreglo(arrP,MAXP);

    }

    public static void procesarSecuencia(int[] arrP, int[] arrR) {
        int inicio = 0;
        int fin = -1;
        int producto = 0;
        int cont = 0;

        while (inicio < MAXP) {
            inicio = buscarInicio(arrP, fin + 1);
            if (inicio < MAXP) {
                fin = buscarFin(arrP, inicio);
                for(int pos = 0; pos < MAXR; pos++) {
                    producto = arrR[pos];
                    insertarOrdenadosAsc(arrP, inicio, fin, producto);
                    cont++;
                }
                fin+=2;
            }
        }
        System.out.println("La cantidad de productos regalados fue: "+cont);
    }

    public static void insertarOrdenadosAsc(int[] arrP,int ini, int fin, int producto) {
        while(ini <= fin && arrP[ini] <= producto) {
            ini++;
        }
        correrDerecha(arrP, ini);
        arrP[ini] = producto;

    }

    public static void correrDerecha(int[] arr, int pos) {
        for(int i = MAXP - 1; i > pos; i--) {
            arr[i] = arr[i-1];
        }
    }

    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAXP && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAXP && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void mostrarArreglo(int[] arr, int MAX) {
        for(int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }
}

