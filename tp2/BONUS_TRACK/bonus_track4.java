package tp2.BONUS_TRACK;

/*
Implementar el juego “falso BlackJack”. Este juego consiste en
dos etapas. En la primera etapa juega el usuario (jugador). Para
ello, el juego genera números aleatorios enteros entre 1 y 10.
Cada número se va acumulando hasta que el usuario se planta
(en cada iteración el sistema debe preguntarle al usuario si quiere
seguir sacando números). La etapa del jugador continúa hasta
que se plante ó la suma de los números obtenidos supere 21. Si el
jugador superó los 21 pierde el juego, en caso contrario continúa
la etapa de la banca (la computadora). La computadora genera
números aleatorios para sí misma hasta que la acumulación sea
mayor a 16 o supere los 21. Si la banca supera los 21, gana el
jugador, en caso contrario gana quien obtuvo el puntaje mayor (si
ambos terminan con el mismo puntaje, hay empate). 
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bonus_track4 {
    public static void main(String[] args) {
        //para usuario
        int num_user = ((int)(Math.random() * 10)) + 1;
        int contador_user = num_user;
        int pedir_user;
        int jugada;
        boolean turno_user = false;
        //para la pc
        int num_casa = ((int)(Math.random() * 10)) + 1;
        int contador_pc = num_casa;
        int pedir_pc;
        boolean turno_pc = false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Bienvenido al blackjack!: ");
            System.out.println("Las jugadas son: \n[1] Pedir carta. \n[2] Plantarse.");
            while (turno_user == false) {
                System.out.println("Su jugada es: " + contador_user + "\nIngrese una jugada: ");
                jugada = Integer.valueOf(entrada.readLine());
                if (jugada == 1 && contador_user <= 21) {
                    pedir_user = ((int)(Math.random() * 10)) + 1;
                    contador_user += pedir_user;
                    if (contador_user > 21) {
                        System.out.println("Se ha pasado de 21 ha perdido, su mano es de: " + contador_user + "\nMano de la casa: " + contador_pc);
                        turno_user = true;
                        turno_pc = true;
                    }
                } else if (jugada == 2 && contador_user <= 21) {
                    System.out.println("Se ha plantado con: " + contador_user + "\nTurno de la casa: ");
                    while (turno_pc == false) {
                        if(contador_pc <= 16){
                            pedir_pc = ((int)(Math.random() * 10)) + 1;
                            contador_pc += pedir_pc;
                            if (contador_pc > 21) {
                                System.out.println("La casa de ha pasado de 21: (" + contador_pc + ") \nUsted ha ganado!");
                                turno_pc = true;
                            }
                        } else if (contador_pc >=16 && contador_pc <=21){
                            if (contador_pc > contador_user) {
                                System.out.println("La casa gana con: " + contador_pc);
                                turno_pc = true;
                            } else if (contador_pc == contador_user) {
                                System.out.println("Empate. \nMano de la casa: " + contador_pc);
                                turno_pc = true;
                            } else {
                                System.out.println("Ha ganado! \nMano de la casa: " + contador_pc);
                                turno_pc = true;
                            }
                        }
                    }
                    turno_user = true;
                }  
                else {
                    System.out.println("No ha ingresado una jugada valida!");
                    System.out.println("Las jugadas son: \n[1] Pedir carta. \n[2] Plantarse.");
                }
            }
            System.out.println("Ha salido del programa");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
