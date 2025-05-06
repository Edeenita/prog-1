/*
4. Escribir un programa donde el usuario ingrese un nmero entre 0
y 999, y muestre un mensaje de cuntos dgitos tiene. Adems, si
tiene 3 dgitos debe informar qu nmero es.
 */
public class ej4 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Ingrese un número entre 0 y 999");
        num = Utils.leerInt();
        
        if (num >= 0 && num <=9) {
            System.out.println("Tiene 1 cifra");
        } else if (num >= 10 && num <= 99 ) {
            System.out.println("Tiene 2 cifras");
        } else if (num >= 100 && num <= 999) {
            System.out.println(num + " tiene 3 cifras");
        }else{
            System.out.println("Número invalido");
        }
    }
}
