/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SmileGoJavaCodeChallenge.E_Pangrams;

import java.util.Scanner;

/**
 *
 * @author Filipe
 */
public class newJavaFile5 {
    static boolean isPanagrama(int qtd[], String string) {
        int n = 0;

        boolean[] ocorrencia = new boolean[26];

        for (int i = 0; i < 26; i++)
            ocorrencia[i] = false;

        for (int i = 0; i < string.length(); i++)
            ocorrencia[string.charAt(i) - 'a'] = true;

        for (int i = 0; i < 26; i++) {
            if (ocorrencia[i] == false)
                n += qtd[i];

        }

        return (n == 0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva uma frase: ");
        String str = leitor.nextLine();

        int qtd[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26 };

        String string = str.toLowerCase().replaceAll("\\s+", "");

        System.out.println(isPanagrama(qtd, string));
    }
}
