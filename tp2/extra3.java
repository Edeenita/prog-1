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

public class extra3 {
    public static void main(String[] args) {

        int numeroSecreto = (int) (Math.random() * 1000) % 100; 
        int intentos = 0;
        int numeroUsuario = -1; 

        System.out.println("Adivina el numero entre 0 y 99");   

        while (numeroUsuario != numeroSecreto) {
            
            System.out.print("Ingresa un número: ");
            numeroUsuario = Utils.leerInt();   
            intentos++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número ingresado es menor");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número ingresado es mayor");
            } else {
                System.out.println("Lo hiciste en " + intentos + " intentos.");
            }
        }
    }
}
