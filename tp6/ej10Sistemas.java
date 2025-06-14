/*//Dada una matriz de secuencias de caracteres definida y precargada, 
//eliminar de cada fila todas las ocurrencias de una secuencia patrón. 
//Dicha secuencia patrón está en un arreglo de caracteres de tamaño igual al 
//tamaño de columnas de la matriz (tiene únicamente esa secuencia con separadores 
//al inicio y al final). */
public class ej10Sistemas {
    final static int FILAS = 4;
    final static int COLUMNAS = 10;
    final static int SEPARADOR = ' ';
    public static void main (String [] args){
        char[][] matriz = {
            {' ', 'A', 'B', ' ', 'C', ' ', ' ', 'D', 'E', ' '},
            {' ', ' ', ' ', 'A', 'B', ' ', ' ', ' ', 'J', ' '},
            {' ', 'K', 'L', ' ', ' ', 'A', 'B', ' ', ' ', ' '},
            {' ', ' ', ' ', 'Q', 'R', ' ', ' ', 'A', 'B', ' '}
            };

        char [] patron = {' ', 'A', 'B', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        for (int i = 0; i < FILAS; i++){
            System.out.println("Procesando fila " + i);
            buscarSecuencia (matriz [i], patron);
        }
        
        imprimirMatriz (matriz);
    }
    
    private static void buscarSecuencia (char [] matriz, char [] patron){
        int iniP = 0;
        int finP = -1;
        iniP = buscarInicio (patron,finP+1);
        finP = buscarFin (patron, iniP);
        
        int ini = 0;
        int fin = -1;
        
        while (ini < COLUMNAS){
            ini = buscarInicio (matriz, fin+1);
            if (ini < COLUMNAS){
                fin = buscarFin (matriz, ini);
                if (comparar (matriz, patron, ini, fin, iniP, finP)){
                    eliminarSecuencia (matriz, ini, fin);
                    fin = ini - 1;
                } else{
                    ini = fin + 1;
                }
            }
        }
    }
    
    private static int buscarInicio (char [] arr, int pos){
        while (pos < COLUMNAS && arr[pos] == SEPARADOR){
            pos++;
        }
        return pos;
    }
    private static int buscarFin (char [] arr, int pos){
        while (pos < COLUMNAS && arr[pos] != SEPARADOR){
            pos++;
        }
        return pos-1;
    }
    
    private static boolean comparar (char [] matriz, char [] patron, int ini, int fin, int iniP, int finP){
        int cantElementosP = finP - iniP + 1;
        int cantElementos = fin - ini + 1;
            
        if (cantElementosP != cantElementos){
            return false;
            }
            
        while (ini <= fin && matriz [ini] == patron [iniP]){ //No es ini <= fin porque sino sobrepasa una posicion mas.
                ini++;
                iniP++;
            }
        return ini == fin + 1;
    }
    
    private static void eliminarSecuencia (char [] matriz, int ini, int fin){
        for (int i = ini; i <= fin; i++){
            corrimientoIzquierda (matriz, ini);
        }
    }
    
    private static void corrimientoIzquierda (char [] matriz, int ini){
        for (int i = ini; i < COLUMNAS-1; i++){
            matriz [i] = matriz [i+1];
        }
    }
    
    private static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
