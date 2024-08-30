import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        System.out.println("He  hola ahoracdo!");
        // clase scanner que permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);
        // declaraciones de variables
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 15;
        int intentos = 0;
        boolean palabraAdivinada = false;
        // arreglo
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        // bucle, estructura de control tipo iterativa
        for (int index = 0; index < letrasAdivinadas.length; index++) {
            letrasAdivinadas[index] = '-';
        }
        // mientras la palabra no esté adivinada y ademas intentos sea menor a intentos
        // maximo sigue preg
        // compara cada una de las letras de la palabrea secreta con la capturada con
        // scanner
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.println(" la palabra a divinar tiene " + palabraSecreta.length()+ " letras.");

            System.out.println("Introduce una letra y pulse enter, pofa: ");
// usamos la clase scanner
            //char letra = scanner.next().charAt(0);
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int index1 = 0; index1 < palabraSecreta.length(); index1++) {
                // estructuera de control condicional

                if (letra == palabraSecreta.charAt(index1)) {
                    letrasAdivinadas[index1] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println(
                        "letra incorrecta, " + "te quedan: " + (intentosMaximos - intentos) + " intentos.");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("felicidades haz adivinado la palabra secreta:" + palabraSecreta);
            }

        }
        if (!palabraAdivinada){
            System.out.println("Lo siento! no haz adivinado la palabre secreta: " + palabraSecreta);
        }
        

        scanner.close();
    }
// 3:14:00
}