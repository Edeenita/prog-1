/*
*   Escribir un programa que mientras que el usuario ingrese un
*   número distinto de 0, pida ingresar otros dos números e imprima
*   el resultado de la división entre los dos últimos números
*   ingresados. ¿Existe alguna restricción para la división? 
*/
public class ej18 {
    public static void main(String[] args) {
        double num, num2, num3;
        double resultado;
            System.out.println("Ingrese un número distinto de 0");
            num = Utils.leerDouble();
                while (num != 0) {
                    
                    System.out.println("Ingrese el primer número para dividir: ");
                    num2 = Utils.leerDouble();
                    System.out.println("Ingrese el segúndo número para dividir: ");
                    num3 = Utils.leerDouble();
                    
                    resultado = num2 / num3;
                    System.out.println("El resultado es: " + resultado);

                    System.out.println("Ingrese un número distinto de 0");
                    num = Utils.leerDouble();
                }
        } 
    }

/*
 * no existe ninguna restricción para la división
 * ya que las variables fueron declaradas como doubles
 * se puede divir entre ellas sin restricciones
 * por ejemplo 2/8 en enteros seria igual a 0
 * pero al ser double 2/8=0.25
 */