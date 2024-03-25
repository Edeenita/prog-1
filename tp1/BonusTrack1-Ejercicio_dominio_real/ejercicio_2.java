/*
 * En Carrefive, los días martes y jueves hay “PROMO”. En los días
 * martes, si el importe total de la compra supera los $13.000 el
 * descuento es del 5%, pero si supera los $20.000 es del 7.5%. Los
 * jueves, en cambio, el descuento es para todos los tickets cuyo
 * importe supere los $25.000 y será el 10% con un tope de reintegro
 * de $3.000 por ticket. Escribir un programa que dado el día de la
 * semana que se hace la compra y el importe del ticket, verifique si
 * aplica hacer el descuento o no. Puede suponer un dato numérico
 * para cada día, ejemplo: 1 para el martes y 2 para el jueves.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_2 {
    public static void main(String[] args) {
        int martes = 1;
        int jueves = 2;
        int num_ingresado;
        double monto;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese 1 si hoy es martes, Ingrese 2 si hoy en jueves");
            num_ingresado = Integer.valueOf(entrada.readLine());
            if (num_ingresado == martes || num_ingresado == jueves) {
                if (num_ingresado == martes) {
                    System.out.println("Ingrese el monto");
                    monto = Double.valueOf(entrada.readLine());
                    if (monto >= 13000 && monto < 20000) {
                        double desc_5 = monto - (monto * 0.05) ;
                        System.out.println("El monto ingreasado tiene un 5% de descuento y un valor de :" + desc_5);
                    }else if (monto >= 20000){
                        double desc7_5 = monto - (monto * 0.075);
                        System.out.println("El monto ingreasado tiene un 7.5% de descuento y un valor de :" + desc7_5);
                    }else {
                        System.out.println("El monto ingresado no tiene descuento");
                    }
                }else if (num_ingresado == jueves){
                    System.out.println("Ingrese el monto");
                    monto = Double.valueOf(entrada.readLine());
                    if (monto >=25000) {
                        double desc_10 = monto - (monto * 0.10);
                        System.out.println("El monto ingreasado tiene un 10% de descuento y un valor de :" + desc_10);
                    }else{
                        System.out.println("El monto ingresado no tiene descuento");
                    }
                }else {
                    System.out.println("Fatal error 🐦");
                }
            }else{
                System.out.println("Ingrese un número valido");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
