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

public class ej2_muchainfo {
    public static void main(String[] args) {
        int mes, anio;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un mes del año de forma númerica");
            mes = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el año de forma númerica");
            anio = Integer.valueOf(entrada.readLine());
            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                if (mes == 1) {
                    System.out.println(anio + " es bisiesto y enero tiene 31 días");
                } else if (mes == 2) {
                    System.out.println(anio + " es bisiesto y febrero tiene 29 días");
                } else if (mes == 3) {
                    System.out.println(anio + " es bisiesto y marzo tiene 31 días");
                } else if (mes == 4) {
                    System.out.println(anio + " es bisiesto y abril tiene 30 días");
                } else if (mes == 5) {
                    System.out.println(anio + " es bisiesto y mayo tiene 31 días");
                } else if (mes == 6) {
                    System.out.println(anio + " es bisiesto y junio tiene 30 días");
                } else if (mes == 7) {
                    System.out.println(anio + " es bisiesto y julio tiene 31 días");
                } else if (mes == 8) {
                    System.out.println(anio + " es bisiesto y agosto tiene 31 días");
                } else if (mes == 9) {
                    System.out.println(anio + " es bisiesto y septiembre tiene 30 días");
                } else if (mes == 10) {
                    System.out.println(anio + " es bisiesto y octubre tiene 31 días");
                } else if (mes == 11) {
                    System.out.println(anio + " es bisiesto y noviembre tiene 30 días");
                } else if (mes == 12) {
                    System.out.println(anio + " es bisiesto y diciembre tiene 31 días");
                } 
            } else{
                if (mes == 1) {
                    System.out.println(anio + " no es bisiesto y enero tiene 31 días");
                } else if (mes == 2) {
                    System.out.println(anio + " no es bisiesto y febrero tiene 28 días");
                } else if (mes == 3) {
                    System.out.println(anio + " no es bisiesto y marzo tiene 31 días");
                } else if (mes == 4) {
                    System.out.println(anio + " no es bisiesto y abril tiene 30 días");
                } else if (mes == 5) {
                    System.out.println(anio + " no es bisiesto y mayo tiene 31 días");
                } else if (mes == 6) {
                    System.out.println(anio + " no es bisiesto y junio tiene 30 días");
                } else if (mes == 7) {
                    System.out.println(anio + " no es bisiesto y julio tiene 31 días");
                } else if (mes == 8) {
                    System.out.println(anio + " no es bisiesto y agosto tiene 31 días");
                } else if (mes == 9) {
                    System.out.println(anio + " no es bisiesto y septiembre tiene 30 días");
                } else if (mes == 10) {
                    System.out.println(anio + " no es bisiesto y octubre tiene 31 días");
                } else if (mes == 11) {
                    System.out.println(anio + " no es bisiesto y noviembre tiene 30 días");
                } else if (mes == 12) {
                    System.out.println(anio + " no es bisiesto y diciembre tiene 31 días");
                } 
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
