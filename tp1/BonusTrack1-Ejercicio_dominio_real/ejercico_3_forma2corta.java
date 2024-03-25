import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercico_3_forma2corta {
    public static void main(String[] args) {
        int viernes = 1;
        int sabado = 2;
        int fecha, nro_ticket, importe, dni;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese 1 si hoy es viernes, ingrese 2 si hoy es sábado: ");
            fecha = Integer.valueOf(entrada.readLine());
            System.out.println("Ingresa el numero de su ticket");
            nro_ticket = Integer.valueOf(entrada.readLine());
            System.out.println("Ingresar su dni sin puntos");
            dni = Integer.valueOf(entrada.readLine());
            System.out.println("Ingresa el monto a pagar");
            importe = Integer.valueOf(entrada.readLine());
            if(fecha == viernes && nro_ticket % 2 == 0 && importe >= 15000 && dni % 2 != 0){
                double descuento = importe * 0.08;
                System.out.println("Su descuento es de: $" + descuento);
            }else if (fecha == sabado && nro_ticket % 2 == 0 && importe >= 15000 && dni % 2 != 0 ) {
                double descuento = importe * 0.08;
                System.out.println("Su descuento es de: $" + descuento);
            }else if (fecha != viernes && fecha != sabado ) {
                    System.out.println("Ingrese un día valido! 1 para viernes, 2 para sábado");
            }else{
                System.out.println("Ingrese un numero valido 🐦");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
