/*
El bar Tito recibe todos los días comensales y debe tratar de ubicar las mesas lo más eficientemente posible
para optimizar el uso del salón. Para ello cada cliente que ingresa se registra ingresando la cantidad de
personas que van a ocupar una mesa. El registro se realiza en un arreglo C de tamaño MAXC inicializado con
ceros y cada nuevo registro se pone en la última posición libre. En este ejemplo se puede observar que hay
en espera para ocupar 6 mesas: la primera para 4 personas, la segunda para 3, la tercera para 8, la cuarta
para 6, la quinta para 2 y la sexta para 12.
4 3 8 6 2 12 0 0 0 0 0 0 0 0 0 0 0 0 0 0
Por otro lado, se tiene un conjunto de mesas numeradas desde 0 disponibles para ser ocupadas según su
capacidad. La capacidad se almacena en un arreglo M de tamaño MAXM ordenado ascendentemente. En
este arreglo, el valor almacenado en la posición i se corresponde con la capacidad de la mesa número i. Por
ejemplo, en el siguiente arreglo M de tamaño 5, la mesa nro. 1, posee capacidad para 3 personas.
2 3 5 6 12
Se pide implementar un programa en Java que asigne a cada cliente (cantidad de personas) en el arreglo C,
una mesa del arreglo M. La asignación debe realizarse en el orden en que aparecen los pedidos de mesa en
el arreglo C y considerando, en todo momento, una asignación eficiente del espacio, esto es, la mesa
asignada debe ser aquella que deje menos cantidad de lugares sin ocupar (y que ya no haya sido asignada).
Para indicar que una mesa ya ha sido asignada, la capacidad debe ser cambiada por el valor original pero
negativo. Una vez realizada la asignación se debe eliminar el valor del arreglo C. En caso de no existir una
mesa disponible con la capacidad necesaria, se debe informar que no se pudo asignar y se debe conservar el
valor en el arreglo.
Si la cantidad de pedidos de mesa fuera superior a la cantidad de mesas disponibles, se debe informar que no
quedan más mesas cuando éstas hayan sido todas asignadas. Siguiendo el ejemplo, el arreglo resultante
sería:
-2 -3 -5 -6 -12
Las asignaciones deben ser impresas por consola. En este ejemplo, las asignaciones serían: “El cliente 1 se
asignó a la mesa 2”, “El cliente 2 se asignó a la mesa 1”, “El cliente 3 se asignó a la mesa 4”, “El cliente 4 se
asignó a la mesa 3”, “El cliente 5 se asignó a la mesa 0” y “No quedan más mesas para asignar clientes”
El arreglo C resultante sería:
12 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 */
public class ejtipoparcial2 { 
    final static int MAX = 20, SEPARADOR = 0, MAXM=5;
    public static void main(String[] args) {
        int[] arrC = { 4, 3, 8, 6, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int [] arrM = {2,3,5,6,12};
        resolverEjParcial(arrC,arrM);
        imprimirArray(arrC);
        imprimirArray(arrM);

    }

    public static void resolverEjParcial(int[] arr, int[]arrM) {
        int ini = 0, fin = -1, mesa = -1, cliente = 1;
        while (ini < MAX) {
            ini = buscarInicio(arr, fin + 1);
            if (ini < MAX) {
                fin = buscarFin(arr, ini);
                int i = ini;
                while(i<=fin){
                        mesa = buscarMesa(arrM, arr[i]);
                        if(mesa != -1){
                            System.out.println("El cliente " + cliente + " se asignó a la mesa " + mesa);
                            arrM[mesa] = -arrM[mesa];
                            eliminarElemento(arr, i); 
                            cliente++;
                            fin--;
                        }else{
                            System.out.println("No quedan más mesas para asignar clientes.");
                            i++;
                        }
                    }
                }
            }
    }
        
    public static int buscarMesa(int[] arrM, int cantPersonas) {
        int mesaAsignable = -1;
        boolean primera = true;
        int menorDiferencia = 0;
    
        for (int i = 0; i < MAXM; i++) { // recorremos M
            if (arrM[i] > 0 && arrM[i] >= cantPersonas) { //cantidad de personas es lo que está en arr[i]
                int diferencia = arrM[i] - cantPersonas;
                if (primera || diferencia < menorDiferencia) { // el boolean es para que entre a la primera si o si
                    mesaAsignable = i;
                    menorDiferencia = diferencia;
                    primera = false;
                }
            }
        }
        return mesaAsignable;
    }
    
        public static void eliminarElemento(int[] arr, int pos) {
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
        
    public static void imprimirArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
