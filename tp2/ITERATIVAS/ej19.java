package tp2.ITERATIVAS;

/*
*   Construir un programa que solicite desde teclado un número de
*   mes válido y posteriormente notifique por pantalla la cantidad de
*   días de ese mes. En el caso de que ingrese 2 como número de
*   mes (febrero) deberá además solicitar ingresar un número de año
*   entre 2000 y 2024 inclusive (no debe seguir si no está en ese
*   rango), y dependiendo de si es bisiesto o no imprimir la cantidad
*   de días correspondiente.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;




public class ej19 {
    public static void main(String[] args) {
        int mes;
        int anio;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingresar un més del año (1-12)");
            mes = Integer.valueOf(entrada.readLine());
            while (mes >=1 && mes <= 12) {
                switch (mes) {
                    case 4, 6, 9, 11: System.out.println("Tiene 30 días"); break;
                    case 1, 3, 5, 7, 8, 10, 12 :System.out.println("Tiene 31 días"); break;
                    case 2 : 
                        System.out.println("Ingrese un año entre 2000 y 2024");
                        anio = Integer.valueOf(entrada.readLine());
                        if (anio >= 2000 && anio <= 2024) {
                            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                                System.out.println("Tiene 29 días");
                            } else {
                                System.out.println("Tiene 28 días");
                            }
                        } else {
                            System.out.println("Ingrese una fecha valida.");
                        }
                    default: break;
                }
                System.out.println("Ingresar un més del año (1-12)");
                mes = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
