/*
 * Escribir un programa que solicite nombre, edad, altura y ocupación, y
 * los imprima por pantalla.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio5 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        double altura;
        String ocupacion;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Inserte su nombre: ");
            nombre = entrada.readLine();
            System.out.println("Inserte su edad: ");
            edad = Integer.valueOf(entrada.readLine());
            System.out.println("Inserte su altura en metros: ");
            altura = Double.valueOf(entrada.readLine());
            System.out.println("Inserte su ocupación: ");
            ocupacion = entrada.readLine();
            System.out.println("Sus datos son: Su nombre es: " + nombre + ", " + edad + " años," + " " + "su altura es " + altura + " metros, " + "trabaja en: " + ocupacion);
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }   
}
