package tp2.BONUS_TRACK;
/* 
Implementar un juego de adivinación en el que la computadora
“piense” un número entre 0 y 99 (puede usar la siguiente
sentencia: int numeroSecreto = (int)(Math.random() * 1000) %
100;) y el usuario intente adivinarlo. El usuario deberá ingresar un
número por teclado y el juego deberá responder si acertó o no. En
caso de no acertar, el juego deberá indicar si el número ingresado
es menor o mayor al número secreto. Este proceso continuará
hasta que el usuario acierte. Al finalizar, el juego deberá informar
la cantidad de intentos que le llevó al jugador acertar el número.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bonus_track3 {
    public static void main(String[] args) {
        int numeroIngresar;
        int numeroSecreto = (int)(Math.random() * 1000) % 100;
        int veces_intentado = 0;
        boolean juego_finalizado = false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Intente adivinar el número entre 0 y 99!: ");
            numeroIngresar = Integer.valueOf(entrada.readLine());
            while (juego_finalizado == false ) {
                if (numeroIngresar >= 0 && numeroIngresar <= 99) {
                        if (numeroIngresar < numeroSecreto) {
                            System.out.println("El número ingresado es mayor! Intente nuevamente: ");   
                            numeroIngresar = Integer.valueOf(entrada.readLine());
                        } else if (numeroIngresar > numeroSecreto) {
                            System.out.println("El número ingresado es menor! Intente nuevamente: ");
                            numeroIngresar = Integer.valueOf(entrada.readLine());
                        } else {
                            System.out.println("Usted ha ganado!!!!!!!!!!!!!" + "\nLo ha realizado en " + veces_intentado + " veces");
                            juego_finalizado = true;
                        }
                        veces_intentado++;
                        
                    } else {
                        System.out.println("No ha ingresado un número valido intente nuevamente.");
                        numeroIngresar = Integer.valueOf(entrada.readLine());
                }
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
