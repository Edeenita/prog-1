package tp2.BONUS_TRACK;

/*
*   La clínica “Dolores” tiene un sistema de historias clínicas para
*   todos sus pacientes. El gerente de administración solicita emitir
*   algunos informes y elige en un menú de opciones:
*
*   a. Si la opción es ‘1’ se debe pedir ingrese la cantidad de
*   pacientes (no mayor a 15) y por cada uno solicitar la edad.
*   Informar cuántos pacientes son mayores de 78 años.
*
*   b. Si la opción es ‘2’ se debe ingresar una cantidad de
*   prestadores de servicios que tiene la clínica (no mayor a 10).
*   Por cada prestador solicitar la cantidad de pacientes que ha
*   atendido en los últimos 2 días. Finalmente, informar cuántos
*   prestadores han atendido a más de 10 pacientes en los
*   últimos 2 días.
*
*   c. Si la opción es ‘3’ se desea saber la cantidad de pacientes
*   de cada sexo y el promedio de edades de cada grupo. Para
*   ello deberá solicitar primero que ingrese qué cantidad son
*   femeninos (no mayor a 10) y qué cantidad son masculinos
*   (no mayor a 10). Por cada grupo solicitar el ingreso de las
*   edades para luego informar los promedios correspondientes.
*
*   d. Por último, si la opción es ‘4’ se desea conocer cuántos
*   pacientes no tienen obra social. Para ello se debe solicitar la
*   cantidad de pacientes (no mayor a 15) y por cada uno
*   solicitar si tiene o no obra social. Puede suponer un valor
*   numérico para verdadero y otro para falso.,

*   e. Cualquier otra opción se debe informar que “No es una
*   opción válida” y debe volver a pedirla. Con ‘0’ termina.
*
*   Escribir un programa que permita obtener al gerente de
*   administración los informes que necesita.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bonus_track1 {
    public static void main(String[] args) {
        int menu;

        // variables punto A:
        int pacientes_a;
        int edad;
        int contador_edad = 0;

        // variables punto B:
        int prestador;
        int pacientes_b;
        int contador_pacientes = 0;

        // variables punto C:
        int fem;
        int masc;
        int edad_fem, edad_masc;
        int suma_edad_fem = 0, suma_edad_masc = 0;
        int contador_edad_fem = 0;
        int contador_edad_masc = 0;
        //luego se aclara para que se usan:
        double promedio_fem;
        double promedio_masc;

        //variables punto D:
        int pacientes_d;
        int obra_social;
        int sumador_obra_social = 0;
        int sin_obra_social = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("Ingrese [1] para ingresar la cantidad de pacientes mayores de 78. \nIngrese [2] para prestadores de servicios. \nIngrese [3] para informar sobre edad y sexo de los pacientes. \nIngrese [4] para saber cuantos pacientes no tienen obra social.");
            menu = Integer.valueOf(entrada.readLine());

            while (menu != 0) {
                if (menu >= 1 && menu <= 4) {
                    switch (menu) {
                        case 1: //PUNTO A
                            System.out.println("Ingrese la cantidad de pacientes: ");
                            pacientes_a = Integer.valueOf(entrada.readLine());
                            if (pacientes_a >= 1 && pacientes_a <= 10) {
                                int MAX_a = pacientes_a;
                                for(int a = 1; a <= MAX_a; a++ ){
                                    System.out.println("Ingrese la edad del paciente: ");
                                    edad = Integer.valueOf(entrada.readLine());
                                    if (edad > 78) {
                                        contador_edad++;
                                    }
                                }
                            }else{
                                System.out.println("El maximo son [15] pacientes.");
                            }
                            System.out.println("La cantidad de pacientes mayores a 78 años son: " + contador_edad);

                            menu = 0;
                        break;
                    
                        case 2: //PUNTO B
                            System.out.println("Ingrese la cantidad prestadores en la clinica ");
                            prestador = Integer.valueOf(entrada.readLine());
                            if (prestador >= 1 && prestador <= 10) {
                                int MAX_b = prestador;
                                for (int b = 1; b <= MAX_b; b++){
                                    System.out.println("Ingrese la cantidad de pacientes atendidos por el prestador: ");
                                    pacientes_b = Integer.valueOf(entrada.readLine());
                                    if (pacientes_b > 10) {
                                        contador_pacientes++;
                                    }
                                }
                            }else{
                                System.out.println("El maximo son [10] prestadores.");
                            }
                            System.out.println("La cantidad de prestadores que atendieron más de 10 pacientes son: " + contador_pacientes);

                            menu = 0;
                        break;

                        case 3: //PUNTO C
                            System.out.println("Ingrese la cantidad de personas del sexo femenino: ");
                            fem = Integer.valueOf(entrada.readLine());
                            if ((fem >= 0 && fem <= 10) ) {
                                int MAX_c_fem = fem;
                                int promedio_edad_fem = 0;
                                for (int c_fem = 1; c_fem <= MAX_c_fem; c_fem++){
                                    System.out.println("Ingrese las edades de cada paciente femenina");
                                    edad_fem = Integer.valueOf(entrada.readLine());
                                    suma_edad_fem += edad_fem;
                                    contador_edad_fem++;
                                }
                                promedio_edad_fem = suma_edad_fem / contador_edad_fem;
                                System.out.println("Ingrese la cantidad de personas del sexo masculino: ");
                                masc = Integer.valueOf(entrada.readLine());
                                if ((masc >=0 && masc <= 10)) {
                                    int MAX_c_masc = masc;
                                    int promedio_edad_masc = 0;
                                    for (int c_masc = 1; c_masc <= MAX_c_masc; c_masc++){
                                        System.out.println("Ingrese las edades de cada paciente masculino");
                                        edad_masc = Integer.valueOf(entrada.readLine());
                                        suma_edad_masc += edad_masc;
                                        contador_edad_masc++;
                                        
                                    }
                                    promedio_edad_masc = suma_edad_masc / contador_edad_masc;
                                    System.out.println("El promedio de edad femenino es: " + promedio_edad_fem + "\nEl promedio de edad masculino es: " + promedio_edad_masc);
                                }else {
                                    System.out.println("No ha ingresado una cantidad de personas valida el rango es de [0] a [10]");
                                }
                                
                                //Me equivoque de consgina pero como quedo bonito lo dejo.
                                double total_personas = fem + masc;
                                promedio_fem =  fem / total_personas * 100;
                                promedio_masc =  masc / total_personas * 100;
                                System.out.println("El promedio de pacientes femeninos es: " + promedio_fem + "%" + "\nEl promedio de pacientes masculinos es: " + promedio_masc + "%");


                            } else {
                                System.out.println("No ha ingresado una cantidad de personas valida el rango es de [0] a [10]");
                            }
                            menu = 0;
                        break;

                        case 4: // PUNTO D
                            System.out.println("Ingrese la cantidad de pacientes");
                            pacientes_d = Integer.valueOf(entrada.readLine());
                            if (pacientes_d >= 0 && pacientes_d <= 15) {
                                int MAX_d = pacientes_d;
                                for(int d = 1; d <= MAX_d; d++){
                                    System.out.println("Ingrese [1] si tiene obra social, de lo contrario ingrese [2]");
                                    obra_social = Integer.valueOf(entrada.readLine());
                                    if (obra_social == 1) {
                                        sumador_obra_social++;
                                    } else if (obra_social == 2){
                                        sin_obra_social++;
                                    } else {
                                        System.out.println("Ha ingresado un valor erroneo");
                                        d = MAX_d;
                                    }
                                }
                                System.out.println("La cantidad de pacientes con obra social es: " + sumador_obra_social + "\nLa cantidad de pacientes sin obra social es: " + sin_obra_social);
                                menu = 0;
                            } else {
                                System.out.println("El limite de pacientes es de [0] a [15].");
                            }
                        break;
                        default: System.out.println("Fatal error"); break;
                    }
                } else if (menu != 0) {
                    System.out.println("No es una opción valida. \nIngrese [1] para ingresar la cantidad de pacientes mayores de 78. \nIngrese [2] para prestadores de servicios. \nIngrese [3] para informar sobre edad y sexo de los pacientes. \nIngrese [4] para saber cuantos pacientes no tienen obra social.");
                    menu = Integer.valueOf(entrada.readLine());
                } 
            }
            System.out.println("Ha salido del programa.");
        } catch (Exception e) {
            System.out.println(e);
        }

        
    }
}
