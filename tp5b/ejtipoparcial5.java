/*
5. Casa de empanadas
Los pedidos que recibe una casa de empanadas se almacenan en un arreglo E de tamaño MAXE. Cada tipo
de empanada se almacena con un número diferente, por ejemplo, el 5 representa la empanada de carne
cortada a cuchillo mientras que el 7 representa la empanada de roquefort. Cada pedido está separado por
uno o más números negativos (ya que los códigos son todos valores positivos incluyendo el 0). Para facilitar
el proceso de producción los códigos de las empanadas están almacenadas en forma ascendente. En el
siguiente ejemplo, tenemos 3 pedidos. El primero incluye 2 empanadas de carne cortada a cuchillo (5) y 2 de
roquefort (7).
-1 5 5 7 7 -6 4 9 10 -4 1 1 2 7 -9 -8
Si un cliente se olvida de alguna empanada, puede agregarla luego de realizado el pedido. Para ellos debe
indicar el número de pedido (es el orden del pedido dentro del arreglo) y el gusto de la empanada que quiere
agregar.
Se pide implementar un programa en Java que permita incorporar la empanada faltante al pedido del cliente.
Siguiendo con el ejemplo, si el cliente quiere agregar una empanada de roquefort en el pedido 2. El arreglo
resultante debería ser:
-1 5 5 7 7 -6 4 7 9 10 -4 1 1 2 7 -9
 */
public class ejtipoparcial5 {
    final static int MAXE = 16;
    public static void main(String[] args) {
        int[] arrE = {-1, 5, 5, 7, 7, -6, 4, 9, 10, -4, 1, 1, 2, 7, -9, -8 };
        int ini = 0, fin = -1;
        int pedidoFaltante = 2;
        int pedido = 1;
        int empanadaRoquefort = 7;
        while (ini < MAXE) {
            ini = buscarInicio(arrE, fin+1);
            if (ini < MAXE) {
                fin = buscarFin(arrE, ini);
                if (pedido == pedidoFaltante) { 
                    agregarPedido(arrE,ini, fin, empanadaRoquefort);
                    fin = fin + 1;
                }
                pedido++;
            }
        }
        imprimirArray(arrE);
    }

    public static void agregarPedido(int[] arrE,int ini, int fin, int empanada){
        boolean seInterto = false;
        while(ini < fin && !seInterto){
            if(arrE[ini] < arrE[ini+1]){
                añadirEmpanada(arrE, ini, empanada);
                seInterto = true;
            }else{
                ini++;
            }
        }
    }

    public static void añadirEmpanada(int []arr , int pos, int empanada){
        for(int i = MAXE - 1; i > pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos+1] = empanada;
    }
    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAXE && arr[pos] < 0) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAXE && arr[pos] >= 0) {
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
