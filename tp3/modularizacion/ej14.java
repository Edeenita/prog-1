package tp3.modularizacion;

/*
 * Escribir un programa que mientras el usuario ingresa un
 * carácter distinto del carácter ‘*’, invoque a un método que imprima
 * si es carácter dígito o carácter letra minúscula, y si es letra
 * minúscula imprimir si es vocal o consonante.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ej14 {
    public static void main(String[] args) {
        char letra_ingreso;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un caracter diferente de '*': ");
            letra_ingreso = entrada.readLine().charAt(0);
            while (letra_ingreso != '*') {
                try {
                    Verificar(letra_ingreso);
                    System.out.println("Ingrese un caracter diferente de '*': ");
                    letra_ingreso = entrada.readLine().charAt(0);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public static void Verificar (char letra_ingreso){
            if(letra_ingreso == '0' || letra_ingreso == '1' || letra_ingreso == '2' || letra_ingreso == '3' || letra_ingreso == '4' || letra_ingreso == '5'|| letra_ingreso == '6' || letra_ingreso == '7' || letra_ingreso == '8' || letra_ingreso == '9' ){
                System.out.println("El caracter ingresado es digito.");
            } else if (letra_ingreso >= 'a' && letra_ingreso <='z') {
                System.out.println("El caracter ingresado es minuscula.");
            } else if (letra_ingreso != '*'){
                switch (letra_ingreso) {
                    case 'A', 'E', 'I', 'O', 'U':
                        System.out.println("El caracter ingresado es vocal.");
                    break;
                
                    default:
                        System.out.println("El caracter ingresado es consonante o un caracter especial.");
                    break;
                }
        } else {
            System.out.println("ERROR");
        
        
        }
    }
}
