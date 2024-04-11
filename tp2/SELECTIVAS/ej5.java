package tp2.SELECTIVAS;

/*
* Escribir un programa que solicite una hora del día (valor entero de
*la hora solamente) y resuelva en cada caso:
*a. Si la hora está entre las 0 y las 5, pida ingresar la
*temperatura y si la misma es menor a 20 grados imprima
*“Encender la calefacción”. Si es mayor a 25, imprima
*“Apagar calefacción”. Si está en el rango de 20 a 25 imprima
*“Calefacción encendida, no abra las ventanas!!!”.
*b. Si la hora está entre las 6 y las 11, pida un carácter letra
*minúscula y si es vocal imprima por la consola la cantidad de
*vocales que tiene la palabra que corresponde con la hora.
*Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la
*cantidad de consonantes que tiene, para el ejemplo 8 (ocho)
*tiene 2 consonantes.
*c. Si la hora está entre las 12 y 17 y es par, imprima el
*promedio entre la hora ingresada y el límite inferior del
*rango. Si la hora es impar debe imprimir el promedio entre la
*hora ingresada y el límite superior del rango.
*d. Si la hora está entre las 18 y 23, pida ingresar una clave
*numérica, si coincide con la clave almacenada previamente
*en una constante, pida ingresar una segunda clave de
*verificación (un valor entre 100 y 999). Para esta segunda
*clave (que solo la conoce el usuario) se debe verificar que el
*dígito de mayor peso (centena) sea múltiplo del dígito de
*mayor peso de la clave almacenada. Si todo esto se cumple
*debería mostrar por la consola el mensaje “Clave correcta”.
*Ejemplo: clave almacenada 364, clave ingresada 364,
*segunda clave ingresada 698.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej5 {
    public static void main(String[] args) {

        int hora, temperatura; // variables para parte a

        char letra;  // variables para parte b

        float promedio; // variables para parte c

        final int clave_const = 231;  // variables para parte d
        int clave;
        int clave_dos;
        int verificacion;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese una hora formato 24hs (0-23hs.): ");
            hora = Integer.valueOf(entrada.readLine());

            /*
             * Compara si la hora es mayor o igual que cero o menor o igual que 5
             * si la temperatura es menor que 20 ejecuta la primer sentencia
             * si la temperatura es mayor que 25 ejecuta la segunda sentencia
             * si la temperatura es mayor o igual que 20 y menor o igual que 25 ejecuta la tercer sentencia
             */

            if (hora >= 0 && hora <= 5) {
                System.out.println("Ingrese la temperatura de forma entera: ");
                temperatura = Integer.valueOf(entrada.readLine());
                if (temperatura < 20) {
                    System.out.println("Encender la calefacción.");
                } else if (temperatura > 25 ){
                    System.out.println("Apagar calefacción.");
                }else if (temperatura >= 20 && temperatura <= 25){
                    System.out.println( "Calefacción encendida, no abra las ventanas!!!.");
                } else {
                    System.out.println("Introduzca una temperatura valida.");
                }

                /*
                 * Compara si la hora es mayor o igual que 6 o menor o igual que 11
                 * Pide por consola una letra
                 * el primer caso pregunta si es vocal, en caso de serlo ejecuta otro switch
                 * donde imprime por pantalla la cantidad de vocales de las horas
                 * en caso de ser consonante pasa al defoult donde se realiza otro switch
                 * donde imprime por pantalla la cantidad de consonantes de las horas.
                 */

            } else if (hora >= 6 && hora <= 11) {
                System.out.println("Ingrese un cáracter letra minuscula");
                letra = entrada.readLine().charAt(0);
                switch (letra) {
                    case 'a', 'e', 'i', 'o', 'u':{ 
                        switch (hora) {
                            case 6 : System.out.println("6 tiene dos vocales"); break;
                            case 7 : System.out.println("7 tiene tres vocales"); break; 
                            case 8 : System.out.println("8 tiene dos vocales"); break;
                            case 9 : System.out.println("9 tiene tres vocales"); break;
                            case 10 : System.out.println("10 tiene dos vocales"); break;
                            case 11 : System.out.println("11 tiene dos vocales"); break;
                            default:System.out.println("Error"); break;
                        } break;
                    }
                    default: switch (hora) {
                                case 6 : System.out.println("6 tiene dos consonantes"); break;
                                case 7 : System.out.println("7 tiene dos consonantes"); break; 
                                case 8 : System.out.println("8 tiene dos consonantes"); break;
                                case 9 : System.out.println("9 tiene dos consonantes"); break;
                                case 10 : System.out.println("10 tiene dos consonantes"); break;
                                case 11 : System.out.println("11 tiene dos consonantes"); break;
                            default: System.out.println("Error"); break;
                    } break;
                }

                /*
                 * Compara si la hora es mayor o igual que 12 o menor o igual que 17
                 * primero pregunta si la hora es par, en caso de serlo calcula el promerdio
                 * del número par y su limite inferior
                 * el limite inferior es el número más pequeño del rango en el que se trabaja
                 * en este caso el rango es de [12 a 17] incluidos ambos
                 * para calcular el limite inferior sumanos el limite inferior al número par
                 * y para calcular el promedio tan solo dividimos por dos
                 * en caso de ser impar se calcula el limite superior (en este caso 17) con 
                 * los números impares, sumandolos y se calcula el promedio dividiendo por dos 
                 * el resultado de la adición.
                 * muestra el promedio por pantalla en cada caso.
                 */

            } else if (hora >= 12 && hora <= 17) {
                if (hora % 2 == 0) {
                    switch (hora) {
                        case 12: 
                            promedio = (12+12)/2; 
                            System.out.println("el promedio entre 12 y el límite inferior del rango (12) es: " + promedio); 
                        break;
                        
                        case 14:
                            promedio = (14+12)/2;
                            System.out.println("el promedio entre 14 y el límite inferior del rango (12) es: " + promedio);
                        break;

                        case 16:
                            promedio = (16+12)/2;
                            System.out.println("el promedio entre 16 y el límite inferior del rango (12) es: " + promedio);
                        break;

                        default: System.out.println("Error"); break;
                    }
                } else if (hora % 2 != 0) {
                    switch (hora) {
                            case 13:
                                promedio = (13+17)/2;
                                System.out.println("el promedio entre 13 y el límite superior del rango (17) es: " + promedio);
                            break;
                                
                            case 15:
                                promedio = (15+17)/2;
                                System.out.println("el promedio entre 15 y el límite superior del rango (17) es: " + promedio);
                            break;

                            case 17:
                                promedio = (17+17)/2;
                                System.out.println("el promedio entre 17 y el límite superior del rango (17) es: " + promedio);
                            break;
                    
                        default: System.out.println("Error"); break;
                    }
                }

                /*
                 * Compara si la hora es mayor o igual que 18 o menor o igual que 23
                 * primero se pide una clave númerica por consola
                 * en caso de que la clave ingresada sea igual a la clave previamente
                 * declarada como constante (en este caso su valor asignado fue 231),
                 * pide por pantalla otra clave númerica en este caso entre 100 y 999
                 * en caso de estar en el rango se realiza una verificación
                 * donde la segunda clave de seguridad y la clave previamente declarada
                 * son divididas por 100, ya que necesitamos obtener el número de mayor
                 * peso (centena) 
                 * -> ya que son int van a tener un resto entero por lo que si dividimos por 100
                 * por ejemplo el número 547 (547/100=5) y la clave previamente declarada es 231
                 * (231/100=2), [5 % 2 != 0] la clave sería incorrecta ya que sus centenas no son multiplo <-
                 * Por último compara si la verificación es igual a 0 para demostrar que los números
                 * son multiplo
                 * -> ejemplo:
                 * segunda clave = 103
                 * verificacion = (103 / 100) % (123 / 100)
                 *              = 1 % 1
                 *              = 0
                 * verificación == 0 ✅
                 * 
                 * segunda clave = 501
                 * verificacion = (501 / 100) % (231 / 100)
                 *              = 5 % 2
                 *              = 1
                 * verificación == 0 ❌ <-
                 */

            } else if (hora >= 18 && hora <= 23) {
                System.out.println("Ingrese la clave númerica: ");
                clave = Integer.valueOf(entrada.readLine());
                if (clave == clave_const) {
                    System.out.println("Ingrese una segúnda clave de seguridad entre 100 y 999");
                    clave_dos = Integer.valueOf(entrada.readLine());
                    if (clave_dos >= 100 && clave_dos <=999) {
                        verificacion = (clave_dos / 100) % (clave_const / 100);
                        if (verificacion == 0) {
                            System.out.println("Clave correcta.");
                        } else {
                            System.out.println("Clave incorrecta, inténtelo nuevamente.");
                        }
                    } else {
                        System.out.println("Clave incorrecta, inténtelo nuevamente.");
                    }
                } else {
                    System.out.println("Clave incorrecta, inténtelo nuevamente.");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        }
}
