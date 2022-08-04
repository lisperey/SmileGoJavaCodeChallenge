/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SmileGoJavaCodeChallenge.I_PrimeNumberChecker;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Filipe
 */
public class newJavaFile9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int primo = leitor.nextInt();

        int p = 0;

        List<Integer> nPrimos = new ArrayList<Integer>();

        for (int i = 2; i <= primo; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    p++;
                }
            }
            if (p == 2) {
                nPrimos.add(i);
            }
            p = 0;
        }

        System.out.println(nPrimos.contains(primo));

        System.out.println(nPrimos);

    }
}
