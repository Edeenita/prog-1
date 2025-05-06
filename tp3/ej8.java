/*
Realizar un programa que dado dos números enteros y un
carácter (todos ingresados por el usuario) muestre por pantalla el
resultado de una operación matemática básica según el valor del
carácter ingresado. Si se ingresó el carácter ‘a’ debe realizar la
suma, para ‘b’ la resta, para ‘c’ la multiplicación y para ‘d’ la
división entre ambos números.
 */
public class ej8 {
    public static void main(String[] args) {
        operacionMatematica();
    }

    public static void operacionMatematica(){
        int valor1 = 0;
        int valor2 = 0;
        char caracter = ' ';

        valor1 = pedirNumero();
        valor2 = pedirNumero();
        caracter = pedirCaracter();

            switch (caracter) {
                case 'a':
                        sumaValores(valor1, valor2);
                    break;
                case 'b':
                        restaValores(valor1, valor2);
                    break;
                case 'c':
                        multiplicarValores(valor1, valor2);
                    break;
                case 'd':
                        divisionValores(valor1, valor2);
                    break;
                default:
                        System.out.println("Error");
                    break;
            }
        }
        
    

    private static void divisionValores(int valor1, int valor2) {
        if (valor2 > 0) {
            double  dividir = (double) valor1 / valor2;
            System.out.println(valor1 + "/" + valor2 +"=" +  dividir);
        }else{
            System.out.println("No se puede divir entre 0");
        }
        
    }

    private static void multiplicarValores(int valor1, int valor2) {
        int multiplicar = valor1 * valor2;
        System.out.println(valor1 + "*" + valor2 + "=" + multiplicar);
    }

    private static void restaValores(int valor1, int valor2) {
        int resta = valor1 - valor2;
        System.out.println(valor1 + "-" + valor2 + "=" + resta);
    }

    private static void sumaValores(int valor1, int valor2) {
        int suma = valor1 + valor2;
        System.out.println(valor1 + "+" + valor2 + "=" + suma);
    }

    public static int pedirNumero(){
        int valor = 0;
        while (valor < 0) {
            System.out.println("Ingrese un numero entero");
            valor = Utils.leerInt();
        }
        return valor;
    }
    public static char pedirCaracter(){
        char caracter = ' ';
        while (!(esValido(caracter))) {
            System.out.println("Ingrese un caracter");
            caracter = Utils.leerChar();
        }
        return caracter;
    }
    public static boolean esValido(char caracter){
        return 
            caracter == 'a' ||
            caracter == 'b' ||
            caracter == 'c' ||
            caracter == 'd';
    }
}
