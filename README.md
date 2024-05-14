# Repositorio de Trabajos Prácticos - Programación 1

Este repositorio contiene los trabajos prácticos realizados en la materia de Programación 1 de TUDAI. 
Los trabajos están organizados según su estado de avance: Subidos y Por realizar.

## Trabajos Prácticos Subidos

1. **Variables, Constantes y Operadores**: Introducción a los conceptos básicos de variables, constantes y operadores en JAVA.

2. **Selectivas e Iterativas**: Ejercicios que abordan estructuras de control selectivas (if-else, switch-case) e iterativas (for, while) en JAVA.

3. **Diseño Descendente**: 

4. **Análisis de Código y Debugging**: 

## Trabajos Prácticos Por Realizar

5. **Arrays**: 

6. **Matrices**: 

## Instrucciones de Uso

- Cada carpeta de trabajo práctico contiene el enunciado del ejercicio y, el código y/o soluciones. 

## ARRAYS

**Declaración de un array**

- Nulo
int [] arrDatos;

-Todo cero
int [] arrDatos = new int [5];

-Datos cargados

int [] arrDatos = {9, 6, 4, 2, 5};

**Acceder a un array**

- Accede a la posición 0 del array y le asigna el valor 1
arrDatos[0] = 1;

- Accede a la posición del array mediante una variable pos y se le asigna valor 5
- pos tiene valor entre 0 y CANTIDAD-1 (ya que los arrays empiezan a contar desde el indice 0)
pos = 2;
arreDatos[pos] = 5;

**Codigos sobre arrays**

- Mostrar array:
public staic void mostrarArray ( int[] arrEnteros ){
    for (int pos = 0; pos < MAX; pos++){
        System.out.println ("arrEnteros["+ pos +"] -> " + arrEnteros[pos]);
    }
}

- Cargar array de tipo entero por teclado:
public staic void cargarArray ( int[] arrEnteros ){
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    try{
        for (int pos = 0; pos < MAX; pos++){
            System.out.println ("Ingrese el entero de la posición: " + pos);
            arrEnteros[pos] =  Integer.valueOf(entrada.readLine());
        }
    }
    catch(Exception exc){
        System.out.println(exc)
    }
}

-Cargar array de tipo char por teclado:
public static void cargarArray(char[] arrChar) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int pos = 0; pos < MAX; pos++) {
                System.out.println("Ingrese el carácter de la posición: " + pos);
                arrChar[pos] = entrada.readLine().charAt(0); 
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

- Obtener posición de un elemento del array
public static int obtenerNumero (){
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    try{
        System.out.println("Ingrese un num entero: ")
        num = Integer.valueOf(entrada.readLine());
    }
    catch(Exeption exc){
        System.out.println(exc);
    }
}

- Obtener pos del array
public static int obtener_pos_arr (int [] arr, int num){
    int pos = 0;
    while ((pos < MAX) && (arr[posicion]) != num){
        pos ++;
    }
    return pos;
}

- Corrimiento a la derecha
Se utiliza para insertar un elemento a un array

- Corrimiento a la izquierda
Se utiliza para eliminar un elemento de un array

- **Estructuras ordenadas**
- Desordenado
private static int buscar_pos_desordenado (int [] arr, int valor){
    int pos = 0;
    while ((pos < MAX) && (arr[pos] != valor)){
        pos++
    }
    if (pos < MAX){
        return pos;
    } else {
        return -1;
    }
}

- Ordenado
private static int buscar_pos_ordenado (int [] arr, int valor){
    int pos = 0;
    while ((pos < MAX) && (arr[pos] > valor)){ // > para decreciente y < para creciente
        pos++
    }
    if ((pos < MAX) && (arr[pos] == valor) ){
        return pos;
    } else {
        return -1;
    }
}

- **Metodos de ordenamiento**
Selección
public static void seleccion(int arr[]) {
    int i, j, menor, pos, tmp;
    for (i = 0; i < MAX; i++) { // tomamos como menor el primero
        menor = arr[i]; // de los elementos que quedan por ordenar
        pos = i; // y guardamos su posición
        for (j = i + 1; j < MAX; j++){ // buscamos en el resto
            if (arr[j] < menor) { // del array algún elemento
            menor = arr[j]; // menor que el actual
            pos = j;
        }
    }
    if (pos != i){ // si hay alguno menor se intercambia
        tmp = arr[i];
        arr[i] = arr[pos];
        arr[pos] = tmp;
        }
    }
}

- Inserción
    public static void insercion(int arr[]){
        for (int i = 1; i < MAX; i++) {
            int aux = arr[i];
            int j = i - 1;
            while ((j >= 0) && (arr[j] > aux)){
            arr[j+1] = arr[j];
            j--;
        }           
        arr[j+1] = aux;
    }
}

- Burbujeo
public static void burbujeo(int[] arr){
    int temp;
    for(int i = 1;i < MAX;i++){
        for (int j = 0 ; j < MAX - 1; j++){
            if (arr[j] > arr[j+1]){
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            }
        }
    }
}

**Tips**
- Declarar MAX como variable global
public final static int MAX = 10;
(se declara antes del metodo main, abajo del public class);

## Contribución
**Edena**

## Tips y buenas practicas:
*todavia no las puse*

![](https://img.desmotivaciones.es/201102/java.jpg)
>Sin memes no podría aguantar la demencia
