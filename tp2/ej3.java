/*
3. Escribir un programa que solicite el ingreso de un nmero mayor a
50, y lo muestre por pantalla en caso de ser mltiplo de 2 o 3. 
*/
public class ej3 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Ingrese un número mayor que 50");
        num = Utils.leerInt();
        if (num > 50) {
            if (num % 2 == 0 || num % 3 == 0) {
                System.out.println(num + " es multiplo de 2 o 3");
            } else {
                System.out.println("No es multiplo ode 2 o 3");
            }
        } else{
            System.out.println("No es mayor que 50");
        }

    }
}
