public class ej25 {
    static final int MAX = 20, SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arrInt = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0, 1, 31, 1, 1, 0,1 ,1, 0, 2, 0};
        procesarArray(arrInt);
    }
    public static void procesarArray(int[] arrInt) {
        int ini = 0, fin = -1; 
        int anteUltIni = -1, anteUltFin = -1;
        int ultIni = -1, ultFin = -1;

        while (ini < MAX) {
            ini = buscarInicio(arrInt, fin + 1);
            if (ini < MAX) {
                fin = buscarFin(arrInt, ini);

                anteUltIni = ultIni;
                anteUltFin = ultFin;
                
                ultIni = ini;
                ultFin = fin;
            }
        }
        System.out.println("inicio " + anteUltIni + " y el fin: " + anteUltFin);
        System.out.println();
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
