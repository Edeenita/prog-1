package tp3.modularizacion;

/*
 * Realizar un programa que dado dos números enteros y un
 * carácter (todos ingresados por el usuario) muestre por pantalla el
 * resultado de una operación matemática básica según el valor del
 * carácter ingresado. Si se ingresó el carácter ‘a’ debe realizar la
 * suma, para ‘b’ la resta, para ‘c’ la multiplicación y para ‘d’ la
 * división entre ambos números.
 */

 import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej8 {
    public static void main(String[] args) {
        Ingreso();
    }

    public static void Ingreso (){
        int num_1;
        int num_2;
        char letra;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el primer número");
            num_1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el segundo número");
            num_2 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese 'a' para suma.\nIngrese 'b' para resta.\nIngrese 'c' para multiplicar.\nIngrese 'd' para dividir.");
            letra = entrada.readLine().charAt(0);

            switch (letra) {
                case 'a':
                        System.out.println("La suma es: " + Suma(num_1, num_2));
                break;

                case 'b':
                        System.out.println("La resta es: " + Resta(num_1, num_2));
                break;

                case 'c':
                        System.out.println("La multiplicación es: " + Multiplcar(num_1, num_2));
                break;

                case 'd':
                        System.out.println("La división es: " + Dividir(num_1, num_2));
                break;
            
                default:
                    System.out.println("No ha ingreso un caracter valido.");
                break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int Suma (int num_1, int num_2){
        return num_1 + num_2;
    }

    public static int Resta (int num_1, int num_2){
        return num_1 - num_2;
    }

    public static int Multiplcar (int num_1, int num_2){
        return num_1 * num_2;
    }
    
    public static int Dividir (int num_1, int num_2) {
    return num_1 / num_2;
    }
}


