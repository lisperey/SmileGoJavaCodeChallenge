/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SmileGoJavaCodeChallenge.C_WordSearch;

import java.util.Scanner;

/**
 *
 * @author Filipe
 */
public class newJavaFile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a frase aqui: ");
        String string = leitor.nextLine().toLowerCase();

        System.out.println("Digite a palavra que quer procurar aqui: ");
        String palavra = leitor.nextLine().toLowerCase();

        int n = string.indexOf(palavra);

        String palavras[] = string.split(" ");
        boolean palavraEmFrase = true;
        int contador = 0;

        if (n >= 0) {
            System.out.println(palavraEmFrase);
            for (int i = 0; i < palavras.length; i++) {
                if (palavras[i] != null) {
                    if (palavras[i].equals(palavra)) {
                        contador++;
                    }
                }
            }
            System.out.println("A palavra aparece " + contador + " vezes.");

        } else {
            palavraEmFrase = false;
            System.out.println(palavraEmFrase);

        }

    }
}
