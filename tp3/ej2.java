package tp3;

/*
 * Escribir un diseño de programa que mientras que el usuario
 * ingrese un carácter dígito o carácter letra minúscula, imprima
 * dicho carácter, y si es carácter letra minúscula, imprima si es vocal
 * o consonante.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej2 {
    public static void main(String[] args) {
        try {
            ImprimirCaracter();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void ImprimirCaracter (){
        char carac = '1';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            try {
                while ((carac >= 'a' && carac <= 'z') || (carac >= '0' && carac <= '9')) {
                    carac = entrada.readLine().charAt(0);
                    if ((carac >= 'a' && carac <= 'z') || (carac >= '0' && carac <= '9')) {
                        if (carac >= '0' && carac <= '9') {
                            System.out.println("Ha ingresado un número dígito: " + carac);
                        } else {
                            System.out.println("Ha ingresado una letra minúscula: " + carac);
                            if (carac == 'a' || carac == 'e' || carac == 'i' || carac == 'o' || carac == 'u') {
                                System.out.println("Es una vocal.");
                            } else {
                                System.out.println("Es una consonante.");
                            }
                        }
                    } else {
                        System.out.println("Ha ingresado un carácter inválido: " + carac);
                    }
                }
            }catch (Exception e) {
                System.out.println("ERROR intente nuevamente. " + e);
            }   
    }
}

