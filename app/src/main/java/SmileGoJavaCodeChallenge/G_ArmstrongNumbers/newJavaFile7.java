/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SmileGoJavaCodeChallenge.G_ArmstrongNumbers;

import java.util.Scanner;

/**
 *
 * @author Filipe
 */
public class newJavaFile7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("Digite um número: ");
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        double soma = 0;
        int resto;
        int i = n;
        String numeros = Integer.toString(i);
        System.out.println(numeros.length());

        while (n != 0) {
            resto = n % 10;
            System.out.println(resto);
            soma = soma + Math.pow(resto, numeros.length());
            System.out.println(soma);
            n = n / 10;
        }
        System.out.println(soma + " = " + i);
        if (soma == i) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }

    }
}
