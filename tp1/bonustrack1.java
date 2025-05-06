package tp1;
/*
 * La cadena de supermercados Carrefive debe imprimir el
 * encabezado del ticket de compra de los clientes con cierto formato
 * para cumplir las exigencias de la Administración Federal de
 * Ingresos PRIVADOS. En el mismo, debe figurar la fecha y hora,
 * número de ticket, CUIT, nombre del cajero, número de caja, dni
 * del cliente y la leyenda “El precio lo pone el cliente”. Un ejemplo
 * se muestra a continuación:
 * —-----------------------------------------------------------------
 * 04/04/23 - 18:55             Ticket Nro. 3455674
 *              CUIT: 99-34567833-9
 * Cajero: Luis Mercado     Caja: 8
 * DNI: 33.333.333       “El precio lo pone el cliente”
 * Escribir un programa con declaración de constantes y variables
 * que pida al usuario el ingreso de los datos necesarios para
 * imprimir el encabezado del ticket.
 */



public class bonustrack1 {
public static void main(String[] args) {
        String fecha, hora, cuit, cajero;
        int nro_ticket, caja, monto, dni;

            System.out.println("Ingresar la fecha: Formato dd/mm/aa");
            fecha = Utils.leerString();

            System.out.println("Ingresar la hora: Formoto hh:mm");
            hora = Utils.leerString();

            System.out.println("Ingresar numero de ticket");
            nro_ticket = Utils.leerInt();

            System.out.println("Ingresar CUIT: Formato 99-99999999-9");
            cuit = Utils.leerString();

            System.out.println("Ingresar nombre del cajero:");
            cajero = Utils.leerString();

            System.out.println("Ingresar número de caja: ");
            caja = Utils.leerInt();

            System.out.println("Ingrese el DNI del cliente (sin puntuaciones):");
            dni = Utils.leerInt();

            System.out.println("Ingresar monto a pagar");
            monto = Utils.leerInt();

            System.out.println("--------------------------------------------");
            System.out.println(fecha + " - " + hora  + "\tTicket Nro. " + nro_ticket);
            System.out.println("\t\tCUIT: " + cuit);
            System.out.println("Cajero: " + cajero + "\tCaja: " + caja);
            System.out.println("DNI: " + dni + "\t\t\t$"+monto);
            System.out.println("--------------------------------------------");
    }
}