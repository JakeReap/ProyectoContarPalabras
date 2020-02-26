package ejercicio.pkg3.pkg1.entornos.luis.balbas;

import java.util.Scanner;

public class InicioApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte una frase: ");
        String frase = sc.nextLine();
        System.out.println(textoCaracteresTotal(contarCaracteres(frase.toUpperCase())));
        System.out.println(textoNumeroPalabras(contarNumeroPalabras(frase.toUpperCase())));
        System.out.println(textoTodosCaracteres(contarTodosCaracteres(frase.toUpperCase())));
    }

    static int contarCaracteres(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                contador++;
            }
        }
        return contador;
    }

    static int contarNumeroPalabras(String frase) {
        int contadorPalabras = 1;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contadorPalabras++;
            }
        }
        return contadorPalabras;
    }

    static int[] contarTodosCaracteres(String frase) {
        int n = 0;
        int[] contador = new int[65536];
        char[] cadenaCaracteres = new char[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            int valor;
            cadenaCaracteres[i] = frase.charAt(n);
            n++;
            if (cadenaCaracteres[i] != ' ') {
                valor = cadenaCaracteres[i];
                contador[valor]++;

            }
        }
        return contador;
    }

    static String textoCaracteresTotal(int total) {
        return "Hay un total de: " + total + " caracteres";
    }

    static String textoNumeroPalabras(int total) {
        return "Hay un total de: " + total + " palabras";
    }

    static String textoTodosCaracteres(int[] total) {

        String frase = "";

        for (int i = 0; i < total.length; i++) {

            if (total[i] >= 1) {
                char letra = (char) i;
                frase += "El caracter \"" + letra + "\" aparece " + total[i] + " veces.\n";
            }
        }
        return frase;
    }
}
