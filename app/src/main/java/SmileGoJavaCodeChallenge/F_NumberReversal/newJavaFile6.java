/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SmileGoJavaCodeChallenge.F_NumberReversal;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Filipe
 */
public class newJavaFile6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a seguir o número a ser invertido: ");

        // usar , no lugar de .
        double numero = leitor.nextDouble();

        DecimalFormat format = new DecimalFormat("####.##");

        String h = String.valueOf(numero);

        String z = h.replace("", "");

        String numeroInvertido = "";

        String n[] = z.split("");

        int qtdNumero = (int) Math.ceil(numero);
        String toString = Integer.toString(qtdNumero);

        for (int j = n.length - 1; j >= 0; j--) {
            numeroInvertido = numeroInvertido.concat(n[j]);

        }

        double multiplica = 0.01;
        int soma = 0;
        int multiplica2 = 1;

        while (qtdNumero != numero) {

            if (toString.length() == soma) {
                double v = Double.parseDouble(numeroInvertido) * multiplica;
                String i = format.format(v);
                numeroInvertido = i.replace(",", ".");
                break;
            }
            soma++;
            multiplica *= 10;
        }

        while (qtdNumero == numero) {
            if (toString.length() == soma) {
                double v = Double.parseDouble(numeroInvertido) * multiplica2;
                String i = format.format(v);
                numeroInvertido = i.replace(",", ".");
                break;
            }

            soma++;
            multiplica2 *= 10;

        }

        System.out.println(numeroInvertido);

    }
}
