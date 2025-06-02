/*
8. Análisis de Sismos
Un sismógrafo ubicado en la ciudad de Mendoza, Argentina, registró una fuerte actividad sísmica en los
últimos días. Los datos están en escala de Richter, y están representados en el siguiente arreglo:
0 2.1 1.5 4.1 0 3.4 0 2.5 3.0 0 3.8 0 2.7 2.7 3.9 2.5 0 4.2 2.0 0 0
Cada día de actividad sísmica está separado por un cero. Cada secuencia representa qué sismos hubo en
esa jornada. Entonces, con la información provista, se pide:
Determinar si en periodo registrado, existió un día donde hubo un número N mínimo de temblores y cuyo
promedio diario fuese superior a M en la escala de Richter. Por ejemplo, si N=2 y M=2.6, existió dicho día
dado que la 3ra secuencia (2.5, 3.0) cumple con lo buscado.
 */
public class ejtipoparcial8 {
    final static int MAX = 21, SEPARADOR = 0, N = 2;
    final static double M = 2.6;
    public static void main(String[] args) {
        double [] arr = {0, 2.1, 1.5, 4.1, 0, 3.4, 0, 2.5, 3.0, 0, 3.8, 0, 2.7, 2.7, 3.9, 2.5, 0, 4.2, 2.0, 0, 0 };
        int ini = 0, fin = -1, tamanio = 0, secuencia = 0;
        while (ini < MAX) {
            ini = (int) buscarInicio(arr, fin+1);
            if (ini < MAX) {
                fin = (int) buscarFin(arr, ini);
                tamanio = fin - ini + 1;
                if (tamanio >= N) {
                    double promedio = promedioSecuencia(arr, ini, fin, tamanio);
                    if(promedio > M){
                        System.out.println("La secuencia " + secuencia + " promedio temblores mayores a " + M);
                    }
                }
                secuencia++;
            }
        }
    }

    public static double promedioSecuencia (double[] arr, int ini, int fin, int tamanio){
        double promedio = 0;
        for(int i = ini; i <= fin; i++){
            promedio = promedio + arr[i];
        }
        return promedio / tamanio;
    }

    public static double buscarInicio(double[] arr, int pos) {
        while (pos < MAX && arr[(int) pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static double buscarFin(double[] arr, int pos) {
        while (pos < MAX && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }




}
