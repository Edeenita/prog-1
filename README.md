# CORRIMIENTOS

```java
public static void corrimiento_izquierda(int[] arr, int pos){
    for(int i = pos; i < MAX -1; i++ ){
        arr[i] = arr[i+1];
    }
}

public static void corrimiento_derecha(int[] arr, int pos){
    for(int i = MAX-1; i > pos; i-- ){
        arr[i] = arr[i-1];
    }
}
```
# BUSCAR INICIO Y FIN

```java
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
```
# ELIMINAR UNA SECUENCIA
```java
    public static void eliminarSecuencia(int[]arr, int ini, int fin){
        for(int i = ini; i <= fin; i++){
            corriento_izquierda(arr, ini);
        }
    }
```

# AÑADIR UNA SECUENCIA DADO UN ARREGLO 
```java
    public static void aniadirSecuencia(int[] arrA, int[]arrR, int iniA, int finA){
        moverSecuencia(arrA, iniA, finA);
        int j = 0;
        for(int i = iniA; i <= finA; i++){
            arrA[i] = arrR[j];
            j++;
        }

    }
    
    public static void moverSecuencia(int[]arr, int ini, int fin){
        for(int i = ini; i <= fin; i++){
            corrimiento_derecha(arr, ini);
        }
    }
```

# INVERTIR UNA SECUENCIA
```java
    public static void invertirUltSecuencia(int[] arr, int ultFin, int ultIni) {
        int tamanio = ultFin - ultIni + 1;
        int [] arrAux = new int[tamanio];
        for (int i = 0; i < tamanio; i++){
            arrAux[i] = arr[ultIni+i];
        }
        for(int j = 0; j < tamanio; j++){
            arr[ultIni + j] = arrAux[tamanio - 1 - j ];
        }
    }
    //en el metodo donde buscar la secuencia
    int ini = 0, fin = - 1;
    int ultIni = -1, ultFin = -1;
        while(ini < MAX){
            ini = obtener_inicio(arr, fin+1);
            if(ini < MAX){
                fin = obtener_fin(arr, ini);
                ultFin = fin;
                ultIni = ini;
            }
// Si queremos obtener alguna otra posicion como la anteultima
    while (ini < MAX) {
        ini = buscarInicio(arrInt, fin + 1);
        if (ini < MAX) {
            fin = buscarFin(arrInt, ini);

            anteUltIni = ultIni;
            anteUltFin = ultFin;
                
            ultIni = ini;
            ultFin = fin;
```

# COMO SABER SI UNA SECUENCIA CUMPLE CON UN PATRON
```java
    public static boolean esPatron(int[] arrInt, int [] arrPatron, int ini, int fin, int tamanio){
        boolean esPatron = false;
        int pos = 0;
        for(int i = ini; i <= fin; i++){
            if (arrPatron[pos] == arrInt[i] ) {
                pos++;
            }
        }
        if(pos==tamanio){
            esPatron = true;
        }
        return esPatron;
    }
```
# OBTENER INICIO Y FIN DE SECUENCIA DE MAYOR TAMAÑO
```java
tamanio = fin - ini + 1;
if(tamanio > tamanioMayor){
    tamanioMayor = tamanio;
    iniMayor = ini;
    finMayor = fin;
```



