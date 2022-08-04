/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SmileGoJavaCodeChallenge.B_FindTheWord;

import java.util.Scanner;

/**
 *
 * @author Filipe
 */
public class newJavaFile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a frase aqui: ");
        String string = leitor.nextLine();

        String palavras[] = string.split(" ");

        String penultimaPalavra = palavras[palavras.length - 2];

        System.out.println("A penultima palavra é: " + penultimaPalavra);

        System.out.println("Digite o número da posição da palavra aqui: ");
        int n = leitor.nextInt();

        while (n > palavras.length) {
            System.out.println("Oops.. Palavra não encontrada.");

            System.out.println("\nDigite o número da posição da palavra aqui: ");
            n = leitor.nextInt();
        }
        int x = n - 1;

        String posicaoPalavra = palavras[x];

        System.out.println(posicaoPalavra);

    }
}
