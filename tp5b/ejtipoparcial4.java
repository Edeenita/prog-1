/*
4. Ventas en supermercado online
Un reconocido supermercado de venta online ha decidido incorporar productos a modo de promoción en
aquellos pedidos que cumplen con ciertos requisitos. Cada producto está identificado con un valor numérico
mayor a 0. Los pedidos recibidos se almacenan en un arreglo P de tamaño MAXP que comienza y finaliza con
uno o más 0. Cada pedido está compuesto por una serie de productos y separados entre sí también por uno o
más 0. A modo de ejemplo, en el siguiente arreglo P, el primer pedido está compuesto por los productos 12, 9
y 18. En total hay 4 pedidos.
0 0 12 9 18 0 15 5 4 7 10 0 8 9 12 0 19 10 9 0 0 0 0 0 0
Se pide realizar un programa en Java que permita incorporar un producto promocionado R en aquellos
pedidos que posean al menos uno de los productos almacenados en un arreglo T de tamaño MAXT
(ordenado en forma ascendente). Debido a que solo se cuenta con una cantidad C del producto
promocionado R, sólo serán incorporados en los primeros pedidos que cumplan con el requisito antes
mencionado. La incorporación del producto se realiza al final del pedido.
Continuando con el ejemplo, dado un arreglo T = {8, 9} con MAXT = 2, un producto promocionado R = 22 y
una cantidad C = 2, el arreglo resultante será:
0 0 12 9 18 22 0 15 5 4 7 10 0 8 9 12 22 0 19 10 9 0 0 0 0
Por último, se debe indicar cuántos productos R quedaron sin agregar a los pedidos. En dicho ejemplo no
quedaron productos por agregar
 */
public class ejtipoparcial4 {
    final static int MAXP = 20, MAXT = 2, SEPARADOR = 0; 
    public static void main(String[] args) {
        int[] arrP = {0, 0, 12, 9, 18, 0, 15, 5, 4, 7, 10, 0, 8, 9, 12, 0, 19, 10, 9, 0, 0, 0, 0, 0, 0};
        int[] arrT = {8,9};
        int r = 22; // aqui el dueño deberia cargar el producto en promoción
        int c = 2; // aqui el dueño deberia cargar la cantidad de veces que se hará la promoción
        int ini = 0, fin = -1;
        while (c > 0 && ini < MAXP) {
            ini = buscarInicio(arrP, fin+1);
            if (ini < MAXP) {
                fin = buscarFin(arrP, ini);
                if (buscarPatron(arrP, arrT, ini, fin)) {
                    añadirElemento(arrP, fin, r);
                    fin = ini + 1; // ya que se abrá agregado un elemento a la secuencia! 
                    c--;
                }
            }
        }
        System.out.println("Quedaron " + c + " productos " + r + " sin entregar");
        imprimirArray(arrP);
    }

    public static boolean buscarPatron (int[]arrP, int[] arrT, int ini, int fin){
        int i = ini;
        int posT = 0;
        boolean encontreElemento = false;
        while (posT < 2 && !encontreElemento) {
            while(!encontreElemento && i <= fin){
                if(arrT[posT] != arrP[i]) {
                    i++;
                }else{
                        encontreElemento = true;
                    }
                }
            if(!encontreElemento){
                posT++;
                i = ini; // !!!!!!!!!!!
            }    
        }
        return encontreElemento;
    }
    public static void añadirElemento(int[] arrP, int pos, int r) {
        for (int i = MAXP - 1; i > pos + 1; i--) {
            arrP[i] = arrP[i - 1];
        }
        arrP[pos + 1] = r; // !!!!!!!!
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
    public static void imprimirArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
