package tp3;

/*
 * Escribir un programa que mientras el usuario cargue desde
 * teclado un carácter letra minúscula, llame a un método que
 * imprime por pantalla la tabla de multiplicar del 9.
 */

 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 

public class ej6 {
    public static void main(String[] args) {
        try {
            IngreasoLetra();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void IngreasoLetra (){
        char letra;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un caracter letra minuscula: ");
            letra = entrada.readLine().charAt(0);
            while (letra >= 'a' && letra <= 'z') {
                try {
                    System.out.println("La tabla del 9: ");
                    TablaMultiplicarNuve();
                    System.out.println("Ingrese un caracter letra minuscula: ");
                    letra = entrada.readLine().charAt(0);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void TablaMultiplicarNuve (){
        final int MAX = 10;
        for (int i = 1; i <= MAX; i++){
            System.out.println("9 * " + i + " = " + (i*9));
        }
    }
}
