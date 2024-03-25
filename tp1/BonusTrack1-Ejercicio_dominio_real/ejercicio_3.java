/*
 * Viendo el éxito de las promociones implementadas por la
 * competencia, el supermercado Soberano decidió aplicar la misma
 * idea. En Soberano, hay un descuento del 8% si se cumplen las
 * siguientes condiciones: es viernes o sábado, el número de ticket
 * es par, el importe es a lo sumo de $15.000 y el DNI del cliente
 * termina en un número impar. Escribir un programa que dado el
 * día, el número de ticket, el importe y el DNI verifique si debe
 * aplicar el descuento o no. Puede suponer un dato numérico para
 * el día como en el inciso anterior.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_3 {
    public static void main(String[] args) {
        int viernes = 1;
        int sabado = 2;
        int fecha, nro_ticket, importe, dni;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese 1 si hoy es viernes, Ingrese 2 si hoy en sábado");
            fecha = Integer.valueOf(entrada.readLine());
            if (fecha == viernes || fecha == sabado) {
                if (fecha == viernes){
                    System.out.println("Ingrese Número de ticket");
                    nro_ticket = Integer.valueOf(entrada.readLine());
                    boolean ticket_par = nro_ticket % 2 == 0 ;
                    if (ticket_par == true) {
                        System.out.println("Ingrese Número importe");
                        importe = Integer.valueOf(entrada.readLine());
                        boolean importe_aceptado = importe >= 15000;
                            if (importe_aceptado == true) {
                                System.out.println("Ingrese Número de DNI sin puntos");
                                dni = Integer.valueOf(entrada.readLine());
                                boolean dni_impar = dni % 2 != 0;
                                    if (dni_impar == true) {
                                        double descuento = importe * 0.08;
                                        System.out.println("El descuento es de: " + descuento);
                                    }else{
                                        System.out.println("Descuento no aplicable, su DNI no es impar.");
                                    }
                                
                            }else{
                                System.out.println("Descuento no aplicable, su importe no es suficiente para aplicar el descuento.");
                            }
                    }else{
                        System.out.println("Descuento no aplicable, su ticket no es par.");
                    }
                }else if (fecha == sabado){
                    System.out.println("Ingrese Número de ticket");
                    nro_ticket = Integer.valueOf(entrada.readLine());
                    boolean ticket_par = nro_ticket % 2 == 0 ;
                    if (ticket_par == true) {
                        System.out.println("Ingrese Número importe");
                        importe = Integer.valueOf(entrada.readLine());
                        boolean importe_aceptado = importe >= 15000;
                            if (importe_aceptado == true) {
                                System.out.println("Ingrese Número de DNI sin puntos");
                                dni = Integer.valueOf(entrada.readLine());
                                boolean dni_impar = dni / 2 != 0;
                                    if (dni_impar == true) {
                                        double descuento = importe * 0.08;
                                        System.out.println("El descuento es de: " + descuento);
                                    }else{
                                        System.out.println("Descuento no aplicable, su DNI no es impar.");
                                    }
                                
                            }else{
                                System.out.println("Descuento no aplicable, su importe no es suficiente para aplicar el descuento.");
                            }
                    }else{
                        System.out.println("Descuento no aplicable, su ticket no es par.");
                    }
                }
            }else{
                System.out.println("Ingrese un numero valido");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
