/*
2. Construir un programa que solicite desde teclado un número de
mes y posteriormente notifique por pantalla la cantidad de días de
ese mes. En el caso de que ingrese 2 como número de mes
(febrero) deberá además solicitar ingresar un número de año y,
dependiendo si es bisiesto o no con la siguiente sentencia:
((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
imprimir la cantidad de días correspondiente.
 */
public class ej2 {
    public static void main(String[] args) {
        int nro_mes, anio;
        System.out.println("Ingrese un numero del mes (1 al 12)");
        nro_mes = Utils.leerInt();
        switch (nro_mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Tiene 31 días");
                break;
            case 4, 6, 9, 11:   
                System.out.println("Tiene 30 días");
                break;
            case 2:
                System.out.println("Ingrese el año para la verificación");
                anio = Utils.leerInt();
                if (((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))) {
                    System.out.println("Tiene 29 días");
                } else {
                    System.out.println("Tiene 28 días");
                }
                break;
            default: System.out.println("No ha ingresado un mes valido");
                break;
        }
    }
}
