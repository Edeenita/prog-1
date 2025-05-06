package tp1;
/*
 * Escribir un programa que dado tres números reales ingresados
 * por el usuario, divida el primero por el segundo y al resultado
 * obtenido le reste el tercero. Muestre por pantalla el resultado
 * obtenido. Puede o no usar variables auxiliares para los cálculos.
 * Tenga en cuenta posibles errores en las operaciones.
 */

public class ej7 {
    public static void main(String[] args) {
        double num1, num2, num3;

            System.out.println("Ingresar el primer numero real");
            num1 = Utils.leerDouble();

            System.out.println("Ingresar el segundo numero real");
            num2 = Utils.leerDouble();

            System.out.println("Ingresar el tercer numero real");
            num3 = Utils.leerDouble();
            
            double resultado = (num1/num2) - num3;
            System.out.println("El resultado es: " + resultado);
    }
}
/*
 * Se rompe al ingresar un numero invalido (no ingresar un double) o la dividir por 0
 */