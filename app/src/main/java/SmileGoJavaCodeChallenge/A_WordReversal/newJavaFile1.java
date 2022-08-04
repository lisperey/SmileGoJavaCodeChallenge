/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SmileGoJavaCodeChallenge.A_WordReversal;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Filipe
 */
public class newJavaFile1 {

    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a frase aqui: ");
        String string = leitor.nextLine();

        String stringInvertida = "";

        String palavras[] = string.split(" ");

        String ultimaPalavra = palavras[palavras.length - 1];

        char finalPalavra = ultimaPalavra.charAt(ultimaPalavra.length() - 1);

        if (finalPalavra == '!' || finalPalavra == '?' || finalPalavra == '.') {
            String novaPalavra = " ";

            novaPalavra = ultimaPalavra.replace(finalPalavra, ' ');
            for (int i = palavras.length - 1; i >= 0; i--) {
                stringInvertida = stringInvertida.concat(palavras[i] + " ");

            }

            stringInvertida = stringInvertida.substring(1, stringInvertida.length() - 1);
            stringInvertida = stringInvertida.substring(ultimaPalavra.length());

            System.out.println("Invertida:");
            System.out.println(novaPalavra.substring(0, 1).toUpperCase().concat(novaPalavra.substring(1))
                    + stringInvertida + finalPalavra);

        } else {
            for (int i = palavras.length - 1; i >= 0; i--) {
                stringInvertida = stringInvertida.concat(palavras[i] + " ");

            }

            stringInvertida = stringInvertida.substring(0, stringInvertida.length() - 1);

            System.out.println("Invertida:");
            System.out.println(stringInvertida.substring(0, 1).toUpperCase().concat(stringInvertida.substring(1)));
        }

    }
}
