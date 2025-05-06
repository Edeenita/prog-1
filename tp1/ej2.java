package tp1;
/*
 * Escribir un programa que declare una variable de tipo double y una
 * constante de tipo double con valor 1.0. Luego, deberá asignar el
 * doble del valor de la constante a la variable y mostrar ambos por
 * pantalla.
 */

public class ej2{
    public static void main (String [] args){
        double decimal;
        final double decimal_const = 1.0;
        decimal = decimal_const*2;
        System.out.println("El doble del valor de la constante es: " + decimal); 
        System.out.println("El valor de la constante es: " + decimal_const);

    }
}