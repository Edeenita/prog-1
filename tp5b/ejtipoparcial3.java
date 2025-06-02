/*
3. Asignación de aulas
La Facultad de Exactas debe asignar aulas para una fecha de examen en la cual hay distintas materias que
tomarán finales en el mismo horario. Dicha asignación se realiza en base a la cantidad de alumnos y a la
capacidad de las aulas disponibles. Para ello, se almacena en un arreglo M de tamaño MAXM el número de
legajo de los inscriptos a cada una de las materias. Para separar cada materia, se utiliza uno o más ceros
(dado que ningún alumno posee un cero como número de legajo). Además, el arreglo M siempre comienza y
termina también con uno o más ceros. Por ejemplo, el siguiente arreglo M muestra que hay 3 materias que
tomarán examen en un mismo horario: en la primera hay 4 inscriptos, en la segunda 6 inscriptos y en la
tercera solo 3.
0 0 34 2 12 25 0 32 55 12 3 88 14 0 0 17 36 19 0 0
La facultad posee un conjunto de aulas, numeradas desde 0, disponibles para tomar exámenes según su
capacidad. La capacidad se almacena en un arreglo A de tamaño MAXA ordenado ascendentemente. En este
arreglo, el valor almacenado en la posición i se corresponde con la capacidad del aula número i. Por ejemplo,
en el siguiente arreglo A de tamaño 3, el aula nro. 1, posee capacidad para 3 alumnos.
2 3 6
Se pide implementar un programa en Java que asigne a cada materia almacenada en el arreglo M, un aula
del arreglo A. La asignación debe realizarse en el orden en que aparecen las materias en el arreglo M y
considerando, una asignación eficiente del espacio, esto es, el aula asignada debe ser aquella que deje
menos cantidad de lugares sin ocupar (y que ya no haya sido asignada). Para indicar que un aula ya ha sido
asignada, la capacidad debe ser cambiada por el valor original pero negativo. Una vez realizada la asignación
se debe eliminar la secuencia del arreglo M. En caso de no existir un aula disponible con la capacidad
necesaria, se debe informar que no se pudo asignar y se debe conservar la secuencia.
Si la cantidad de materias fuera superior a la cantidad de aulas disponibles, se debe informar que no quedan
más aulas cuando éstas hayan sido todas asignadas. Siguiendo el ejemplo, el arreglo A resultante sería:
2 -3 -6
Las asignaciones deben ser impresas por consola. En este ejemplo, las asignaciones serían: “La materia 1 se
asignó al aula 2”, “La materia 2 no se puede asignar” y “La materia 3 se asignó al aula 1.
El arreglo M resultante sería:
0 0 0 32 55 12 3 88 14 0 0 0 0 0 0 0 0 0 0 0

 */
public class ejtipoparcial3 {
    final static int MAXM = 20, MAXA = 3, SEPARADOR = 0; // M respresenta las materias, A representa las Aulas, El separador esta en 0.
    public static void main(String[] args) {
        int []  arrMaterias = {0, 0, 34, 2, 12, 25, 0, 32, 55, 12, 3, 88, 14, 0, 0, 17, 36, 19, 0, 0};
        int [] arrAulas = {2,3,6};
        resolverEjParcial(arrMaterias, arrAulas);
        imprimirArray(arrMaterias);
        imprimirArray(arrAulas);
    }
    public static void resolverEjParcial(int [] arrMaterias, int [] arrAulas){
        int ini = 0, fin = -1;
        int materia = 1;
        while (ini < MAXM) { // Siempre que este en el arreglo busco inicio y fin
            ini = buscarInicio(arrMaterias, fin+1); // comienzo a buscar desde el fin
            if(ini < MAXM){ // si sigo en el array busco el fin de la secuencia
                fin = buscarFin(arrMaterias, ini); // busco el fin desde el inicio de la secuencia
                    int cantAlumnos = fin - ini + 1;
                    int aula = buscarAula(arrAulas, cantAlumnos);
                    if(aula > 0){
                        System.out.println("La materia " + materia + " se asigno al aula " + aula);
                        arrAulas[aula] = -arrAulas[aula];
                        eliminarSecuencia(arrMaterias, ini, fin);
                        fin = ini;
                    } else{
                        System.out.println("La materia " + materia + " no se puede asignar");
                    }
                    materia++;
                }
            }
        }
    

    public static int buscarAula(int [] arrAulas, int cantAlumnos){
        int aulaAsignable = -1;
        boolean primera = true;
        int menorDiferencia = 0;
        
        for (int i = 0; i < MAXA; i++){
            if(arrAulas[i] > 0 && arrAulas[i]>= cantAlumnos ){
                int diferencia = arrAulas[i] - cantAlumnos;
                if(primera ||diferencia < menorDiferencia){
                    aulaAsignable = i;
                    menorDiferencia = diferencia;
                    primera = false;
                }
            }
        }
        return aulaAsignable;
    }

    public static void eliminarSecuencia(int[]arr, int ini, int fin){
        for(int i = ini; i <= fin; i++){
            corrimiento_izquierda(arr, ini);
        }
    }
    public static void corrimiento_izquierda(int[] arr, int pos) {
        for (int i = pos; i < MAXM - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
    

    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAXM && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAXM && arr[pos] != SEPARADOR) {
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
