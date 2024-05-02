package tp3;

/*
 * Escribir un diseño de programa que mientras que el usuario
 * ingrese un número distinto de 0, pida ingresar otros dos números
 * e imprima el resultado de la multiplicación entre los dos últimos
 * números ingresados.
 */

 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 
public class ej4 {
    public static void main(String[] args) {
        try {
            Ingreso();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void Ingreso(){
        int num_verificarcion;
        int num_1;
        int num_2;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un número diferente de 0: ");
            num_verificarcion = Integer.valueOf(entrada.readLine());
            while (num_verificarcion != 0) {
                try {
                    System.out.println("Ingrese el primer número: ");
                    num_1 = Integer.valueOf(entrada.readLine());
                    System.out.println("Ingrese el segundo número: ");
                    num_2 = Integer.valueOf(entrada.readLine());

                    System.out.print("Su resultado es: " + resultado(num_1, num_2));
                    
                    System.out.println("\nIngrese un número diferente de 0: ");
                    num_verificarcion = Integer.valueOf(entrada.readLine());
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static int resultado (int num_1, int num_2){
        int resultado = num_1 * num_2;
        return resultado;
    }
}
