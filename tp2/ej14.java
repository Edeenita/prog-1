/* 
Pedir por consola el ingreso de 10 números enteros positivos.
Contar cuántas veces se ingresaron números pares y mostrarlo
por pantalla.
*/

public class ej14 {
    public static void main(String[] args) {
        int num;
        int MAX = 10;
        int contador = 0;
        
                for(int i = 0; i < MAX; i++){
                    System.out.println("Ingrese un número entero positivo:");
                    num = Utils.leerInt();
                    if (num % 2 == 0 && num >=0) {
                        contador++;
                    }
                }
            System.out.println("Se ingresaron: " + contador + " enteros pares positivos");           
    }
}
