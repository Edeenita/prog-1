package tp1.BonusTrack2_Ejercicio_análisis_de_ódigo;

/*
 * Dados los siguientes enunciados y códigos, analizar y detectar los
 * errores. Justificar en cada caso.
 * a. Suponiendo dos números enteros dados, se pide imprimir:
 * 1. si ambos son positivos y el primero es múltiplo de 5 y
 * el segundo múltiplo de 7.
 * 2. si el primero es mayor a 3 veces el segundo o es
 * múltiplo del segundo.
 * 3. si el primero es menor al segundo y la suma es par
 * 
 * public class Practica_1_Bonus_4 {
 *    public static void main(String[] args){
 *      int numero1=34, numero2=67; // valores de ejemplo      
 *      boolean resultado1, resultado2, resultado3;
 * 
 *      resultado1=(numero1&&numero2 >0) && numero1/5==0 && numero2/7==0; //numero 1 y numero 2 no se pueden comprar a si mismos ya que son int
 *                                                                         // y resultado1 es un boolean (&& se usa para combinar dos expresiones booleanas, 
 *                                                                          //no para aplicar condiciones individuales a variables)
 *                                                                          // para que compile hay que hacer:
 *                                                                           // ✅numero1 >0 && numero2 >0
 *                                                                           // para declarar si un numero es multiplo de otro se utiliza %
 *                                                                           // ✅  numero1%5==0 && numero2%7==0
 *      resultado2=(numero2<3*numero1)||numero1%numero2==1;  // La primera iteración es incorrecta
 *                                                             // ✅ numero1 > 3 * numero2  
 *                                                            // y la segunda par que sean multiplos tienes que ser == 0
 *                                                              // numero1%numero2==0
 *      resultado3=numero1<numero2 && numero2+numero1%2==0; // se utiliza mal el orden de los signos primero se ejecuta el numero1%2
 *                                                          // ✅ (numero2+numero1)%2==0;
 *                                                          // faltan los parentesis en numero1 < numero 2
 *                                                          //✅ (numero1 < numero2)
 *      System.out.println ("Inciso 1: " + resultado1);
 *      System.out.println ("Inciso 2: " + resultado2);
 *      System.out.println ("Inciso 3: " + resultado3);
 */



public class ejercicio_2A {
    public static void main(String[] args){

        int numero1=34, numero2=67; // valores de ejemplo
        boolean resultado1, resultado2, resultado3;
        resultado1=(numero1 > 0 && numero2 > 0) && numero1 % 5 == 0 && numero2 % 7 == 0;
        resultado2=(numero1 > 3 * numero2)||numero1 % numero2 == 0;
        resultado3=(numero1 < numero2) && ((numero2 + numero1) % 2 == 0);
        System.out.println ("Inciso 1: " + resultado1);
        System.out.println ("Inciso 2: " + resultado2);
        System.out.println ("Inciso 3: " + resultado3);
    }
}

