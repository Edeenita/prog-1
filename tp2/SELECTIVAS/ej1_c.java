package tp2.SELECTIVAS;
//c. solicite un número del 1 al 7 e imprima el día de la semana.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej1_c {
    public static void main(String[] args) {
        int num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero del 1 al 7 que representa un día respectivamente");
            num = Integer.valueOf(entrada.readLine());
            switch (num) {
                case 1: System.out.println("1 es domingo"); break;
                case 2: System.out.println("2 es lunes"); break;
                case 3: System.out.println("3 es martes"); break;
                case 4: System.out.println("4 es miercoles"); break;
                case 5: System.out.println("5 es jueves"); break;
                case 6: System.out.println("6 es viernes"); break;
                case 7: System.out.println("7 es sabado"); break;
                default: System.out.println("Ingrese un numero valido"); break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
