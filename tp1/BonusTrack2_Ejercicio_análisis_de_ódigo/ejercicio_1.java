package tp1.BonusTrack2_Ejercicio_análisis_de_ódigo;

/*
 * a)
 * public class Practica_1_Bonus_1{
 * public static void main(String[] args) {
 * double altura=’a’; //declara un char dentro de un double. 
 *                      ya que queremos la altura el double es correcto y debemos cambiar el
 *                      char por un numero real como 1.70
 *                      ✅ double altura = 1.70;
 *                      a su vez se declara y no se utiliza.
 * boolean existe; // un booleean por defecto es false.
 * existe = 34; // Quiere asignarle un entero a un booleean
 *                 los boolean solo son verdaderos o falsos
 *                  por lo que esta linea de codigo debería ser eliminada
 *                  a menos que querramos asignale un valor booleano a la variable "existe"
 *                  ✅ existe = true;
 *                  a su vez se declara y no se utiliza.
 * peso = 75.5; // no declara el tipo de variable que es
 *                  ✅ double peso = 75.5;
 * System.out.println("El valor de " - "peso es: "); //utiliza un - para una cadena de texto
 *                                                     el - se utiliza para operaciones aritmeticas
 *                                                      o para negar un elemento
 *                                                  ademas no esta llamando a ninguna variable por lo que el texto no tiene sentido
 * System.out.println(peso); // No devolvería nada ya que peso no esta declarado
 *                             si tomamos la corrección nos devolveria 75.5
 * }
 * }

 */

/*
 * b)
 * public class Practica_1_Bonus_2{
 *  public static void main(String[] args) {
 *      final char letra=’a’; // delaración de una constante char 
 *      int numero1, numero2; // delaración de dos variables del tipo entero
 *      letra = ’f’; // no se le puedo reasignar el valor a la variable letra
 *                      ya que es una constante y estas no cambian de valor
 *      numero1=10+numero2; // delcara que numero 1 es = a 10 + numero 2
 *                             pero como la variable numero2 no esta inicializada
 *                             daría error al ejecutarse por más que los int
 *                             por defecto tengan asignado 0 por valor
 *                             para utilizarse en este caso debe estar inicializado anteriormente
 * 
 *      System.out.println("El valor de numero1 es:" + numero1); 
 *      System.out.println("El valor de numero2 es:" + numero2); 
 */


/*
 * c)
 * import java.io.BufferedReader;
 * import java.io.InputStreamReader;
 * public class Practica_1_Bonus_3 {
 *  public static void main(String[] args){
 *      int entero;
 *      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
 *      try {
 *              System.out.println ("Ingrese un entero: "); // falta el entero = Integer.valueOf(entrada.readLine());
 *                                                             para que tome el valor por teclado ingresado por el usuario
 *                                                              y se pueda ejecutar el siguiente println (no le asignamos
 *                                                              un valor antes de imprimirlo por pantalla y tampoco estamos
 *                                                              pidiendo valores por teclado por lo que "entrada" tampoco esta
 *                                                               tomando valores por teclado.) 
 *              System.out.println ("Nro ingresado: " + entero);
 *      }
 *      catch (Exception exc ) {
 *              System.out.println(exc);
 *      }
 *    }
 * }
 */

