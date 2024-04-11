package tp2.SELECTIVAS;
//d. solicite una letra e imprima si es vocal o consonante.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej1_d {
    public static void main(String[] args) {
        char letra;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese una letra del abecedario: ");
            letra = entrada.readLine().charAt(0);
            switch (letra) {
                case 'a', 'e', 'i', 'o', 'u': System.out.println("Es una vocal"); break;
            default:System.out.println("Es una consonante"); break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
