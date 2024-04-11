package tp2.SELECTIVAS;

/*
*   Construir un programa que solicite desde teclado un número de
*   mes y posteriormente notifique por pantalla la cantidad de días de
*   ese mes. En el caso de que ingrese 2 como número de mes
*   (febrero) deberá además solicitar ingresar un número de año y,
*   dependiendo si es bisiesto o no con la siguiente sentencia:
*   ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
*   imprimir la cantidad de días correspondiente.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej2_corto {
    public static void main(String[] args) {
        int mes, dias, anio;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un mes del año de forma númerica: ");
            mes =  Integer.valueOf(entrada.readLine());
            switch (mes) {
                case 2: System.out.println("Ingrese el año de forma númerica: "); 
                anio = Integer.valueOf(entrada.readLine());
                    if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                        dias = 29;
                    } else {
                        dias = 28;
                    }
                    break;
                case 4, 6, 9, 11: dias = 30; break;
                default: dias = 31; break;
            }
            System.out.println("El mes tiene " + dias + " días.");
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
}
