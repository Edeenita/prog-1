/*
Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado.
*/
class ej1 {
    public static final int MAX = 15;

    public static void main(String[] args) {
        int[] array = new int[MAX];
        cargarArray(array);
        mostrarArray(array);
    }

    public static void cargarArray(int[] array) {
        int valor_valido = 1;
        int pos = 0;
        while (pos < MAX) {
            System.out.println("Ingrese un número valido: ");
            array[pos] = Utils.leerInt();
            if (esValido(valor_valido)) {
                pos++;
            }
        }
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < MAX; i++) {
            System.out.println("array[" + i + "] => " + array[i]);
        }
    }

    public static boolean esValido(int valor) {
        return (valor >= 1 && valor <= 12);
    }
}