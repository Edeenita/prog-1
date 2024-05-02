package tp3;

/*
 * Realizar un programa que, dada una opción entera (1,2,3,4),
 * permita realizar operaciones entre tres números reales (r1,r2,r3)
 * ingresados desde teclado. Para la opción:
 * 1. Calcular la raíz cuadrada de (r1-r3)
 * 2. Calcular el promedio de r1, r2 y r3
 * 3. Calcular cociente de la raíz cuadrada de (r3 - r2) dividida por r1
 * 4. Calcular el cociente del promedio de los tres valores dividido
 * por la raíz cuadrada de r2
 * 
 * Observación: La raíz cuadrada de un número se calcula con la
 * sentencia: Math.sqrt(numero). Hacer uso del diseño descendente
 * y de la modularización para la solución. Tener en cuenta posibles
 * errores o excepciones como la división por cero.
 * 
 */

 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 
 

public class ej13 {
    public static void main(String[] args) {
        Ingreso();
    }

    public static void Ingreso(){
        int numIngreso;
        double r1, r2, r3;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingresa 1 para calcular la raíz cuadrada.\nIngresa 2 para calcular el promedio de r1, r2 y r3.\nIngresa 3 para calcular Calcular cociente de la raíz cuadrada de (r3 - r2) dividida por r1.\nIngresa 4 para calcular el cociente del promedio de los tres valores dividido por la raíz cuadrada de r2");
            numIngreso = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese r1");
            r1= Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese r2");
            r2= Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese r3");
            r3= Integer.valueOf(entrada.readLine());
            switch (numIngreso) {
                case 1: 
                    if (r1 >= 0 && r2 >= 0 && r3 >= 0) {
                        System.out.println("Raiz de r1: " + RaizCuadradaR1(r1));
                        System.out.println("Raiz de r2: " + RaizCuadradaR2(r2));
                        System.out.println("Raiz de r3: " + RaizCuadradaR3(r3));
                    } else{
                        System.out.println("Ha ingresado un número negativo");
                    }
                break;

                case 2: 
                    System.out.println("El promedio es: " + Promedio(r1, r2, r3));
                break;

                case 3: 
                    if (CocienteRaiz(r1, r2, r3) >= 0) {
                        System.out.println("El resultado es: " + CocienteRaiz(r1, r2, r3));
                    } else {
                        System.out.println("ERROR");
                    }
                break;

                case 4: 
                if (CocientePromedio(r1, r2, r3) >= 0) {
                    System.out.println("El resultado es: " + CocientePromedio(r1, r2, r3));
                } else {
                    System.out.println("ERROR");
                }
                break;

                default: System.out.println("Numero ingresado no es una operación valida."); break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static double RaizCuadradaR1 (double r1){
        return (double) Math.sqrt(r1);
    }
    public static double RaizCuadradaR2 (double r2){
        return (double) Math.sqrt(r2);
    }
    public static double RaizCuadradaR3 (double r3){
        return (double) Math.sqrt(r3);
    }

    public static double Promedio (double r1, double r2, double r3){
        return ((r1+r2+r3)/3);
    }

    public static double CocienteRaiz (double r1, double r2, double r3){
        return ((Math.sqrt(r3-r2)) / r1);
    }

    public static double CocientePromedio (double r1, double r2, double r3){
        return (((r1+r2+r3)/3) / Math.sqrt(r2) ) ;
    }
}
