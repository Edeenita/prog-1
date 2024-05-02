package tp3;

/*
 * Escribir un diseño de programa que mientras que el usuario
 * ingrese un número natural, pida ingresar otro número cualquiera y
 * lo imprima.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej3 {
    public static void main(String[] args) {
        try {
            IngresarNum();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void IngresarNum (){
        int num = 1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (num > 0) {
            try {
                System.out.println("Ingrese un número natural: ");
                num = Integer.valueOf(entrada.readLine());
                if (num > 0){
                    System.out.println("Número natural ingresado: " + num);
                } else{
                    System.out.println("No ha ingresado un número natural: " + num);
                }
                
            } catch (Exception e) {
                System.out.println("No ha ingresado un número intente nuevamente; " + e);
            }
        }
        
    }
}
