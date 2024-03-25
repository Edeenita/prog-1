package tp1.BonusTrack2_Ejercicio_análisis_de_ódigo;

/*
 * b. Suponiendo un número entero dado, se pide imprimir:
 * i. si el número está en un rango de 3 a 78, y si es
 * múltiplo de 9 o de 7.
 * ii. si el número es menor a 65 pero como mínimo 24 y es
 * impar
 * iii. si el número es negativo o positivo e impar
 * public class Practica_1_Bonus_5 {
 *      public static void main(String[] args){
 *          int numero=34; // valor de ejemplo
 *          boolean resultado1, resultado2, resultado3;
 *          resultado1=(3<numero<78) && (numero%9||%7)==0;  // la primera expresion es incorrecta, no es aplicable a prog
 *                                                          // se debe hacer en condiciones separadas
 *                                                          // ✅(numero > 3 && numero < 78)
 *                                                          // en la segunda expresion el %7 no esta resolviendose con ninguna variable
 *                                                          // el numero%9 no esta siendo resuelto aritmeticamente por lo que no devuelve un boolean
 *                                                          // (numero%9==0||numero%7==0)
 *          resultado2=(numero<65 && numero>23)&& numero%2==0; // para que un numero sea impar debemos utilizar el operador !=
 *                                                             // ✅numero % 2 != 0
 *                                                             // ademas dice al menos 24 por lo que debe ser >=
 *          resultado3=numero<0 && numero>0 || numero%2==0; // la preposicion utiliza la condicion o (||) pero en la expresion se utiliza and (&&)
 *                                                          // y faltan los parentecis por la el orden de los operadores ya que se resolveria primero el ||
 *                                                          // ✅ademas impar es numero % 2 != 0
 *          System.out.println ("Inciso i: " + resultado1);
 *          System.out.println ("Inciso ii: " + resultado2);
 *          System.out.println ("Inciso iii: " + resultado3);
 *      }
 *  }
 */
public class ejercicio_2B {
    public static void main(String[] args){
        int numero=34; // valor de ejemplo
        boolean resultado1, resultado2, resultado3;
        resultado1=(numero > 3 && numero < 78) && (numero % 9 == 0 || numero % 7 == 0);
        resultado2=(numero < 65 && numero >= 24)&& numero % 2 != 0;
        resultado3=(numero < 0 || numero > 0) || numero % 2 != 0;
        System.out.println ("Inciso i: " + resultado1);
        System.out.println ("Inciso ii: " + resultado2);
        System.out.println ("Inciso iii: " + resultado3);
        }
}
