/*
Realizar un programa que, dada una opción entera (1,2,3,4),
permita realizar operaciones entre tres números reales (r1,r2,r3)
ingresados desde teclado. Para la opción:
1. Calcular la raíz cuadrada de (r1-r3)
2. Calcular el promedio de r1, r2 y r3
3. Calcular cociente de la raíz cuadrada de (r3 - r2) dividida por
r1
4. Calcular el cociente del promedio de los tres valores dividido
por la raíz cuadrada de r2
Observación: La raíz cuadrada de un número se calcula con la
sentencia: Math.sqrt(numero). Hacer uso del diseño descendente
y de la modularización para la solución. Tener en cuenta posibles
errores o excepciones como la división por cero.
 */

public class ej13 {
    public static void main(String[] args) {
        realizarEjercicio();
    }
    public static void realizarEjercicio(){
            int opcion = 0;
            opcion = pedirOpcionValida();

            double r1 = 0, r2 = 0, r3 = 0;
            r1 = pedirNumeroReal();
            r2 = pedirNumeroReal();
            r3 = pedirNumeroReal();

            procesarOpcion(opcion,r1,r2,r3);
    }

    public static void procesarOpcion(int opcion, double r1, double r2, double r3) {
        switch (opcion) {
            case 1:
                calcularRaizR1R3(r1,r2);
                break;
            case 2:
                calcularPromedioRaices(r1,r2,r3);
                break;
            case 3:
                calcularCocienteRaizR3R2DividoR1(r3,r2,r1);
            break;
                case 4:
                calcularCocientePromedio(r1,r2,r3);
                break;
            default:
                break;
        }
    }
    public static void calcularCocientePromedio(double r1, double r2, double r3) {
        Double cocienteDelPromedio = 0.0;
        cocienteDelPromedio = ((r1+r2+r3) / 3) / (Math.sqrt(r2));
        System.out.println(cocienteDelPromedio);
    }
    public static void calcularCocienteRaizR3R2DividoR1(double r3, double r2, double r1) {
        double cociente = 0.0;
        cociente = (Math.sqrt(r2-r3)) / r1;
        System.out.println(cociente);
    }
    public static void calcularPromedioRaices(double r1, double r2, double r3) {
        double promedio = 0.0;
        promedio = (r1+r2+r3) / 3;
        System.out.println(promedio);
    }
    public static void calcularRaizR1R3(double r1, double r2) {
        System.out.println(Math.sqrt(r1-r2));
    }
    public static double pedirNumeroReal() {
        double numeroReal = 0.0;
        while(!(esValido(numeroReal))){
            System.out.println("Ingrese un número real valido (No permitidos 0 o negativos)");
            numeroReal = Utils.leerDouble();
        }
        return numeroReal;
    }
    public static boolean esValido(double numeroReal) {
        return numeroReal > 0.0;
    }
    public static int pedirOpcionValida() {
        int opcion = 0;
        while (!(esValido(opcion))) {
            System.out.println("1. Calcular la raíz cuadrada de (r1-r3) \n2. Calcular el promedio de r1, r2 y r3 \n3. Calcular cociente de la raíz cuadrada de (r3 - r2) dividida por\r\n" + //
                                "r1\n4. Calcular el cociente del promedio de los tres valores dividido por la raíz cuadrada de r2");
            opcion = Utils.leerInt();
        }
        return opcion;
    }
    public static boolean esValido(int opcion) {
        return opcion >= 1 && opcion <= 4;
    }
}
