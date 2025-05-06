package tp1;
/*
 * Escribir un programa que solicite nombre, edad, altura y ocupación, y
 * los imprima por pantalla.
 */


public class ej5 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        double altura;
        String ocupacion;
            System.out.println("Inserte su nombre: ");
            nombre = Utils.leerString();
            System.out.println("Inserte su edad: ");
            edad = Utils.leerInt();
            System.out.println("Inserte su altura en metros: ");
            altura = Utils.leerDouble();;
            System.out.println("Inserte su ocupación: ");
            ocupacion = Utils.leerString();
            System.out.println("Sus datos son: Su nombre es: " + nombre + ", " + edad + " años," + " " + "su altura es " + altura + " metros, " + "trabaja en: " + ocupacion);
    }
}
