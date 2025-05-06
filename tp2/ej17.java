/* 
*   Escribir un programa que dado un valor ingresado por el
*   usuario menor que 10 y mayor a 1, muestre por pantalla una
*   cuenta regresiva de números desde dicho valor hasta el 0
*   inclusive.
*/

public class ej17 {
    public static void main(String[] args) {
        int num;

            System.out.println("Ingrese un numero entre 1 y 10 para ");
            num = Utils.leerInt();
            if (num >= 1 && num <= 10) {
                for(int i = num; i > 0; i--){
                    System.out.println("cuenta regresiva: " + i);
                }
            }else{
                System.out.println("Ingrese un numero valido");
            }
    }
}
