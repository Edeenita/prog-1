//Promocionado con 9
public class miResolucion {
    final static int MAXT = 25;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[] arrT = {-6, -8, 10, 12, 14, 15, 20, -1, 15, 14, 13, 16, -8, -10, 2, 3, 5, 16, 26, -3, 56, 52, 54, 60, -7};
        resolverParcial(arrT);
    }
    public static void resolverParcial(int[] arrT) {
        int ini = 0;
        int fin = -1;
        int estudiante = 0;
        int totalMinutos = 0;
        int horas = 0;
        int minutos = 0;
        while (ini < MAXT) {
            ini = buscarInicio(arrT, fin + 1);
            if (ini < MAXT) {
                fin = buscarFin(arrT, ini);
                estudiante++;
                if (bajaConcentracion(arrT, ini, fin)) {
                    System.out.println("El estudiante " + estudiante + " presenta falta de concentracion"); //Algo parecido
                }
                else {
                    //Se podia modularizar !
                    totalMinutos = sumarMinutos(arrT, ini, fin);
                    horas = totalMinutos / 60; //hardcoded pero se entiende que 60 minutos por hora
                    minutos = totalMinutos % 60;
                    eliminarSecuencia(arrT, ini, fin);
                    arrT[ini] = horas;
                    arrT[ini + 1] = minutos;
                    fin = ini + 1;
                }
            }
        }
        mostrar(arrT);
    }

    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAXT && arr[pos] < SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAXT && arr[pos] >= SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static boolean bajaConcentracion(int[] arr, int ini, int fin) {
        while (ini < fin && arr[ini] >= arr[ini + 1])
            ini++;
        
        return ini == fin;
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin) {
        for (int i = ini; i < fin-1; i++) //deja los ultimos dos elementos!
            correrAIzquierda(arr, ini);
    }

    public static void correrAIzquierda(int[] arr, int pos) {
        while (pos < MAXT - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static int sumarMinutos(int[] arr, int ini, int fin) {
        int suma = 0;
        for (int i = ini; i <= fin; i++){
            suma += arr[i];
        }
        
        return suma;
    }

    public static void mostrar(int[] arr) {
        for (int i = 0; i < MAXT; i++) {
            System.out.print(" | " + arr[i]);
        }
        System.out.println();
    }
}
