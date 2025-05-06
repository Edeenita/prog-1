package tp1;
/*
 * Escribir un programa que pida se ingresen datos necesarios para
 * emitir una factura por la compra de dos artículos de librería (tipo
 * factura, número, nombre cliente, producto 1, importe 1, producto 2,
 * importe 2, importe total). Como salida debe imprimir por pantalla la
 * factura en un formato similar al del siguiente ejemplo:
 * Factura C N249
 * Nombre: Juan Perez
 * Producto Importe
 * Lápiz 15.5
 * Papel 20.6
 * Importe total 36.1
 */

public class ej6 {
    public static void main(String[] args) {
        String tipo_fact;
        int n_fact;
        String nombre;
        String producto1, producto2; 
        double importe1, importe2;
        double total_importe;

            System.out.println("Ingresar los datos de la factura");

            System.out.println("Tipo de factura [A | B | C]");
            tipo_fact = Utils.leerString();

            System.out.println("Ingresar el numero de la factura");
            n_fact = Utils.leerInt();

            System.out.println("Ingresar el nombre del cliente");
            nombre = Utils.leerString();
            
            System.out.println("Ingresar el primer producto");
            producto1 = Utils.leerString();

            System.out.println("Ingresar el importe del producto");
            importe1 = Utils.leerDouble();

            System.out.println("Ingresar el segundo producto");
            producto2 = Utils.leerString();

            System.out.println("Ingresar el importe del producto");
            importe2 = Utils.leerDouble();

            total_importe = importe1 + importe2;
            
            System.out.println("Factura " + tipo_fact + " " + "N" + n_fact);
            System.out.println("Nombre: " + nombre);
            System.out.println("Producto \t Importe");
            System.out.println(producto1 + "\t" + importe1);
            System.out.println(producto2 + "\t" + importe2);
            System.out.println("Importe total: " + total_importe);
    }
}
