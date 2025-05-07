/*
Dado un arreglo de caracteres de tamaño MAX, hacer un
programa que implemente métodos tal que devuelva al main dos
arreglos: un arreglo con los caracteres que son letras vocales y
otro con los que son consonantes.
 */

import java.util.Random;

public class ej13 {
    public static final int MAX = 15;
    public static void main(String[] args) {
        char [] arrChar = new char[MAX];
        cargar_arreglo_aleatorio_char(arrChar);
        mostrarArray(arrChar);

        char[] arrVocales = new char[MAX];
        char[] arrConsonantes = new char[MAX];
        resolverEjercicio(arrChar, arrConsonantes, arrVocales);
        
        System.out.println("arreglo de consonantes: ");
        mostrarArray(arrConsonantes);
        System.out.println("arreglo de vocales");
        mostrarArray(arrVocales);
    }
    public static void resolverEjercicio(char [] arrChar, char [] arrConsonantes, char [] arrVocales){
        int posVocales = 0;
        int posConsonantes = 0;
        for(int i = 0; i < MAX; i++){
            if (esVocal(arrChar[i])) {
                arrVocales[posVocales] = arrChar[i];
                posVocales++;
            } else{
                arrConsonantes[posConsonantes] = arrChar[i];
                posConsonantes++;
            }
        }
    }
    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    

    public static void mostrarArray(char[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void cargar_arreglo_aleatorio_char(char [] arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
        arr[pos]=(char)(r.nextInt(26) + 'a');
        }
    }
}
