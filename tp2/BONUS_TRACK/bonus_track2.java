package tp2.BONUS_TRACK;

/*
*   La cadena de supermercados carrefive desea aplicar descuentos
*   según el día que se realiza la compra:
*
*   a. Los días martes, si el importe total de la compra supera los
*   $13.000 el descuento es del 5%, pero si supera los $20.000
*   es del 7.5%.
*
*   b. Los jueves, en cambio, el descuento es para todos los
*   tickets cuyo importe supere los $25.000 y será el 10% con
*   un tope de reintegro de $3.000 por ticket.
*
*   c. Si es viernes o sábado, si el número de ticket es par y el
*   importe es a lo sumo de $15.000 se le aplicará un descuento
*   del 8% si el DNI es par.
*
*   Escribir un programa que dado el día, solicite al usuario los
*   restantes datos para calcular los descuentos en cada caso y lo
*   aplique sobre el valor final a pagar. Debe informar el importe final
*   a pagar en cada caso.
 */

 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 
public class bonus_track2 {
    public static void main(String[] args) {
        int dia;
        double monto;
        double descuento;
        int ticket;
        int dni;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el día de la semana, [1~7], ingrese [0] para salir: ");
            dia = Integer.valueOf(entrada.readLine());
            while (dia != 0) {
                if (dia >= 1 && dia <= 7) {
                    switch (dia) {
                        case 2: 
                            System.out.println("Ingrese el monto de la compra: ");
                            monto = Double.valueOf(entrada.readLine());
                            if (monto >= 13000 && monto < 20000) {
                                descuento = monto * 0.05;
                                monto = monto - descuento;
                                System.out.println("El monto a pagar es de: " + monto);
                            } else if (monto >= 20000){
                                descuento = monto * 0.075;
                                monto = monto - descuento;
                                System.out.println("El monto a pagar es de: " + monto);
                            } else {
                                System.out.println("El monto no tiene descuento.");
                            }
                        dia = 0;
                        break;

                        case 4: 
                            System.out.println("Ingrese el monto de la compra: ");
                            monto = Double.valueOf(entrada.readLine());
                            if (monto >= 25000) {
                                descuento = monto * 0.1;
                                if (descuento > 3000) {
                                    descuento = 3000;
                                    monto = monto - descuento;
                                    System.out.println("El monto a pagar es de (tope de reintegro de [3000] aplicado.): " + monto);
                                } else{
                                    monto = monto - descuento;
                                    System.out.println("El monto a pagar es de (tope de reintegro de [3000] aplicado.): " + monto);
                                }
                            } else {
                                System.out.println("El monto no tiene descuento.");
                            }
                            dia = 0;
                        break;

                        case 5, 6:
                                System.out.println("Ingrese el monto de la compra: ");
                                monto = Double.valueOf(entrada.readLine());
                                System.out.println("El día de hoy hay modalidad especial! \nIngrese el número de su ticket!: ");
                                ticket = Integer.valueOf(entrada.readLine());
                                System.out.println("Ahora ingrese su DNI: ");
                                dni = Integer.valueOf(entrada.readLine());
                                if (ticket % 2 == 0 && dni % 2 == 0 && monto >= 15000) {
                                    descuento = monto * 0.08;
                                    monto = monto - descuento;
                                    System.out.println("El monto a pagar es de: " + monto);
                                } else {
                                    System.out.println("Su ticket y/o DNI y/o monto no es valido para el descuesto.");
                                }
                                dia = 0;
                        break;

                        default: 
                            System.out.println("Los días lunes, miercoles y domingo no hay descuento.");
                            dia = 0;
                        break;
                    }
                    
                } else {
                    System.out.println("No ha ingresado un caracter valido, ingresar nuevamente: ");
                    dia = Integer.valueOf(entrada.readLine());
                }
                
            }
            System.out.println("Ha salido del programa");
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
